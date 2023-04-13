import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-03-25
 * Time: 15:28
 */
@WebServlet("/showRequest")
public class ShowRequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        这里给响应的数据类型设置Content-type
        resp.setContentType("text/html");
//        定义一个StringBuilder,把这些操作api结果拼起来，统一写到响应中
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(req.getProtocol());
        stringBuilder.append("<br>");
        stringBuilder.append(req.getMethod());
        stringBuilder.append("<br>");
        stringBuilder.append(req.getRequestURI());
        stringBuilder.append("<br>");
        stringBuilder.append(req.getContextPath());
        stringBuilder.append("<br>");
        stringBuilder.append(req.getQueryString());
        stringBuilder.append("<br>");
        resp.getWriter().write(stringBuilder.toString());
        resp.getWriter().write("<br>");
//        获取header的所有键值对
        Enumeration<String> headerNames = req.getHeaderNames();
        while(headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            resp.getWriter().write(headerName+" :"+req.getHeader(headerName));
            resp.getWriter().write("<br>");
        }
    }
}
