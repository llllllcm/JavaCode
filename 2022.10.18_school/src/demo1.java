/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-18
 * Time: 9:57
 */
class Animal{
    protected String name;

    public void showName() {
        System.out.println(name);
    }
    public void cry() {
        System.out.println("不同动物的叫声是有区别的");
    }
}
class Dog extends Animal {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void showName() {
        System.out.println(name);
    }

    @Override
    public void cry() {
        System.out.println("汪汪汪");
    }
    public void swimming() {
        System.out.println("狗会游泳");
    }
}
class Cat extends Animal {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void showName() {
        System.out.println(name);
    }

    @Override
    public void cry() {
        System.out.println("汪汪汪");
    }
    public void climbUpTree() {
        System.out.println(name+"会爬树");
    }
}
public class demo1 {
    public static void main(String[] args) {
        Dog dog = new Dog("小黄狗");
        Cat cat = new Cat("小花猫");
        dog.showName();
        dog.cry();
        dog.swimming();
        cat.showName();
        cat.cry();
        cat.climbUpTree();

    }
}
