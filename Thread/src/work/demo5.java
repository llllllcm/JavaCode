package work;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-02-01
 * Time: 22:36
 */
public class demo5 {
    public static int COUNT = 0;
    public static Object locker = new Object();
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronized (locker) {
                    while (COUNT % 3 != 0) {
                        try {
                            locker.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.print(Thread.currentThread().getName());
                    COUNT++;
                    locker.notifyAll();
                }
            }
        },"A");
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronized (locker) {
                    while (COUNT % 3 != 1) {
                        try {
                            locker.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.print(Thread.currentThread().getName());
                    COUNT++;
                    locker.notifyAll();
                }
            }
        },"B");
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronized (locker) {
                    while (COUNT % 3 != 2) {
                        try {
                            locker.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName());
                    COUNT++;
                    locker.notifyAll();
                }
            }
        },"C");
        t1.start();
        t2.start();
        t3.start();

    }
}
