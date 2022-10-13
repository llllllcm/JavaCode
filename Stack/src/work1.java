/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-09-19
 * Time: 19:15
 */
class A{
    void fA(){
        System.out.println("I am A");
    }
}
class B{
    void fB(){
        System.out.println("I am B");
    }
}
class C{
    void fC(){
        System.out.println("I am C");
    }
}

public class work1 {
    public static void main(String[] args) {
        System.out.println("只需要编译我");
        A a = new A();
        B b = new B();
        a.fA();
        b.fB();
    }
}
