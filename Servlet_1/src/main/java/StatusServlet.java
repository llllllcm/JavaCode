import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-03-25
 * Time: 20:09
 */
@WebServlet("/status")
public class StatusServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setStatus(404);
//        这是返回Tomcat自带的错误界面
//        resp.sendError(404);
        String status = req.getParameter("status");
        if (status != null) {
            resp.setStatus(Integer.parseInt(status));
        }
        resp.getWriter().write("status: " + status);
    }
}
