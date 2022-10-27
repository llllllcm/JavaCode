/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-22
 * Time: 19:29
 */

//class Animal{
//        Animal(){ System.out.println("我是动物"); }
//        void  shout(){ System.out.println("动物叫"); }
//}
//class  Dog   extends   Animal{
//        void   shout(){
//                super.shout();
//                System.out.println("汪汪");
//        }
//}
//class  Cat   extends   Animal{
//        void  shout(){ System.out.println("喵喵");
//        }
//}
//public   class   Test{
//        public  static   void   main(String[] args){
//                Animal dog=new Dog();
//                Animal cat=new Cat();
//                dog.shout();
//                cat.shout();
//        }
//}
//public class Test {
//        public static void main(String[] args) {
//                new A();
//                new B();
//        }
//}
//class A {
//        public A() {
//                print();
//                System.out.println("A的构造方法");
//        }
//        public void print() {
//                System.out.println("调用A的方法");
//        }
//}
//class B extends A {
//        public B() {
//                System.out.println("B的构造方法");
//        }
//        public void print() {
//                System.out.println("调用B的方法");
//        }
//}
//class People {
//        String name;
//        public People() {
//                System.out.print(1);
//        }
//        public People(String name) {
//                System.out.print(2);
//                this.name = name;
//        }
//}
//class Child extends People {
//        People father;
//        public Child(String name) {
//                System.out.print(3);
//                this.name = name;
//                father = new People(name + ":F");
//        }
//        public Child(){
//                System.out.print(4);
//        }
//}
//public class Test{
//        public static void main(String[] args) {
//                Child child = new Child("mike");
//        }
//

//    public int age;
//
//
//    public int add(int a,int b){
//
//        try {
//            return a+b;
//        }
//        catch (Exception e) {
//            System.out.println("catch语句块");
//        }
//        finally{
//            System.out.println("finally语句块");
//            return 10;
//        }
//
//    }
//    public static void main(String argv[]){
//        Test test =new Test();
//        System.out.println("和是："+test.add(9, 34));
//    }
//}