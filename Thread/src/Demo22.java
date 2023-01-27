/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-01-23
 * Time: 23:35
 */
class MyBlockingQueue {
    private int[] items = new int[1000];
    private int head = 0;
    private int tail = 0;
    private int size = 0;

    //入队列
    public void put(int elem) throws InterruptedException {
        synchronized (this) {
            //先判断队列是否为满
            while(size >= items.length) {
                this.wait();
            }
            items[head] = elem;
            tail++;
            if(tail >= items.length) {
                tail = 0;
            }
            size++;
            this.notify();
        }
    }
    //出队列
    public Integer take() throws InterruptedException {
        synchronized (this) {
            //判断队列是否为空
            while(size == 0) {
                this.wait();
            }
            int ret = items[head];
            head++;
            if(head >= items.length) {
                head = 0;
            }
            size--;
            this.notify();
            return ret;
        }
    }
}
public class Demo22 {
    public static void main(String[] args) throws InterruptedException {
        MyBlockingQueue queue = new MyBlockingQueue();
        Thread producer = new Thread(() -> {
            int n = 1;
            while(true) {
                try {
                    queue.put(n);
                    System.out.println("生产元素"+n);
                    n++;
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread customer = new Thread(() -> {
            while(true) {
                try {
                    int n = queue.take();
                    System.out.println("消费元素"+n);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });
        producer.start();
        customer.start();
        producer.join();
        customer.join();
    }
}
