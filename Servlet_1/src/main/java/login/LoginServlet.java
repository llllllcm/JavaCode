package login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //因为这里我们主要是演示Cookie和Session，所以为了简化流程，并不将用户名和密码
        //存入到数据库中，而是直接定死。约定用户名合法为 Jay 和 Lin
        //密码合法为123。
        if(!username.equals("Jay") && !username.equals("Lin")) {
            //登录失败
            System.out.println("用户名错误");
            resp.sendRedirect("login.html");
            return;
        }
        if (!password.equals("123")) {
            //登录失败
            System.out.println("密码错误");
            resp.sendRedirect("login.html");
            return;
        }
        //登录成功
        //1.创建一个会话
        HttpSession session = req.getSession(true);
        //2.把当前的用户名保存在会话中
        //void setAttribute(String var1, Object var2);
        session.setAttribute("username",username);
        //初始情况下设置登录次数
        session.setAttribute("count",0);
        //3.重定向到主页
        resp.sendRedirect("indexServlet");
    }
}
