package polymorphism;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-18
 * Time: 15:13
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
        System.out.println(name + "正在吃饭！");
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
    public Dog(String name,int age){
        super(name, age);
    }
    public void bark(){
        System.out.println(getName()+"在汪汪");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
class Bird extends Animal{
    public String wing;
    public Bird(String name,int age){
        super(name, age);
    }
    public void fly(){
        System.out.println(getName()+"正在飞");
    }
    public void eat(){
        System.out.println(getName()+"要吃鸟粮");
    }
}
public class Test {
    public static void main3(String[] args) {
        Animal animal = new Bird("鹦鹉",2);
        Bird bird = (Bird)animal;//父类类型给子类类型了
        bird.fly();
    }

    public static void main(String[] args) {
         Animal animal = new Dog("狗子",10);
         if(animal instanceof Bird){
          Bird bird = (Bird)animal;
          bird.fly();
         }
    }
    //------------------类的调用者实现的------------------
    public static void function(Animal animal){
        animal.eat();
    }
    public static void main2(String[] args) {
        function(new Bird("小鸟",2));
        function(new Dog("小狗",1));


        //向上转型 将子类所引用的对象赋给父类。
        /*Bird bird = new Bird("鹦鹉",2);
        Animal animal = bird;*/
//        Animal animal = new Bird("鹦鹉", 2);
//        animal.eat();//动态绑定
        /*animal.fly();//发生向上转型后只能调用animal这个类的方法和变量，不能调用子类的方法和变量
        animal.wing;*/

    }

    public static void main1(String[] args) {
        Bird bird = new Bird("鹦鹉", 2);
        bird.fly();
        bird.eat();
    }
}
