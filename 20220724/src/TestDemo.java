/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-07-24
 * Time: 17:19
 */
//深浅拷贝的学习
class Person implements Cloneable{
        public int age = 10;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class TestDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
       Person person = new Person();
       Person person2 = (Person) person.clone();
    }

}
