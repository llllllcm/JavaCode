/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-09-24
 * Time: 16:13
 */
public class MyQueue {
     class Node {
        public int val;
        public Node next;
        public Node(int val){
            this.val = val;
        }
    }
     public Node head;
     public Node tail;

    /**
     * 入队操作
     * @param val
     */
     public void offer(int val) {
         Node node = new Node(val);
         if(head == null) {
             head = node;
             tail = node;
         }else {
             tail.next = node;
             tail = tail.next;
         }
     }

    /**
     * 出队操作
     * @return
     */
     public int poll() {
         if (head == null) {
             return -1;//或者抛异常
         }
         int oldVal = head.val;
         if (head.next == null) {
             head = tail = null;
         }else {
             head = head.next;
         }
         return oldVal;
     }
     //查看当前队头元素
    public int peek() {
         if(head == null) {
             return -1;
         }
         return head.val;
    }
}
