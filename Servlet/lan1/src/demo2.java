/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-03-12
 * Time: 14:58
 */

/**
 * 替换空格
 */
public class demo2 {
    //暴力破解
    public String replaceSpace(String s) {
        if(s.length() == 0 || s == null) {
            return s;
        }
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
            }else {
                sb.append("%20");
            }
        }
        return new String(sb);
    }
    public static int removeElement(int[] nums, int val) {
        int size = nums.length;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                for(int j = i+1; j < size; j++) {
                    nums[j-1] = nums[j];
                }
            }
            i--;
            size--;
        }
        return size;
    }
    public  int removeElement1(int[] nums, int val) {
        int left = 0;
        for(int right = 0; right < nums.length; right++) {
            if(val != nums[right]) {
                nums[left++] = nums[right];
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2,3,2,2};
        System.out.println(removeElement(arr,2));
        String s = new String();
        s.trim();

    }
    class Solution {
        public String reverseWords(String s) {
            s = s.trim(); // 删除首尾空格
            int j = s.length() - 1;
            int i = j;
            StringBuffer res = new StringBuffer();
            while(i >= 0) {
                while(i >= 0 && s.charAt(i) != ' ') {
                    i--;
                }
                // 搜索首个空格
                res.append(s.substring(i + 1, j + 1) + " "); // 添加单词
                while(i >= 0 && s.charAt(i) == ' '){
                    i--;
                }  // 跳过单词间空格
                j = i; // j 指向下个单词的尾字符
            }
            return res.toString().trim(); // 转化为字符串并返回
        }
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeElements(ListNode head, int val) {
        //判断链表头为空
        if(head == null) {
            return head;
        }
        //表示要删除链表的前驱
        ListNode prev = head;
        //表示要删除的链表
        ListNode cur = head.next;
        while(cur != null) {
            if(cur.val == val) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        //判断头节点是否为需要删除的元素
        if(head.val == val) {
            head = head.next;
        }
        return head;
    }

}
