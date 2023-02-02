package work;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-02-02
 * Time: 17:29
 */
class MyBlockQueue {
    private int[] items = new int[1000];
    int tail = 0;
    int head = 0;
    int size = 0;
    //入队列
    public void put(int elem) throws InterruptedException {
        synchronized (this) {
            //判断队列是否为满
            while (size >= items.length) {
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
            //判断是否为空
            while (size == 0) {
                this.wait();
            }
            int ret = items[head];
            head++;
            if (head >= items.length) {
                head = 0;
            }
            size--;
            this.notify();
            return ret;
        }
    }
}
public class demo8 {
    public static void main(String[] args) {

    }
}
