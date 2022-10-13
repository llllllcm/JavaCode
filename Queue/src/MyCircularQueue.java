/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-09-24
 * Time: 19:28
 */
public class MyCircularQueue {
    public int[] elem;
    public int usedSize;
    public int front;
    public int rear;

    public MyCircularQueue(int x) {
        this.elem = new int[x+1];
    }
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        this.elem[rear] = value;
        //这里不能简单的使用++，否则在7-->0的时候就会有问题
        rear = (rear+1) % elem.length;
        return true;
    }
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        front = (front+1) % elem.length;
        return true;
    }
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return elem[front];
    }
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        int x = (rear == 0) ? elem.length-1 : rear-1;
        return elem[x];
    }
    public boolean isEmpty() {
        return rear == front;
    }

    public boolean isFull() {
        return (rear+1) % elem.length == front;
    }
}
