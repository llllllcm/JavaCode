import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-01-22
 * Time: 17:20
 */
public class Demo18 {
    public static void main(String[] args) throws InterruptedException {
        BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>(100);
//        这里不使用offer的原因是因为这个方法不带有阻塞功能
//        blockingDeque.offer(1);
        //这里的put带有阻塞功能
        blockingDeque.put(1);
    }
}
