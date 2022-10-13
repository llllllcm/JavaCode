import javax.xml.soap.Node;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-09-18
 * Time: 22:25
 */


public class Test {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.offer(1);
        myQueue.offer(2);

    }


    public static void main2(String[] args) {
        boolean a = false;
        boolean b = true;
        boolean c = (a && b) && (!b);
        boolean result = (a & b) & (!b);


        int[] arr = {0};
        System.out.println(arr.length);
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(23);
        stack.push(34);
        stack.push(45);
        int val = stack.peek();//需要注意的是 peek是获取栈顶元素但是不删除
        System.out.println(val);
        int val2 = stack.pop();//删除栈顶元素
        System.out.println(val2);
        //删除后查看栈顶元素
        val = stack.peek();
        System.out.println(val);
        boolean flg = stack.empty();
        System.out.println(flg);
        stack.pop();
        stack.pop();
        stack.pop();
        flg = stack.empty();
        System.out.println(flg);
        int size = stack.size();
        System.out.println(size);
    }
}
