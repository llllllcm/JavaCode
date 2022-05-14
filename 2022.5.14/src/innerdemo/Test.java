package innerdemo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-14
 * Time: 20:38
 */
class OuterClass{
    public int data1 = 1;
    private int data2 = 2;
    public static int data3 = 3;

    /**
     * 实例内部类
     * 1、实例内部类当中 不能定义静态的成员变量？？
     *      *    如果定义 那么这个静态的成员应该是被final修饰的
     *      *
     *      * 2、实例内部类当中 不能定义静态的成员方法？？
     *      *    真的不能定义！
     *      *
     *        * 3、如何实例化，实例内部类？
     *      *  外部类类名.内部类     变量  = 外部类引用.new 内部类();
     *      *  OuterClass.InnerClass innerClass = out.new InnerClass();
     *      *
     *      *  4、如何访问实例内部类 和 外部类的同名的 成员变量？？OuterClass.this
     *      *     实例内部类当中 包含外部类的this。
     *      *   5、TODO：如果是同名的静态的:OuterClass.data3
     */
    public class InnerClass {
        public int data1 = 11111;

        public int data4 = 4;
        private int data5 = 5;
        //public static final int data3 = 6;

        public InnerClass() {
            System.out.println("实例内部类的构造方法！");
        }
//        public static void staticFun(){
//
//        }
        public void innerFunc() {
            System.out.println("实例内部类的普通方法");
            System.out.println(data1);
            System.out.println("外部类 "+OuterClass.this.data1);

            System.out.println(data2);
            System.out.println(data3);
            System.out.println(data4);
        }

    }

}
public class Test {
    public static void main(String[] args) {
        //    Innerclass innerclass = new InnerClass;

        OuterClass out = new OuterClass();
        OuterClass.InnerClass innerClass = out.new InnerClass();
        innerClass.innerFunc();
    }



}
