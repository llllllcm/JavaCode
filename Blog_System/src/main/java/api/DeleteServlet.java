package api;

import model.Blog;
import model.BlogDao;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-04-06
 * Time: 15:01
 */
@WebServlet("/deleteServlet")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 先判定用户的登录状态
        HttpSession session = req.getSession();
        if(session == null) {
            resp.setStatus(403);
            resp.setContentType("text/html; charset=utf8");
            resp.getWriter().write("当前用户未登录，不能进行删除操作！");
            return;
        }
        User user = (User) session.getAttribute("user");
        if(user == null) {
            resp.setStatus(403);
            resp.setContentType("text/html; charset=utf8");
            resp.getWriter().write("当前用户未登录，不能进行删除操作！");
            return;
        }

        // 2. 获取到blogId
        String blogId = req.getParameter("blogId");
        if(blogId == null) {
            resp.setStatus(404);
            resp.setContentType("text/html; charset=utf8");
            resp.getWriter().write("当前删除的blogId有误！");
            return;
        }

        // 3. 查询出该blogId对应的Blog对象
        BlogDao blogDao = new BlogDao();
        Blog blog = blogDao.selectById(Integer.parseInt(blogId));
        if(blog == null) {
            resp.setStatus(404);
            resp.setContentType("text/html; charset=utf8");
            resp.getWriter().write("当前删除的博客不存在！ blogId="+blogId);
            return;
        }

        // 4. 判定登录用户是否为文章作者
        if(blog.getUserId() != user.getUserId()) {
            // 如果不一样，则说明作者与登录用户不是一个人
            // 直接返回403
            resp.setStatus(403);
            resp.setContentType("text/html; charset=utf8");
            resp.getWriter().write("抱歉 您没有权限删除别人的文章！");
            return;
        }
        //执行删除操作
        blogDao.delete(Integer.parseInt(blogId));
        //返回重定向
        resp.sendRedirect("blog.list.html");
    }
}
