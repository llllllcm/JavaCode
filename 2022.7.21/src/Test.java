

    import sun.awt.image.ImageWatched;

import java.util.LinkedList;


    public class Test {

        public static void main(String[] args) {
            TestSingleList testSingleList1 = new TestSingleList();
            testSingleList1.addLast(12);
            testSingleList1.addLast(23);
            testSingleList1.addLast(34);
            testSingleList1.addLast(45);
            testSingleList1.display();

            testSingleList1.printList2();

            //testSingleList1.printList(testSingleList1.head);
        }

        public static void main3(String[] args) {
            //底层是一个双向链表 不是单链表
            //LinkedList<Integer> list = new LinkedList<>();
            MyLinkedList myLinkedList = new MyLinkedList();
            myLinkedList.addLast(2);
            myLinkedList.addLast(2);
            myLinkedList.addLast(2);
            myLinkedList.addLast(2);
            myLinkedList.display();
            System.out.println("+=====================");
            myLinkedList.removeAllKey(2);
            myLinkedList.display();
        }

        public static TestSingleList.ListNode mergeTwoLists
                (TestSingleList.ListNode head1, TestSingleList.ListNode head2) {
            TestSingleList.ListNode newHead = new TestSingleList.ListNode(-1);//傀儡节点 虚拟节点
            TestSingleList.ListNode tmp = newHead;

            while (head1 != null && head2 != null) {
                if(head1.val < head2.val) {
                    tmp.next = head1;
                    head1 = head1.next;
                    tmp = tmp.next;
                }else {
                    tmp.next = head2;
                    head2 = head2.next;
                    tmp = tmp.next;
                }
            }
            //1、head2 == null      2、 head1 == null
            if(head1 != null) {
                tmp.next = head1;
            }

            if(head2 != null) {
                tmp.next = head2;
            }
            return newHead.next;
        }

        public static TestSingleList.ListNode getIntersectionNode
                (TestSingleList.ListNode headA, TestSingleList.ListNode headB) {
            //1、分别求两个链表的长度
            int lenA = 0;
            int lenB = 0;
            TestSingleList.ListNode pl = headA;//pl 代表永远指向长的链表
            TestSingleList.ListNode ps = headB;//ps 代表永远指向短的链表

            while(pl != null) {
                lenA++;
                pl = pl.next;
            }

            while(ps != null) {
                lenB++;
                ps = ps.next;
            }

            pl = headA;
            ps = headB;

            int len = lenA - lenB;
            if(len < 0) {
                pl = headB;
                ps = headA;
                len = lenB-lenA;
            }
            //1. pl 代表永远指向长的链表  2. ps 代表永远指向短的链表  3. len 一定是一个正数

            while(len != 0) {
                pl = pl.next;
                len--;
            }
            //4. pl走了差值步
            //while(pl != ps && pl != null) {
            while(pl != ps) {
                pl = pl.next;
                ps = ps.next;
            }
            // if(pl == null) {
            //     return null;
            // }
            return pl;
        }

        private static void createCut (TestSingleList.ListNode head1, TestSingleList.ListNode head2) {
            head2.next = head1.next.next;
        }


        public static void main2(String[] args) {
            TestSingleList testSingleList1 = new TestSingleList();
            testSingleList1.addLast(12);
            testSingleList1.addLast(23);
            testSingleList1.addLast(34);
            testSingleList1.addLast(45);
            testSingleList1.display();


            TestSingleList testSingleList2 = new TestSingleList();
            testSingleList2.addLast(1);
            testSingleList2.addLast(3);
            testSingleList2.addLast(9);
            testSingleList2.addLast(100);
            testSingleList2.display();

            createCut(testSingleList1.head,testSingleList2.head);

            TestSingleList.ListNode ret = getIntersectionNode(testSingleList1.head,testSingleList2.head);
            System.out.println(ret.val);
        /*TestSingleList.ListNode ret =
                mergeTwoLists(testSingleList1.head,testSingleList2.head);
        testSingleList1.display(ret);*/
        }


        public static void main1(String[] args) {
            TestSingleList testSingleList = new TestSingleList();
            //testSingleList.createList();
            testSingleList.addLast(12);
            testSingleList.addLast(23);
            testSingleList.addLast(34);
            testSingleList.addLast(45);
            //testSingleList.addFirst(8);
            testSingleList.display();
            //TestSingleList.ListNode ret = testSingleList.reverseList();
            TestSingleList.ListNode ret = testSingleList.findKthToTail(13);
            System.out.println("===========================");
            System.out.println(ret.val);

        /*System.out.println(testSingleList.contains(152));
        System.out.println(testSingleList.size());*/
        }
    }

