/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-11
 * Time: 16:51
 */
class Cat{
    public void eat(Cat this) {
        System.out.println(this);
        System.out.println("hhh");
    }

}
public class demo5 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();

    }
}
