import java.util.Deque;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-09-24
 * Time: 19:01
 */
public class TestQueue {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        System.out.println(myQueue.poll());
        System.out.println(myQueue.peek());
    }
}
