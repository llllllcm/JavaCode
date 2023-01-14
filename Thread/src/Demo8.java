/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-01-05
 * Time: 16:21
 */
class MyThread2 extends Thread {
    @Override
    public void run() {
        while(true) {
            System.out.println("hello thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Demo8 {
    public static void main(String[] args) {
        MyThread2  t = new MyThread2();
//        t.start();
        t.run();
        System.out.println("main线程执行了");
    }
}
