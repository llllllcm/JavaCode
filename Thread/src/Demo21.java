import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-01-23
 * Time: 23:21
 */
public class Demo21 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
        Thread producer = new Thread(()-> {
            for (int i = 0; i < 1000; i++) {
                try {
                    System.out.println("生产的元素是"+i);
                    blockingQueue.put(i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        producer.start();
        Thread customer = new Thread(()-> {
            for (int i = 0; i < 1000; i++) {
                try {
                    int value = blockingQueue.take();
                    System.out.println("消费者元素是"+value);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        customer.start();
        producer.join();
        customer.join();
    }
}
