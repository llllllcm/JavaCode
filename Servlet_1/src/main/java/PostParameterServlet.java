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
 * Time: 16:44
 */
@WebServlet("/postParameter")
public class PostParameterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String studentId = req.getParameter("studentId");
        String classId = req.getParameter("classId");
        resp.setContentType("text/html");
        resp.getWriter().write("studentId: "+studentId+" "+"class" +
                "Id: "+classId);
    }
}
