/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-02-27
 * Time: 16:12
 */
abstract class Animal {
    public abstract void shout();
}
class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("小狗汪汪叫");
    }
}
class Cat extends Animal{
    @Override
    public void shout() {
        System.out.println("小猫喵喵叫")；
    }
}
public class Main{
    public static void main(String[] args) {
        Animal b = new Dog();
        b.shout();
        Animal a = new Cat();
        a.shout();
    }
}
