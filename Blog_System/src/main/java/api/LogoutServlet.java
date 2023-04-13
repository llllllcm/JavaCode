package api;

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
 * Date: 2023-04-05
 * Time: 17:19
 */
@WebServlet("/logoutServlet")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession(false);
        if(httpSession == null) {
            //未登录状态就直接提示出错
            resp.setContentType("text/html; charset=utf8");
            resp.getWriter().write("当前未登录");
            return;
        }
        httpSession.removeAttribute("user");
        resp.sendRedirect("login.html");
    }
}
