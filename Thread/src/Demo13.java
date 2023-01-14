import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-01-12
 * Time: 20:50
 */
class Counter {
    public static volatile int count = 0;
    static Object locker = new Object();
    public  void increase() {
        synchronized(Counter.class) {
            count++;
        }
    }
    public void increase2() {
        synchronized (this) {
            count++;
        }
    }
    public  synchronized void increase3() {
        synchronized (this) {
            //.....
        }
    }
}

public class Demo13 {
    static Counter counter = new Counter();
    static Counter counter2 = new Counter();
    static int a = 0;
    public void func() {
        a = 3;
    }
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            while(Counter.count == 0 ) {

            }
            a = 5;
            System.out.println("t1线程执行结束");
        });
        Thread t2 = new Thread(() -> {
            System.out.println("请输入一个int：");
            Scanner scanner = new Scanner(System.in);
            Counter.count = scanner.nextInt();
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
//        System.out.println(counter.count);
//        System.out.println(counter2.count);
    }
}
