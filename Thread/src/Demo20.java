import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-01-23
 * Time: 23:07
 */
public class Demo20 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>(1000);
        //带有阻塞功能的入队列
        blockingQueue.put(1);
        blockingQueue.put(2);
        blockingQueue.put(3);
        Integer ret = blockingQueue.take();
        System.out.println(ret);
        ret = blockingQueue.take();
        System.out.println(ret);
        ret = blockingQueue.take();
        System.out.println(ret);
        ret = blockingQueue.take();

    }
}
