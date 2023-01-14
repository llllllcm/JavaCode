/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-12-06
 * Time: 11:16
 */
 class MyRunable implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("hello runnable");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.getStackTrace();
            }
        }
    }
}
class A {
     Object a = new Object();

}
class B extends A {
     A a = new A();
}

public class demo3 {
    public static void main(String[] args) {
        Thread t = new Thread();
        t.start();
        while (true) {
            System.out.println("hello main");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.getStackTrace();
            }
        }
    }
}
