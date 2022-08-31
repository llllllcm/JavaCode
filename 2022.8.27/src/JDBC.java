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
 * Date: 2022-08-27
 * Time: 13:10
 */
public class JDBC {
    //通过JDBC来操作数据库
    public static void main(String[] args) throws SQLException {
        //DataSource（来自于标准库，JDBC里面的一个接口）是一个接口，实例化一个实现这个接口的类。
        //MysqlDataSource 是我们导入的jar包
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://127.0.0.1:3306/JDBC?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("030106");
        //2.让代码和数据库建立联系
        Connection connection = dataSource.getConnection();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要插入的学号: ");
        int id = scanner.nextInt();
        System.out.println("请输入要插入的学生姓名: ");
        String name = scanner.next();
//        System.out.println(connection);
        //3.构造要执行的SQL语句
//        String sql = "insert into student values(1,'张三')";
        String sql = "insert into student values(?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,id);
        statement.setString(2,name);
        System.out.println("statement: "+statement);
        //4.执行sql
        //  执行方法有两个
        //  executeUpdate 对应插入删除修改语句
        //  executeQuery  对应查询语句
        int n = statement.executeUpdate();
        System.out.println("这次操作影响了"+n+"行数据");
        //5.完成之后，需要关闭释放相关的资源(关闭资源的顺序与创建资源的顺序是相反的)
        statement.close();
        connection.close();

    }
}
