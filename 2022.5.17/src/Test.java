/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-17
 * Time: 23:27
 */



    /**
     * @Author 12629
     * @Description：
     */
    class Animal {
        private String name;
        private int age;

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
            //eat();-> 也可以发生所谓的动态绑定，但是不要以后这样写代码，考试可能会考。
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

        //final : 这个方法是不能被重写的 密封方法
        protected  void eat() {
            System.out.println(name +" 正在吃饭！（Animal）");
            //return new Animal("fdsa",1);
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

        public void bark() {
            System.out.println(getName()+" 汪汪汪！");
        }

        @Override
        protected void eat() {
            System.out.println(getName()+" 正在吃狗粮！");
        }
    }
    class Bird extends Animal {

        public String wing;

        public Bird(String name, int age) {
            super(name, age);
        }
        public void fly() {
            System.out.println(getName()+" 正在飞！");
        }
        @Override
        public void eat() {
            System.out.println(getName()+" 要吃鸟粮！");
        }
    }
    public class Test {

        public static void main(String[] args) {
            //Animal animal = new Animal("动物",10);
            Dog animal = new Dog("狗子",10);

        }

        public static void main7(String[] args) {
            Animal animal = new Animal("狗子",10);
            Bird bird = (Bird) animal;
        }

        public static void main5(String[] args) {
            Animal animal = new Dog("狗子",10);
            //animal 是不是引用了Bird这个对象
            if(animal instanceof Bird) {
                //不是所有的动物都是鸟
                Bird bird = (Bird)animal;
                bird.fly();
            }
        }

        public static void main6(String[] args) {
            Animal animal = new Bird("鹦鹉",2);
            if(animal instanceof Bird) {
                Bird bird = (Bird) animal;//向下转型
                bird.fly();
            }
        }

        //-------------------类的调用者实现的-------------------
        public static void function(Animal animal) {
            animal.eat();
        }

        public static void main4(String[] args) {
            function(new Bird("小鸟",1));
            function(new Dog("狗子",1));
        }

        public static Animal func() {
            return new Bird("鹦鹉",2);
        }

        public static void main3(String[] args) {
            Bird bird = new Bird("鹦鹉",2);
            function(bird);

        }

        public static void main2(String[] args) {
        /*Bird bird = new Bird("鹦鹉",2);
        Animal animal = bird;*/
            //父类引用  引用了子类的对象
            Animal animal = new Bird("鹦鹉",2);
        /*animal.fly();//不可以调用了,此时通过父类引用 只能调用自己特有的方法，不可以调用子类的方法
        animal.wing;*/
            animal.eat();//动态绑定
        }

        public static void add(int a) {

        }

        public static void add(int a,int b) {

        }

        public static void main1(String[] args) {
            //静态绑定的：编译的时候 就确定了最终要调用的方法
            add(10);
            add(1,2);


            Bird bird = new Bird("鹦鹉",2);
            bird.fly();
            bird.eat();
        }
    }


