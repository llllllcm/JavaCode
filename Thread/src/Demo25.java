import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-01-28
 * Time: 21:10
 */
class MyThreadPool {
    private BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();

    public void submit(Runnable runnable) throws InterruptedException {
        queue.put(runnable);
    }

    public MyThreadPool(int m) {
        //在构造方法中，创建出M个线程，负责完成工作。
        for (int i = 0; i < m; i++) {
            Thread t = new Thread(() -> {
                while(true) {
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
public class Demo25 {
    public static void main(String[] args) throws InterruptedException {
        MyThreadPool pool = new MyThreadPool(10);
        for (int i = 0; i < 1000; i++) {
            int taskId = i;
            pool.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("执行当前任务"+taskId+"当前线程"+Thread.currentThread().getName());
                }
            });
        }
    }
}
