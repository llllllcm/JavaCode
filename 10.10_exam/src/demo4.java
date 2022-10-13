import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-11
 * Time: 14:47
 */

class Window {
    Window(int marker) { System.out.println("Window(" + marker + ")"); }
}
class House {

    Window w1 = new Window(1);
    House() {
        System.out.println("House()");
        w3 = new Window(33);
        Window m = new Window(11);
    }
    Window w2 = new Window(2);
    Window j = new Window(9);
    void f() {
        System.out.println("f()");
    }
    static Window w3 = new Window(3);
    public  void f1() {
    }
    public static void f2() {
    }

}
//abstract class An {
//    public int f(int a) {
//
//    }
//
//    public void f() {
//
//    }
//}

public class demo4 {
    static int a;
    public static void main(String[] args) {
        String str = "1";
        System.out.println(1==1);

        int[] arr = new int[7];
        Arrays.toString(arr);
        House house = new House();
        house.f();
    }
}
//因为static修饰的变量是随着类的加载而创建，所以即使这里写在第12行
//代码的后面，也是先执行。