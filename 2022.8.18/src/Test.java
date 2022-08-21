/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-08-18
 * Time: 15:55
 */
class OuterClass{
    public int day1 = 1;
    public int day2 = 2;
    public static int day3 = 3;
    static class InnerClass{

        public int day4 = 4;
        public static int day5 = 5;
        public OuterClass outerClass;

        public InnerClass(OuterClass outerClass){
            System.out.println("静态内部类的构造方法");
            this.outerClass = outerClass;
        }
         public  void test(){
//             OuterClass outerClass = new OuterClass();
//             System.out.println(outerClass.day1);
             System.out.println(outerClass.day1);
        }
    }
}
public class Test {
    public static void main(String[] args) {
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass(new OuterClass());
        innerClass.test();
    }
}
