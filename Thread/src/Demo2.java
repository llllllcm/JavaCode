/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-01-04
 * Time: 19:20
 */
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("hello thread");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
//通过重写Runnable 来实现创建线程

/**
 * 这样作的好处是把线程干的活和线程本身分开了，使用Runnable来专门表示”线程要完成的工作“
 */
public class Demo2 {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread t = new Thread(runnable);
        t.start();
        while (true) {
            System.out.println("hello main");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
