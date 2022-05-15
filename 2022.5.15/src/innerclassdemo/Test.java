package innerclassdemo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-15
 * Time: 14:12
 */
class OuterClass{
     public int data1 = 1;
     private int data2 = 2;
      public static int data3 = 3;

    /**
     * 静态内部类
     * 1.如何拿到静态内部类的对象
     * 2,不能在静态内部类中直接访问外部类非静态的数据成员
     */

    static class InnerClass {
          public int data4 = 4;
          private int data5 = 5;
          public static int data6 = 6;
          public OuterClass outerClass;



        @Override
        public String toString() {
            return "InnerClass{" +
                    "data4=" + data4 +
                    ", data5=" + data5 +
                    ", outerClass=" + outerClass +
                    '}';
        }

          public InnerClass(){
              System.out.println("静态内部类的构造方法");
//              this.outerClass = outerClass;
          }
          public void test(){
//              OuterClass outerClass = new OuterClass();
//              System.out.println(outerClass.data1);
//              System.out.println(outerClass.data2);
              System.out.println("test方法执行了");


          }
      }
}
public class Test {
    public static void main(String[] args) {
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        String ret = innerClass.toString();
        System.out.println(ret);
    }
}
