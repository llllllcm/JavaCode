/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-07-21
 * Time: 23:42
 */
import java.util.Stack;


public class TestSingleList {

    static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode head;//表示存储当前链表的头节点的引用

    /**
     * 通过穷举的方式 创建一个链表出来
     * 现在这样做  只是为了能够让初学者对这个结构更好的了解
     * 后期 我会改回来。
     */
    public void createList() {
        ListNode node1 = new ListNode(10);
        ListNode node2 = new ListNode(12);
        ListNode node3 = new ListNode(23);
        ListNode node4 = new ListNode(34);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        head = node1;
    }

    /**
     * 打印顺序表
     */
    public void display() {
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    /**
     * 从指定节点开始打印链表
     * @param newHead
     */
    public void display(ListNode newHead) {
        ListNode cur = newHead;
        while (cur != null) {
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        ListNode cur = head;
        while (cur != null) {
            if(cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //得到单链表的长度
    public int size(){
        ListNode cur = head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //头插法: O(1)
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        node.next = head;
        head = node;
    }

    //尾插法  O(n)
    public void addLast(int data){
        ListNode node = new ListNode(data);
        if(head == null) {
            head = node;
        }else {
            ListNode cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    private void checkIndex(int index) {
        if(index < 0 || index > size()) {
            throw new IndexNotLegalException("index位置不合法！");
        }
    }

    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        checkIndex(index);
        if(index == 0) {
            addFirst(data);
            return;
        }
        if(index == size()) {
            addLast(data);
            return;
        }
        ///说明 不是头插 不是尾插 且 index合法
        ListNode node = new ListNode(data);
        ListNode cur = findIndexSubOfOne(index);
        node.next = cur.next;
        cur.next = node;
    }

    private ListNode findIndexSubOfOne(int index) {
        ListNode cur = head;
        while (index-1 != 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key){
        //情况没处理
        if(head.val == key) {
            head = head.next;
            return;
        }
        ListNode cur = searchPrevOfKey(key);
        if(cur == null) return;
        ListNode del = cur.next;
        cur.next = del.next;
        //cur.next = cur.next.next;
    }

    /**
     * 找到关键字key的前驱
     * @param key
     * @return
     */
    private ListNode searchPrevOfKey(int key) {
        ListNode cur = this.head;
        while (cur.next != null) {
            if(cur.next.val == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    //删除所有值为key的节点
    public void removeAllKey(int key){
        if(head == null) return;
        ListNode prev = head;
        ListNode cur = head.next;
        while (cur != null) {
            if(cur.val == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        if(head.val == key) {
            head = head.next;
        }
    }

    /**
     * 清空链表
     */
    public void clear() {
        //this.head = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode curNext = cur.next;
            cur.next = null;
            cur = curNext;
        }
        head = null;
    }

    public ListNode reverseList() {
        if(head == null) return null;//说明链表是空的
        if(head.next == null) return head;//说明只有1个节点

        ListNode cur = head.next;//当前需要翻转的节点
        head.next = null;//head其实就是当前需要翻转的节点的前驱
        while (cur != null) {
            ListNode curNext = cur.next;
            cur.next = head;
            head = cur;
            cur = curNext;
        }
        return head;
    }

    public ListNode middleNode() {
        if(head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next !=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode findKthToTail(int k) {
        //1、k要进行合法性的判断
        if(k <= 0  || head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (k-1 != 0) {
            fast = fast.next;
            if(fast == null) {
                return null;//k太大了
            }
            k--;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode partition(int x) {
        ListNode bs = null;
        ListNode be = null;

        ListNode as = null;
        ListNode ae = null;

        ListNode cur = head;
        while (cur != null) {
            if(cur.val < x) {
                //插入到第1个段【尾插】
                if(bs == null) {
                    //这是第一次插入元素
                    bs = cur;
                    be = cur;
                }else {
                    be.next = cur;
                    be = be.next;
                }
            }else {
                //插入到第2个段【尾插】
                if(as == null) {
                    as = cur;
                    ae = cur;
                }else {
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }

        if(bs == null) {
            return as;
        }
        be.next = as;
        if(as != null) {
            //存在后半段
            ae.next = null;
        }
        return bs;
    }

    public boolean chkPalindrome() {
        // write code here
        if(head == null) return true;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //开始翻转
        ListNode cur = slow.next;
        while (cur != null) {
            ListNode curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //开始判断回文
        while (head != slow) {
            if(head.val != slow.val) {
                return false;
            }
            if(head.next == slow) {
                return true;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }


    public boolean hasCycle1() {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }

    public boolean hasCycle() {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                break;
            }
        }
        if(fast == null || fast.next == null) {
            return false;
        }
        return true;
    }


    public ListNode detectCycle() {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                break;
            }
        }
        if(fast == null || fast.next == null) {
            return null;
        }
        slow = head;
        while (slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }

    /**
     * 递归实现  单链表的逆序打印
     * @param head
     */
    public void printList(ListNode head) {
        if(head == null) {
            return;
        }
        if(head.next == null) {
            System.out.print(head.val+" ");
            return;
        }
        printList(head.next);
        System.out.print(head.val+" ");
    }

    /**
     * 非递归实现
     * @param
     */
    public void printList2() {
        Stack<ListNode> stack = new Stack<>();
        ListNode cur = head;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        //
        while (!stack.empty()) {
            ListNode top = stack.pop();
            System.out.print(top.val+" ");
        }
        System.out.println();
    }

}
