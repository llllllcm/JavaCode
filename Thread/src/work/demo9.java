package work;

import java.util.Timer;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-02-02
 * Time: 20:55
 */
class Task implements Comparable<Task>{
    //什么时候执行任务
    private long time;
    //要执行的任务
    private Runnable runnable;

    public Task(Runnable runnable,long delay) {
        this.runnable = runnable;
        time = delay + System.currentTimeMillis();
    }

    public long getTime() {
        return time;
    }


    public Runnable getRunnable() {
        return runnable;
    }


    @Override
    public int compareTo(Task o) {
        return (int)(this.time - o.time);
    }
}
class MyTimer {
    private BlockingQueue<Task> queue = new PriorityBlockingQueue<>();

    public void schedule(Runnable runnable,long delay) throws InterruptedException {
        Task task = new Task(runnable,delay);
        queue.put(task);
        synchronized (this) {
            this.notify();
        }
    }
    //创建一个扫描队首元素的线程，当时间到的时候就执行任务
    public MyTimer() {
        Thread t = new Thread(() -> {
            while (true) {
                synchronized (this) {
                    //取出队首元素
                    try {
                        Task task = queue.take();
                        if (task.getTime() <= System.currentTimeMillis()) {
                            //时间已经到了，执行任务
                            task.getRunnable().run();
                        }else {
                            //还没到点
                            queue.put(task);
                            //进行等待
                            this.wait(task.getTime() - System.currentTimeMillis());
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t.start();
    }
}
public class demo9 {
    public static void main(String[] args) {
        MyTimer myTimer = new MyTimer();
    }

}
