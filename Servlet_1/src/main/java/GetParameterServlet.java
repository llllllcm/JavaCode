import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-03-25
 * Time: 16:08
 */
@WebServlet("/getParameter")
public class GetParameterServlet extends HelloServlet{
//    假设前端传来的数据是classId和name
//    我们可以通过req里面的getParameter（返回的对象是String）来解决
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String classId = req.getParameter("classId");
        String name = req.getParameter("name");
        //需要注意的是这里的setContentType需要写在resp.getWriter().write()的上面
        resp.setContentType("text/html; charset=utf8");
        resp.getWriter().write("班级Id = "+classId + " 姓名 = "+name);
    }
}
