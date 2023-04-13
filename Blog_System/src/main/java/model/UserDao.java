package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * model.User: 86136
 * Date: 2023-04-02
 * Time: 16:17
 */
//针对用户表提供的基本操作
//由于前端界面没有注册和注销功能，于是我们这里就不加add和delete方法。
public class UserDao {
    //1.根据userId来查询用户信息
    public User selectById(int useId) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            //1.和数据库建立连接
            connection = DBUtil.getConnection();
            //2.构造sql
            String sql = "select * from user where userId = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,useId);
            //3.执行sql
            resultSet = preparedStatement.executeQuery();
            //4.遍历结果集合
            if (resultSet.next()) {
                User user = new User();
                user.setUserId(resultSet.getInt("userId"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(connection,preparedStatement,resultSet);
        }
        return null;
    }
    //2.根据userName 查用户的信息(登录的时候)
    public User selectByUsername(String username) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            //1.和数据库建立连接
            connection = DBUtil.getConnection();
            //2.构造sql
            String sql = "select * from user where username = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            //3.执行sql
            resultSet = preparedStatement.executeQuery();
            //4.遍历结果集合
            if (resultSet.next()) {
                User user = new User();
                user.setUserId(resultSet.getInt("userId"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(connection,preparedStatement,resultSet);
        }
        return null;
    }
}
