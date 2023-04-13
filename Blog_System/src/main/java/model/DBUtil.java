package model;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//把数据的操作进行封装
public class DBUtil {
    //创建数据库源对象，其作用是描述了要访问的数据库是啥，在哪
    private static DataSource dataSource = new MysqlDataSource();
    static {
        //使用静态代码块，针对dataSource进行初始化操作
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://127.0.0.1:3306/Blog_system?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("");
    }
    //通过这个方法建立连接
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
    //通过这个方法关闭连接
    public static void close(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) {
        if(connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (preparedStatement != null){
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
