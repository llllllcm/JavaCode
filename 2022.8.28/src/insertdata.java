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
 * Time: 14:43
 */
public class insertdata {
    public static void main(String[] args) throws SQLException {
        //DataSource 是一个接口，而MysqlDataSource是我们往项目中导入的那个jar包
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://127.0.0.1:3306/JDBC?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("030106");
        //2.让数据库和代码建立联系
        Connection connection = dataSource.getConnection();
        //3.构造要执行的sql语句
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要插入的学号");
        int id = scanner.nextInt();
        System.out.println("请输入要插入的学生姓名");
        String name = scanner.next();
        String sql = "Insert into student values(?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,id);
        statement.setString(2,name);
        System.out.println("statement:  "+statement);
        //4.执行sql
        //执行方法有两个，一个executeUpdate 对应插入删除修改语句 ，
        // executeQuery对应查询语句
        int n = statement.executeUpdate();
        System.out.println("这次操作影响了"+n+"行数据");
        //完成之后，需要释放相关资源(关闭资源的顺序与创建的资源顺序相反)
        statement.close();
        connection.close();
    }
}
