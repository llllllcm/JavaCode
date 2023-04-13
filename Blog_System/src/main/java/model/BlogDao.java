package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//针对博客表提供的基本操作，Data Access Object
public class BlogDao {
    //1.新增博客
    public void add(Blog blog) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            //1.和数据库建立连接
            connection = DBUtil.getConnection();
            //2.构造sql
            //第一个blogId是自增主键，直接设置为空，让其自增即可。
            //后续的参数需要从blog对象中获取出来，替换以下占位符。
            String sql = "insert into blog values(null,?,?,?,? )";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, blog.getTitle());
            preparedStatement.setString(2, blog.getContent());
            preparedStatement.setTimestamp(3, blog.getPostTimeStamp());
            preparedStatement.setInt(4, blog.getUserId());
            //3.执行sql
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(connection,preparedStatement,null);
        }
    }
    //2.根据博客id来查询指定博客(主要用在博客详情页中)
    public Blog selectById(int blogId) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            //1.和数据库1建立连接
            connection = DBUtil.getConnection();
            //2.构造sql
            String sql = "select * from blog where blogId = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,blogId);
            //3.执行sql
            resultSet = preparedStatement.executeQuery();
            //4.遍历结果集合，由于blogId在blog表中是唯一的(主键)
            //所以查询的结果要么只有一个，要么为空,所以我们使用if
            if (resultSet.next()) {
                Blog blog = new Blog();
                blog.setBlogId(resultSet.getInt("blogId"));
                blog.setTitle(resultSet.getString("title"));
                blog.setContent(resultSet.getString("content"));
                blog.setPostTime(resultSet.getTimestamp("postTime"));
                blog.setUserId(resultSet.getInt("userId"));
                return blog;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //5.释放资源
            DBUtil.close(connection,preparedStatement,resultSet);
        }
        return null;
    }
    //3. 直接查询出数据库中所有的博客列表(主要用在博客列表页)
    public List<Blog> selectAll() {
        List<Blog> blogs = new ArrayList<>();

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            //1.和服务器建立连接
            connection = DBUtil.getConnection();
            //2.构造sql语句
            String sql = "select * from blog order by postTime desc";
            preparedStatement = connection.prepareStatement(sql);
            //3.执行sql
            resultSet = preparedStatement.executeQuery();
            //4.遍历结果集合
            while(resultSet.next()) {
                Blog blog = new Blog();
                blog.setBlogId(resultSet.getInt("blogId"));
                blog.setTitle(resultSet.getString("title"));
                //注意这里的正文部分，由于是在博客列表页展示，于是我们需要对其内容进行截取
                String content = resultSet.getString("content");
                if(content == null) {
                    content = "";
                }
                if(content.length() >= 100) {
                    content = content.substring(0,100)+"...";
                }

                blog.setContent(content);
                blog.setPostTime(resultSet.getTimestamp("postTime"));
                blog.setUserId(resultSet.getInt("userId"));
                blogs.add(blog);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //5.关闭资源
            DBUtil.close(connection,preparedStatement,resultSet);
        }
        return blogs;
    }
    //4.删除指定博客
    public void delete(int blogId) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            //1.和数据库建立连接
            connection = DBUtil.getConnection();
            //2.构造sql语句
            String sql = "delete from blog where blogId = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,blogId);
            //3.执行sql语句
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(connection,preparedStatement,null);
        }
    }

}
