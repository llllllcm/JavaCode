/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-16
 * Time: 12:45
 */


import java.util.Locale;

    /**
     * @Author 12629
     * @Description：
     */
    class Animal {
        public String name;
        public int age;
        static {
            System.out.println("Animal的静态代码块！");
        }
        {
            System.out.println("Animal的实例代码块！");
        }
        public Animal() {
            System.out.println("Animal不带参数的构造方法！");
        }
        public Animal(String name,int age) {
            this.name = name;
            this.age = age;
        }

        public void eat() {
            System.out.println(name+"正在吃饭！");
        }
    }
    class Dog extends Animal{
        public float weight;

        static {
            System.out.println("Dog的静态代码块！");
        }

        {
            System.out.println("Dog的实例代码块！");
        }

        public Dog() {
            //super();
            this(10.5f); //这里也不可以有this()
            System.out.println("Dog不带参数的构造方法！");
        }

        public Dog(String name,int age,float weight) {
            //this(10.5); this  和 super  不能共存
            //super(name,age);//显示的调用父类的构造函数，来初始化此时子类继承过来的父类的属性
            this.weight = weight;
        }

        public Dog(float weight) {
           // super("hhh",10);
        }

        public void bark() {
            System.out.println(name+" 正在汪汪汪！");
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", weight=" + weight +
                    '}';
        }
    }


    public class inherit {

        public static void main(String[] args) {
            Dog dog = new Dog();
            System.out.println("==================");
            Dog dog2 = new Dog();

        }

    /*public static void main2(String[] args) {
        Cat cat = new Cat();
        cat.name = "mimi";
        cat.eat();
        cat.miaomiao();
    }

    public static void main1(String[] args) {
        Dog dog = new Dog();
        dog.name = "狗子";
        dog.age = 10;
        dog.weight = 48;
        dog.bark();
        dog.eat();
        System.out.println(dog);
    }*/
    }


