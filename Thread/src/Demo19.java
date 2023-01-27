import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-01-22
 * Time: 22:38
 */
//用这个类表示任务
class Task implements Comparable<Task>{
    //要执行的任务
    private Runnable runnable;
    //什么时候执行任务（是一个时间戳）
    private long time;
    public Task(Runnable runnable,long delay) {
        this.runnable = runnable;
        time = System.currentTimeMillis() + delay;
    }

    public Runnable getRunnable() {
        return runnable;
    }

    public long getTime() {
        return time;
    }


    @Override
    public int compareTo(Task o) {
        return (int) (this.time - o.time);
    }
}
class MyTimer{
    private BlockingQueue<Task> queue = new PriorityBlockingQueue<>();
    private Object locker = new Object();
    public MyTimer() {
        Thread t = new Thread(() -> {
            while(true) {
                synchronized (locker) {
                    //取出队首元素
                    try {
                        //需要注意的是，由于阻塞队列无法阻塞的取队首元素，
                        //所以得先将元素取出来才可进行判断。
                        Task task = queue.take();
                        if (task.getTime() <= System.currentTimeMillis()) {
                            //到点了执行任务。
                            task.getRunnable().run();
                        }else {
                            //还没到点，就将取出的任务放回去
                            queue.put(task);
                            //没到点就wait等待
                            locker.wait(task.getTime() - System.currentTimeMillis());
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t.start();
    }

    public void schedule(Runnable runnable,long after) throws InterruptedException {
        Task task = new Task(runnable,after);
        queue.put(task);
        synchronized (locker) {
            locker.notify();
        }
    }
}
public class Demo19 {
    public static void main(String[] args) throws InterruptedException {
        MyTimer myTimer = new MyTimer();
        myTimer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("执行任务1");
            }
        },3000);
        myTimer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("执行任务2");
            }
        },4000);
        myTimer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("执行任务3");
            }
        },5000);
        System.out.println("开始计时");
    }
}
