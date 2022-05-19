/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-19
 * Time: 0:46
 */

class B {
    public int Func() {
        System.out.print("B");
        return 0;
    }
}
class D extends B {
    @Override
    public int Func() {
        System.out.print("D");
        return 0;
    }
}
public class Test2 {
    public static void main(String[] args) {
        B a = new B();
        B b = new D();
        a.Func();
        b.Func();
    }
}
