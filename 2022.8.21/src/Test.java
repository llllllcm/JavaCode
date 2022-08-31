/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-08-21
 * Time: 14:54
 */
class Animal{
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
    public void eat(){
        System.out.println(getName()+"在吃饭");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }
    public void bark(){
        System.out.println(getName()+"在汪汪汪");
    }
    public void eat(){
        System.out.println(getName()+"吃狗粮");
    }


}
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    public void eat() {
        System.out.println(getName()+ "正在吃饭");
    }
    public void mew() {
        System.out.println(getName() + "喵喵喵~~~");
    }
}


public class Test {
        public static void main(String[] args) {
        Animal animal = new Dog("a",2);
        // animal 是不是引用了Dog这个对象。
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.bark();
        }
    }
    public static void main1(String[] args) {
//        Dog dog = new Dog("ask",1);
//        Animal animal = dog;
        //简写
        Animal animal = new Dog("小黄",6);//父类引用 引用了子类的对象。
        // animal.bark();此时访问不了Dog类的方法.因为类型是Animal

        animal.eat();
//当我们（类的调用者）编写eat这个方法时候，参数类型为 Animal (父类), 此时在该方法内部并不知道, 也不关注当前的
//animal 引用指向的是哪个类型(哪个子类)的实例. 此时 a这个引用调用 eat方法可能会有多种不同的表现(和 animal 引用的实例
//相关), 这种行为就称为 多态.



    }
}
