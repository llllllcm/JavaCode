/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-12-23
 * Time: 17:01
 */
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("hello thread ！");
    }
}
//演示多线程的基本创建方式
public class demo1 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
