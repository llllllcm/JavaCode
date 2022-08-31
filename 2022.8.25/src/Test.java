/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-08-25
 * Time: 14:27
 */
abstract class Animal{
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();
}
interface IFly{
     void fly();
}

class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"在吃猫粮");
    }
}
class Duck extends Animal implements IFly{
    public Duck(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"在吃鸭粮");
    }

    @Override
    public void fly() {
        System.out.println(getName()+"在飞");
    }
}

public class Test {
    public static void func(IFly iFly){
        iFly.fly();
    }
    public static void main(String[] args) {
        func(new Duck("小黄鸭",2));
    }
}
