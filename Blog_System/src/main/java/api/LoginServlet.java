package api;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.User;
import model.UserDao;

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
 * Date: 2023-04-04
 * Time: 19:43
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    //使用jackson所设计的核心对象，objectMapper
    private ObjectMapper objectMapper = new ObjectMapper();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置请求的编码，告诉servlet按照啥格式来理解请求
        req.setCharacterEncoding("utf8");
        //设置响应的编码，告诉servlet按照啥格式来构造响应
        resp.setContentType("text/html;charset=utf8");
        //1.读取参数中的用户名和密码
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if (username == null || "".equals(username) || password == null || "".equals(password)) {
            //登录失败
            String html = "<h3>登录失败！缺少用户名或者密码</h3>";
            resp.getWriter().write(html);
            return;
        }
        //2.读数据库，看看用户名是否存在，并且密码是否匹配
        UserDao usersDao = new UserDao();
        User user = usersDao.selectByUsername(username);
        if (user == null) {
            //用户不存在
            String html = "<h3>登录失败！用户名或密码错误</h3>";
            resp.getWriter().write(html);
            return;
        }
        if (!password.equals(user.getPassword())) {
            //密码错误
            String html = "<h3>登录失败！用户名或密码错误</h3>";
            resp.getWriter().write(html);
            return;
        }
        //3.用户密码验证通过，登录成功，接下来就创建会话，使用该会话保存用户信息
        HttpSession httpSession = req.getSession(true);
        httpSession.setAttribute("user",user);
        //4.进行重定向，跳转到博客列表页
        resp.sendRedirect("blog.list.html");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json; charset=utf8");
        //如果用户未登录，这里的会话就拿不到
        HttpSession httpSession = req.getSession(false);
        if (httpSession == null) {
            //未登录，返回一个空的user对象
            User user = new User();
            String respJson = objectMapper.writeValueAsString(user);
            resp.getWriter().write(respJson);
            return;
        }
        User user = (User) httpSession.getAttribute("user");
        if (user == null) {
            user = new User();
            String respJson = objectMapper.writeValueAsString(user);
            resp.getWriter().write(respJson);
            return;
        }
        String respJson = objectMapper.writeValueAsString(user);
        resp.getWriter().write(respJson);
    }
}
