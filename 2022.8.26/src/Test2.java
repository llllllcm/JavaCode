/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-08-26
 * Time: 22:11
 */
class Money implements Cloneable{
    public int money = 18;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable{
    public Money m = new Money();
    public int age = 10;
//需要实现克隆，不仅需要实现Cloneable接口，还需要重写clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person tmp = (Person) super.clone();
        tmp.m = (Money) this.m.clone();
        return tmp;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
public class Test2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        Person person2 = (Person) person.clone();
        System.out.println(person.m.money);
        System.out.println(person2.m.money);
        System.out.println("========================");
        person2.m.money = 9;
        System.out.println(person.m.money);
        System.out.println(person2.m.money);
    }
}
