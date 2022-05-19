package demo4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-19
 * Time: 20:35
 */
abstract class Animal{
    public String name;
    public int age;
    public Animal(String name,int age){
        this.age = age;
        this.name = name;
    }
    public abstract void eat();
}
class Dog extends Animal{
    public Dog(String name,int age){
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name+"在吃狗粮");
    }
}

class Bird extends Animal{
    public Bird(String name, int age){
        super(name, age);

}

    @Override
    public void eat() {
        System.out.println(name+"在吃鸟粮");
    }

}

public class Test {
    public static void func1(Animal animal){
        animal.eat();
    }
    public static void main(String[] args) {
        func1(new Dog("狗子",2));
        func1(new Bird("小鸟",2));

    }
}
