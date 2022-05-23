package demo6;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-21
 * Time: 17:35
 */
class Money implements Cloneable{
    public double money = 19.9;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person implements Cloneable{
    public int age = 10;
    public Money m = new Money();
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person tmp = (Person) super.clone();
        this.m = (Money)this.m.clone();
        return tmp;
//        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        Person person2 = (Person) person.clone();
        System.out.println(person.m.money);
        System.out.println(person2.m.money);
        person2.m.money = 99;
        System.out.println(person2.m.money);
        System.out.println(person.m.money);

    }

}
