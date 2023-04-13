package api;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Blog;
import model.BlogDao;
import model.User;
import model.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;
import java.util.concurrent.BlockingDeque;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * model.User: 86136
 * Date: 2023-04-02
 * Time: 20:13
 */
@WebServlet("/blogServlet")
public class BlogServlet extends HttpServlet {
    private ObjectMapper objectMapper = new ObjectMapper();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BlogDao blogDao = new BlogDao();
        String blogId = req.getParameter("blogId");
        if(blogId == null) {
            //queryString 不存在，说明这次请求是在获取博客列表页
            List<Blog> blogs = blogDao.selectAll();
            //需要把blogs转成符合要求的json字符串。
            String respJson = objectMapper.writeValueAsString(blogs);
            resp.setContentType("application/json; charset=utf8");
            resp.getWriter().write(respJson);
        } else {
            // queryString 存在，说明本次请求获取的是指定 id 的博客
             Blog blog = blogDao.selectById(Integer.parseInt(blogId));

             String respJson = objectMapper.writeValueAsString(blog);
             resp.setContentType("application/json; charset=utf8");
             resp.getWriter().write(respJson);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //发布博客
        //读取请求，构造Blog对象，插入到数据库中即可
        HttpSession httpSession = req.getSession(false);
        if (httpSession == null) {
            resp.setContentType("text/html; charset=utf8");
            resp.getWriter().write("当前未登录");
            return;
        }
        User user = (User) httpSession.getAttribute("user");
        if (user == null) {
            resp.setContentType("text/html; charset=utf8");
            resp.getWriter().write("当前未登录，无法发布博客");
            return;
        }
        //确保登录之后，信息就可以拿到了

        //获取博客的正文
        req.setCharacterEncoding("utf8");
        String title = req.getParameter("title");
        String content = req.getParameter("content");
        if (title == null || "".equals(title) || content == null || "".equals(content)) {
            resp.setContentType("text/html; charset=utf8");
            resp.getWriter().write("当前提交数据有误，标题或者正文为空");
            return;
        }
        //构造Blog对象
        Blog blog = new Blog();
        blog.setTitle(title);
        blog.setContent(content);
        blog.setUserId(user.getUserId());
        //发布时间
        blog.setPostTime(new Timestamp(System.currentTimeMillis()));
        //插入数据库
        BlogDao blogDao = new BlogDao();
        blogDao.add(blog);
        //跳转到博客列表页面
        resp.sendRedirect("blog.list.html");
    }
}
