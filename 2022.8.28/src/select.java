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
 * Date: 2022-08-28
 * Time: 17:23
 */
public class select {
    public static void main(String[] args) throws SQLException {
        // 1.创建数据源
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://127.0.0.1:3306/JDBC?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("030106");
        // 2 建立连接
        Connection connection = dataSource.getConnection();

        // 3.构造SQL
        String sql = "select * from student";
        PreparedStatement statement = connection.prepareStatement(sql);
        // 4.执行sql
        //executeQuery 返回的结果是ResultSet,结果集，里面是一个”表“这样的数据结构
        ResultSet resultSet = statement.executeQuery();
        // 5. 遍历结果集合
        while (resultSet.next()){
            //每次循环，就能够获取到resultSet中的一行，进一步就可以拿到每一列。
            int id = resultSet.getInt("id");//”“里面填写的是列名
            String name = resultSet.getString("name");
            System.out.println("id = "+id+", name = "+name);
        }
        // 6，相关资源的释放
        resultSet.close();
        statement.close();
        connection.close();
    }
}
