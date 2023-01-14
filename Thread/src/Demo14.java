/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-01-14
 * Time: 22:01
 */
class Count {
    int count = 0;
    public synchronized void increase() {
        count++;
    }
}
public class Demo14 {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Thread t1 = new Thread(()-> {
            for (int i = 0; i < 5_0000; i++) {
                count.increase();
            }
        });
        Thread t2 = new Thread(()-> {
            for (int i = 0; i < 5_0000; i++) {
                count.increase();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count.count);

    }
}
