import sun.awt.datatransfer.DataTransferer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-09-07
 * Time: 16:05
 */
class Node{
    public Node next;
    public int val;
    public Node(int val){
        this.val = val;
    }
}
public class TestLinkedList {
    public Node head;

    /**
     * 通过穷举的方法先建立简单的链表
     */
    public void createList() {
        Node node1 = new Node(13);
        Node node2 = new Node(23);
        Node node3 = new Node(33);
        Node node4 = new Node(43);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        head = node1;
    }
    //打印链表
    public void display() {
        //定义一个临时变量代替head
        Node cur = this.head;
        while (cur!= null) {
            System.out.print(cur.val + "  ");
            cur = cur.next;
        }
        System.out.println();
    }
    //头插法 时间复杂度O(1)
    public void addFirst(int data) {
        Node cur = new Node(data);
        cur.next = head;
        head = cur;

    }
    //尾插法 时间复杂度O(n)
    public void addLast(int data) {
        Node node = new Node(data);
        //如果没有判空 会引发空指针异常(cur被赋为空，又让cur调用next，引发了空指针异常)
        if(head == null) {
            head = node;
        }else {
            Node cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }


    }
    public void checkIndex(int index) {
        if (index < 0 || index > size()) {
            throw new IndexNotLegalException("插入位置错误");
        }
    }
    public Node checkLastIndex(int index) {
        Node cur = this.head;
        while (index-1 != 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }
//        任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        //插入时候需要考虑到插入位置的合法性，ps：链表无下标，这里的下标其实是假想出来的
        checkIndex(index);
        if (index == size()) {
            addLast(data);
            return;
        }else if (index == 0) {
            addFirst(data);
            return;
        }
        Node node = new Node(data);
        //调用方法 找到插入位置的前一个结点
        Node cur = checkLastIndex(index);
        node.next = cur.next;
        cur.next = node;

    }

    public boolean contains(int key) {

        Node cur = this.head;
        while (cur != null ) {
            if(cur.val == key) {
                    return true;
            }
            cur = cur.next;
        }
        return false;

    }
    import java.util.*;

    /*
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }*/
    public class PalindromeList {
        public boolean chkPalindrome(ListNode head) {
            // write code here
            //大体思路: 1、找到中间结点
            // 2、翻转链表 3、判断回文
            if(head == null) return true;
            ListNode slow = head;
            ListNode fast = head;
            // 找到中间结点
            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            //翻转链表
            ListNode cur = slow.next;
            while(cur != null) {
                ListNode curNext = cur.next;
                cur.next = slow;
                slow = cur;
                cur = curNext;
            }
            //判断回文
            while(head != slow) {
                if(head.val == slow.val) {
                    head = head.next;
                    slow = slow.next;
                }else if(head.next == slow){
                    return true;
                }else {
                    return false;
                }
            }
            return true;
        }
    }
    //删除第一次出现关键字为key的节点
    //删除结点的话 其核心其实就是将这个结点的前驱 修改为其他结点的地址
//    public Node checkKeyIndex(int key) {
//        Node cur = this.head;
//        //这里需要使用cur.next 来判断 因为 如果让cur来判断的话 cur最终会遍历完这个链表
//        //后续在判断cur.next.val == key时会造成空指针异常
//        while(cur.next != null) {
//            //判断下一个的值是不是要找的值，是的话 放回这个值所对应结点的前驱
//            if(cur.next.val == key) {
//                return cur;
//            }
//            cur = cur.next;
//        }
//        return null;
//    }
    public Node checkKeyIndex(int key) {
        Node cur = head;
        //这里使用cur.next 是为了避免空指针访问异常
        while(cur.next != null) {
             if(cur.next.val == key) {
                 return cur;
             }
        }
        return null;

    }
    public void remove(int key) {
        // 判断头的数据域是否为需要寻找的值
        if(head.val == key) {
            head = head.next;
            return;
        }
        Node prevDel = checkKeyIndex(key);
        if(prevDel == null) {
            System.out.println("找不到这个元素");
        }
        Node del = prevDel.next;
        prevDel.next = del.next;
        //上两行代码也可以用这行替换： prevDel = prevDel.next.next;
    }









//    public void remove(int key) {
//        if(head.val == key) {
//            head = head.next;
//            return;
//        }
//        Node cur = checkKeyIndex(key);
//        if (cur == null) {
//            System.out.println("找不到这个关键字");
//        }
//        Node del = cur.next;
//        cur.next = del.next; //这时因为这个要删除的元素没有被引用，所以被自动释放了。
//        //或者写为 : cur.next = cur.next.next;
//
//    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
        Node cur = head.next;
        Node prev = head;
        //这时只能是cur ！= null 作为判断条件 因为如果是在只有一个头节点的情况下
        //: cur.next != null 这个条件会引发空指针异常
        while (cur != null) {
            if(cur.val == key) {
                prev.next = cur.next;
            }else {
                 prev = cur;
            }
            cur = cur.next;
        }
        //如果是放在前面的话 就会存在出现新的头结点的情况()
        if(head.val == key) {
            head = head.next;
        }
    }
    //得到单链表的长度
    public int size() {
        Node cur = this.head;
        int count = 0;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    /**
     * 清空数据
     */
    public void clear() {

    }

    public static void main(String[] args) {
        TestLinkedList testLinkedList = new TestLinkedList();
//        testLinkedList.addFirst(1);
//        testLinkedList.addFirst(2);
        System.out.println("====================");
        testLinkedList.addLast(1);
        testLinkedList.addLast(2);
        testLinkedList.addLast(33);
        testLinkedList.addIndex(1,33);

        testLinkedList.removeAllKey(33);
        testLinkedList.display();
        System.out.println(testLinkedList.size());
        System.out.println(testLinkedList.contains(33));

    }

}
