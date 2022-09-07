/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-09-04
 * Time: 11:00
 */
class B implements A{
    int a = 4;

    @Override
    public void func() {
        System.out.println(a);
    }
}
class C{
    int a = 10;
}
class D extends C{
    int a = 12;
}
public class Test {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.a);
        C c = new D();
        System.out.println(c.a);
    }
}
