package innerdemo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-08-18
 * Time: 11:34
 */
//外部类
class OuterClasses{
    public int day1 = 1;
    public int day2 = 2;
    public static int month = 3;

//实例内部类
    class InnerClass{
        public int day1 = 3;
        public int dau3 = 4;
        public static final int day4 = 4;
    public void func(){
        System.out.println(day1);
        System.out.println("外部类;   "+OuterClasses.this.day1);
        System.out.println("外部类静态变量：  "+OuterClasses.month);
        System.out.println("内部类静态变量：  "+day4);
    }
//        public InnerClass(){
//            System.out.println("实例内部类的构造方法");
//
//        }
//
////        public static void staticFunc(){
////
////        }

    }
}
public class Test {
    public static void main(String[] args) {
//        OuterClasses out = new OuterClasses();
//        OuterClasses.InnerClass innerClass = out.new InnerClass();

        OuterClasses.InnerClass innerClass = new OuterClasses().new InnerClass();
        innerClass.func();


    }
}
