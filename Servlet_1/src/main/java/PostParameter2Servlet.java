import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-03-25
 * Time: 17:32
 */
class Student {
    public int studentId;
    public int classId;
}
@WebServlet("/postParameter2")
public class PostParameter2Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //通过这个方法来处理Body为json格式的数据
        //直接把req对象里的body完整的读取出来
        //可以通过getInputStream
        //这个方法读取的内容是流对象，那么如何控制流对象读取多少个字节呢
        //取决于 Content-length
//        int length = req.getContentLength();
//        byte[] bytes = new byte[length];
//
//        InputStream inputStream = req.getInputStream();
//        //往这个数组里面传入流对象
//        inputStream.read(bytes);
//        //把这个字节数组构造成string，打印出来
//        String body = new String(bytes,0,length,"utf-8");
//        System.out.println("body = "+body);
//        resp.getWriter().write(body);
        //使用jackson所涉及到的核心对象
        ObjectMapper objectMapper = new ObjectMapper();
        //readValue就是把json格式的字符串转化成java对象
        Student student = objectMapper.readValue(req.getInputStream(),Student.class);
        System.out.println(student.studentId + " , " + student.classId);

    }
}
