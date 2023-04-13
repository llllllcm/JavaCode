import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-03-26
 * Time: 17:14
 */
class Student {
    public int classId;
    public int studentId;
}
public class TestJackson {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
//        //readValue 是把json格式的字符串转成java对象
//        String s = "{ \"classId\": 10, \"studentId\": 20 }";
//        //readValue第一个参数可以直接写成String，也可以直接写InputStream
//        Student student = objectMapper.readValue(s,Student.class);
//        System.out.println(student.classId);
//        System.out.println(student.studentId);

        //writeValue / writeValueAsString 是把java对象转成json字符串
        Student student = new Student();
        student.classId = 20;
        student.studentId = 10;
        String s = objectMapper.writeValueAsString(student);
        System.out.println(s);

    }
}
