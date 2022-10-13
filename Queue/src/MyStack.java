import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-09-25
 * Time: 10:40
 */
public class MyStack {
    public int usedSize ;
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        if(!q1.isEmpty()) {
            q1.offer(x);
        }else if(!q2.isEmpty()) {
            q2.offer(x);
        }else {
            q1.offer(x);
        }
        usedSize++;
    }

    public int pop() {
        if(empty()) {
            return -1;
        }
        int size = q1.size();
        if(!q1.isEmpty()) {
            //这里需要记录第一次size的值，因为在出队的过程中size的值会发现变化
            for(int i = 0; i < size-1; i++) {
                q2.offer(q1.poll());
            }
            usedSize--;
            return q1.poll();
        }else {
            for(int i = 0; i < size-1; i++) {
                q1.offer(q2.poll());
            }
            usedSize--;
            return q2.poll();
        }
    }
    //返回栈顶元素
    public int top() {
        if(empty()) {
            return -1;
        }
        int size = q1.size();
        int ret = -1;
        if(!q1.isEmpty()) {
            for(int i = 0; i < size; i++) {
                ret = q1.poll();
                q2.offer(ret);
            }
        }else {
            for(int i = 0; i < size; i++) {
                ret = q2.poll();
                q1.offer(ret);
            }
        }
        return ret;
    }

    public boolean empty() {
        return usedSize == 0;
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.pop());
        System.out.println(myStack.top());
    }
}
