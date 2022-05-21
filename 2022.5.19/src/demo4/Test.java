package demo4;

import sun.awt.HeadlessToolkit;

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
 interface IRunning{
    void run();
 }
 interface IFlying{
    void fly();
 }
 interface ISwimming{
    void swim();
 }
class Duck extends Animal implements IFlying,IRunning,ISwimming{
    public Duck(String name,int age){
        super(name, age);

    }

    @Override
    public void swim() {
        System.out.println(name+"正在用大脚掌游泳");
    }

    @Override
    public void eat() {
        System.out.println(name+"正在吃鸭粮");
    }

    @Override
    public void run() {
        System.out.println(name+"正在用两个鸭掌跑");
    }

    @Override
    public void fly() {
        System.out.println(name+"正在用两个翅膀飞");
    }
}
// 叫 跑 游泳
class Dog extends Animal implements IRunning,ISwimming{
    public Dog(String name,int age){
        super(name, age);
    }

    @Override
    public void run() {
        System.out.println(name+"正在四条腿跑");
    }

    @Override
    public void swim() {
        System.out.println(name+"用四条腿狗刨");
    }

    @Override
    public void eat() {
        System.out.println(name+"在吃狗粮");
    }
}
//叫 跑 飞
class Bird extends Animal implements IRunning,IFlying{
    public Bird(String name, int age){
        super(name, age);

}

    @Override
    public void fly() {
        System.out.println(name+"正在用两个翅膀飞");
    }

    @Override
    public void run() {
        System.out.println(name+"正在用两条腿跳着跑");
    }

    @Override
    public void eat() {
        System.out.println(name+"在吃鸟粮");
    }

}
class Robot implements IRunning{
    @Override
    public void run() {
        System.out.println("机器人正在跑");
    }
}
public class Test {
    public static void func1(Animal animal){
        animal.eat();
    }
    public static void walk(IRunning iRunning){
        iRunning.run();
    }
    public static void fly(IFlying iFlying){
        iFlying.fly();
    }
    public static void swim(ISwimming iSwimming){
        iSwimming.swim();
    }
    public static void main1(String[] args) {
        func1(new Dog("狗子",2));
        func1(new Bird("小鸟",2));
        func1(new Duck("唐老鸭",2));


    }

    public static void main(String[] args) {
        fly(new Bird("刘冬",2));
        fly(new Duck("唐老鸭",2));
        walk(new Robot());
    }
}
