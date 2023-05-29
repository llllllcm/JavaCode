import com.spring.demo.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class App2 {
    public static void main(String[] args) {
        //1.得到Spring上下文对象
        BeanFactory beanFactory =
                new XmlBeanFactory(new ClassPathResource("Spring-config.xml"));
        //2.从Spring容器中，获取bean对象
        Student student = (Student) beanFactory.getBean("student");
        //3.使用bean
        student.sayHi();

    }
}
