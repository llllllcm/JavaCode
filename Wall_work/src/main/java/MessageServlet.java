import com.fasterxml.jackson.databind.ObjectMapper;
import sun.security.pkcs11.Secmod;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-03-31
 * Time: 19:18
 */
class Message {
    private String from;
    private String to;
    private String message;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
@WebServlet("/messageServlet")
public class MessageServlet extends HttpServlet {
    //使用jackson所设计的核心类 ObjectMapper
    private ObjectMapper objectMapper = new ObjectMapper();

    //处理前端发来的post请求
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //把body中的内容取出来，解析成一个Message对象
        Message message = objectMapper.readValue(req.getInputStream(),Message.class);
        save(message);
        resp.setStatus(200);
    }


    //处理前端发来的get请求
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //因为需要把数据传递给浏览器，所以需要显示的告诉浏览器，数据是json格式，字符集为utf-8
        resp.setContentType("application/json; charset=utf8");
        List<Message> messageList = load();
        String jsonResp = objectMapper.writeValueAsString(messageList);
        System.out.println("jsonResp:" + jsonResp);
        //再将其写入到body中
        resp.getWriter().write(jsonResp);
    }
    //从数据库读取数据
    private List<Message> load() {
        List<Message> messageList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            //1.建立连接
            connection = DBUtil.getConnection();
            //2.构造sql
            String sql = "select * from message";
            preparedStatement = connection.prepareStatement(sql);
            //3.执行sql
            resultSet = preparedStatement.executeQuery();
            //3.遍历结果集合
            while (resultSet.next()) {
                Message message = new Message();
                message.setFrom(resultSet.getString("from"));
                message.setTo(resultSet.getString("to"));
                message.setMessage(resultSet.getString("message"));
                messageList.add(message);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //5.释放资源
            DBUtil.close(connection,preparedStatement,resultSet);
        }
        return messageList;
    }

    //往数据库存入一个数据
    private void save(Message message) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            //1.建立连接
            connection = DBUtil.getConnection();
            //2.构造sql
            String sql = "insert into message values(?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,message.getFrom());
            preparedStatement.setString(2,message.getTo());
            preparedStatement.setString(3,message.getMessage());
            //3，执行sql语句
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.close(connection,preparedStatement,null);
        }

    }
}
