import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-03-27
 * Time: 19:45
 */
//通过这个类，把数据库连接过程封装一下
//此处把这个DBUtil作为一个工具类，提供static方法供其他代码来调用
public class DBUtil {
    //静态成员跟随类对象，类对象在整个进程中是唯一的
    //静态成员相当于也是唯一的实例（单例，懒汉）
    private static DataSource dataSource = new MysqlDataSource();

    static {
        //使用静态代码块，针对dataSource进行初始化操作
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/loverwall?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("030106");
    }
    //通过这个方法请求连接
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
    //通过这个方法断开连接，释放资源
    public static void close(Connection connection, PreparedStatement statement, ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
