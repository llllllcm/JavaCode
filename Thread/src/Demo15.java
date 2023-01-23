/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-01-18
 * Time: 22:09
 */
public class Demo15 {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        //第一个线程进行wait操作
        Thread t1 = new Thread(()-> {
            while(true) {
                System.out.println("wait 之前");
                synchronized (object) {
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("wait之后");
                }
            }
        });
        t1.start();
        Thread.sleep(5000);
        Thread t2 = new Thread(()-> {
            while(true) {
                System.out.println("notify 之前");
                synchronized (object) {
                    object.notify();
                    System.out.println("notify之后");
                }
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t2.start();
    }
}
