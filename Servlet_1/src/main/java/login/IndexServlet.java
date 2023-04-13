package login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/indexServlet")
public class IndexServlet extends HttpServlet {
    //因为通过浏览器是通过重定向来发送请求的，所以以下为doGet
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //需要先判定用户的登录状态
        //如果用户没有登录，要求先登录，如果登录了，则根据 会话 中的用户名，来显示到页面上

        //这个操作不会触发会话的创建
        HttpSession session = req.getSession(false);
        if (session == null) {
            //未登录状态
            System.out.println("用户未登录");
        }
        //已经登录,取出会话信息
        String username = (String) session.getAttribute("username");
        Integer cnt = (Integer) session.getAttribute("count");
        //访问次数加1
        cnt++;
        //写回到会话中
        session.setAttribute("count",cnt);
        //构造页面
        resp.setContentType("text/html; charset=utf8");
        resp.getWriter().write("<h3>欢迎" + username + "</h3> <h4>这个页面已经被访问了"+cnt+"次</h4>");
    }
}
