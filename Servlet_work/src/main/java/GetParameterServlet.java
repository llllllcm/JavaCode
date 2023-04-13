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
 * Date: 2023-03-26
 * Time: 14:11
 */
@WebServlet("/getParameter")
public class GetParameterServlet extends HttpServlet {
    //加入前端传来的参数是classId和name
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String aa = req.getParameter("aa");
        String bb = req.getParameter("bb");
        //需要注意的是这里设置是需要写在resp.getWriter().write上面
        resp.setContentType("text/html; charset=utf8");
        resp.getWriter().write("aa = "+aa+"bb = "+bb);
    }
}
