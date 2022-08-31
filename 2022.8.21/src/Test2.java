/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-08-22
 * Time: 18:13
 */
class B {
    public B() {
        func();
    }
    public void func() {
        System.out.println("B.func()");
    }
}
class D extends B {
    //因为父类是无参的构造函数，这时子类会提供一个隐式的构造方法帮父类构造。
    private int num = 1;
    @Override
    public void func() {
        System.out.println("D.func() " + num);
    }
}
public class Test2 {
    public static void main(String[] args) {
        D d = new D();
    }
}




