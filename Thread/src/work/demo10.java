package work;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-02-02
 * Time: 22:06
 */
class MyThreadPool {
    private BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();

    public void submit(Runnable runnable) throws InterruptedException {
        queue.put(runnable);
    }
    public MyThreadPool(int m) {
        for (int i = 0; i < m; i++) {
            Thread t = new Thread(() -> {
                while (true) {
                    try {
                        Runnable runnable = queue.take();
                        runnable.run();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            t.start();
        }
    }
}
public class demo10 {
}
