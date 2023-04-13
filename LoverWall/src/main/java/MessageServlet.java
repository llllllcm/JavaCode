import com.fasterxml.jackson.databind.ObjectMapper;
import sun.plugin.javascript.navig.Link;

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


class Message {
    public String from;
    public String to;
    public String message;
}
@WebServlet("/messageServlet")
public class MessageServlet extends HttpServlet {
//    private List<Message> messageList = new ArrayList<>();

    //使用jackson所涉及到的核心的类
    private ObjectMapper objectMapper = new ObjectMapper();

    //由前端向服务器提交数据触发doPost代码
    //这里doPost所做的事情就算将传来的数据往List上面填充。
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //把body中的内容读取出来，解析成一个Message对象
        Message message = objectMapper.readValue(req.getInputStream(),Message.class);
//        messageList.add(message);
        save(message);
        //此处的状态码可以省略，不设置也是200
        resp.setStatus(200);
    }

    //由前端从服务器获取数据触发doGet代码
    //实际doGet所作的事情就是将List里面的结果返回给前端

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //显示的告诉浏览器，数据是json格式，字符集为utf8
    resp.setContentType("application/json; charset=utf8");
    //这个方法同时完成了把java对象转成json字符串和把这个字符串写到响应对象中。
        //解析：第一个参数是Writer对象，表示转成的json字符串要往哪个地方写，第二个参数表示的是要把哪个java对象转成json字符串。
//    objectMapper.writeValue(resp.getWriter(),messageList);
        //当然objectMapper.writeValue(resp.getWriter(),messageList)可能有些难以理解
        //于是我们对其进行拆分
        List<Message> messageList = load();
        String jsonResp = objectMapper.writeValueAsString(messageList);
        System.out.println("jsonResp:" + jsonResp);
        //再将其写入到body中
        resp.getWriter().write(jsonResp);
        //小结：doGet只是把messageList转成json字符串，返回给浏览器而已
    }

    //提供一个方法，往数据库中存一条信息
    private void save(Message message) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        //JDBC操作
        try {
            //1.建立连接
            connection = DBUtil.getConnection();
            //2.构造SQL语句
            String sql = "insert into message values(?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,message.from);
            preparedStatement.setString(2,message.to);
            preparedStatement.setString(3,message.message);
            //3.执行sql
            //execute.Update()方法返回是一个整数，通常用于 update，insert，delete语句
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //这里将关闭连接放置于此是为了保证关闭连接一定能够执行到
            //4.关闭连接
            DBUtil.close(connection,preparedStatement,null);
        }
    }
    //从数据库读取所有信息
    private List<Message> load() {
        List<Message> messageList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            //1.和数据库建立连接
            connection = DBUtil.getConnection();
            //2.构造SQL
            String sql = "select * from message";
            preparedStatement = connection.prepareStatement(sql);
            //3.执行sql
            //executeQuery() 方法执行后返回单个结果集，通常用于select。
            resultSet = preparedStatement.executeQuery();
            //4.遍历结果集合
            while (resultSet.next()) {
                Message message = new Message();
                message.from = resultSet.getString("from");
                message.to = resultSet.getString("to");
                message.message = resultSet.getString("message");
                messageList.add(message);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            // 5.释放资源，断开连接
            DBUtil.close(connection,preparedStatement,resultSet);
        }
        return messageList;
    }
}
