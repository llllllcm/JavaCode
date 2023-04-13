import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.print.attribute.standard.PresentationDirection;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-03-31
 * Time: 18:58
 */
//通过这个类，将数据库连接的过程进行封装
public class DBUtil {
    //静态成员跟随着类对象，类对象在整个进程中是唯一的
    //静态成员相当于也是唯一的实例(懒汉，单例)
    //创建数据库源对象，其作用是描述了要访问的数据库是啥，在哪
    private static DataSource dataSource = new MysqlDataSource();
    static {
        //使用静态代码块，针对dataSource进行初始化操作
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://127.0.0.1:3306/loverwall?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("030106");
    }
    //通过这个方法建立连接
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
    //通过这个方法断开连接，释放资源
    public static void close(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(preparedStatement != null) {
            try {
                preparedStatement.close();
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
