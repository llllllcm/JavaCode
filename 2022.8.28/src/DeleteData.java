import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-08-28
 * Time: 16:54
 */
public class DeleteData {
    public static void main(String[] args) throws SQLException {
        // 1.创建数据源
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://127.0.0.1:3306/JDBC?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setPassword("030106");
        ((MysqlDataSource)dataSource).setUser("root");
        // 2. 建立连接
        Connection connection = dataSource.getConnection();
        // 3. 构造sql
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要删除的数据");
        int id = scanner.nextInt();
        String sql = "delete from student where id = ? ";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,id);
        //4 执行sql
        int n = statement.executeUpdate();
        System.out.println("这次操作影响了"+n+"行数据");
        // 5，相关资源的释放
        statement.close();
        connection.close();
    }
}
