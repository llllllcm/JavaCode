/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-08-20
 * Time: 15:54
 */
class Animal{
    public String name;
    public int age;
    static {
        System.out.println("Animal的静态代码块");
    }
    {
        System.out.println("Animal的实例代码块");
    }

    public void eat(){
        System.out.println(name+"在吃饭");
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Animal(){
        System.out.println("Animal不带参数的构造方法");
    }
}
class Dog extends Animal{
    public int weight;

    public Dog(String name, int age,int weight) {
        super(name, age);
        this.weight = weight;
    }
    static {
        System.out.println("Dog的静态代码块");
    }
    {
        System.out.println("Dog的实例代码块");
    }
    public Dog(){
        System.out.println("Dog不带参数的构造方法");
    }

    public void bark(){
        System.out.println(name+"正在汪汪");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
//class Cat extends Animal{
//    public void mew(){
//        System.out.println(name+"正在喵喵");
//    }
//}

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("===================");
        Dog dog2 = new Dog();
    }
}
