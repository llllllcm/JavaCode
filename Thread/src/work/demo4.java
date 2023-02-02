package work;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-02-01
 * Time: 18:51
 */
public class demo4 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            System.out.println("c"+Thread.currentThread().getName());
        },"a");
        Thread t2 = new Thread(()->{
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("b"+Thread.currentThread().getName());
        },"b");
        Thread t3 = new Thread(()->{
            try {
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("a"+Thread.currentThread().getName());
        },"c");
        t1.start();
        t2.start();
        t3.start();

    }
}
