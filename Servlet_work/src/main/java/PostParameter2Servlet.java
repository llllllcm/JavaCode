import com.fasterxml.jackson.databind.ObjectMapper;

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
 * Time: 14:44
 */
class Student{
    public int classId;
    public int studentId;
}
@WebServlet("/postParameter2")
public class PostParameter2Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //用jackson所涉及的核心对象
        ObjectMapper objectMapper = new ObjectMapper();
        //readValue就是把json格式的字符串转换为java对象
        Student student = objectMapper.readValue(req.getInputStream(),Student.class);
        System.out.println(student.studentId + "  , " + student.classId);
    }
}
