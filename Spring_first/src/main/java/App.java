import com.spring.demo.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        //1.得到Spring的上下文对象，创建的时候需要配置 Spring配置 的信息
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Spring-config.xml");
        //2。从Spring容器中获取到Bean对象
           Student student = context.getBean("student",Student.class);
           Student stu = context.getBean("stu",Student.class);
        System.out.println("student == stu ->" + (stu == student));
           //3.使用Bean(非必须的)
           student.sayHi();
    }
}
