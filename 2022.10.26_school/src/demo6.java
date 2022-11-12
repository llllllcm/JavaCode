/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-11-08
 * Time: 10:57
 */
abstract class Animal {
    abstract void shout();
}
class Dog extends Animal{

    @Override
    void shout() {
        System.out.println("小狗汪汪叫");
    }
}
class Cat extends Animal {
    @Override
    void shout() {
        System.out.println("小猫喵喵叫");
    }
}
public class demo6 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.shout();
        Animal animal1 = new Cat();
        animal1.shout();

    }
}

