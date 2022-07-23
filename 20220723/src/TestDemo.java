import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-07-23
 * Time: 23:51
 */
public class TestDemo {

    /**
     * @Author 12629
     * @Description：
     */



        public static void main(String[] args) {
            Queue<Integer> myQueue = new LinkedList<>();
            myQueue.offer(1);
            myQueue.offer(2);
            myQueue.offer(3);
            //myQueue.peekFirst();
            System.out.println(myQueue.peek());//1
            System.out.println(myQueue.poll());//1
            System.out.println(myQueue.peek());//2
            Deque<Integer> myQueue2 = new LinkedList<>();
        }

        public static void main4(String[] args) {
            MyQueue myQueue = new MyQueue();
            myQueue.offer(1);
            myQueue.offer(2);
            myQueue.offer(3);
            System.out.println(myQueue.peek());//1
            System.out.println(myQueue.poll());//1
            System.out.println(myQueue.peek());//2



        }
        public boolean isValid(String s) {
            //时间复杂度O(n)  空间复杂度：O(n)
            Stack<Character> stack = new Stack<>();
            for(int i = 0; i < s.length();i++) {
                char ch = s.charAt(i);
                if(ch == '{' || ch == '(' || ch == '[') {
                    stack.push(ch);
                }else {
                    //说明ch里面   是右括号
                    if(stack.empty()) {
                        //右括号多！
                        return false;
                    }
                    char top = stack.peek();
                    if(ch == ')' && top == '(' || ch == ']' && top == '[' || ch == '}' && top == '{') {
                        //只能说明 当前的字符是匹配的
                        stack.pop();
                    }else{
                        //左右括号不匹配
                        return false;
                    }
                }
            }
            if(stack.empty()) {
                return true;
            }else{
                //左括号多
                return false;
            }
        }

        public int evalRPN(String[] tokens) {
            Stack<Integer> stack = new Stack<>();
            for(String x : tokens) {
                //不是加减乘法
                if(!isOperation(x)) {
                    stack.push(Integer.parseInt(x));
                }else{
                    int num2 = stack.pop();
                    int num1 = stack.pop();
                    switch(x) {
                        case "+" :
                            stack.push(num1+num2);
                            break;
                        case "-" :
                            stack.push(num1-num2);
                            break;
                        case "*" :
                            stack.push(num1*num2);
                            break;
                        case "/" :
                            stack.push(num1/num2);
                            break;
                    }
                }
            }
            return stack.pop();
        }

        private boolean isOperation(String opera) {
            if(opera.equals("+") || opera.equals("-") || opera.equals("*") ||  opera.equals("/") ) {
                return true;
            }
            return false;
        }

        public static void main3(String[] args) {

            MyStack stack = new MyStack();
            stack.push(12);
            stack.push(23);
            stack.push(34);
            stack.push(45);
            int val = stack.peek();//获取栈顶元素 但是不删除
            System.out.println(val);//45
            int val2 = stack.pop();//删除栈顶元素 45
            System.out.println(val2);

            val = stack.peek();//获取栈顶元素 但是不删除
            System.out.println(val);//34

            stack.pop();
            stack.pop();
            stack.pop();

            boolean flg = stack.isEmpty();
            System.out.println(flg);

            System.out.println(stack.getUsedSize());

        }

        public static void main2(String[] args) {
            Stack<Integer> stack = new Stack<>();
            stack.push(12);
            stack.push(23);
            stack.push(34);
            stack.push(45);
            int val = stack.peek();//获取栈顶元素 但是不删除
            System.out.println(val);//45
            int val2 = stack.pop();//删除栈顶元素
            System.out.println(val2);

            val = stack.peek();//获取栈顶元素 但是不删除
            System.out.println(val);//34

            stack.pop();
            stack.pop();
            stack.pop();

            boolean flg = stack.empty();
            System.out.println(flg);

            System.out.println(stack.size());

        }


        public static void main1(String[] args) {

            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);

            //双向链表
            LinkedList<Integer> linkedList = new LinkedList<>(arrayList);
            //linkedList
            System.out.println(linkedList);
            System.out.println("================");

            //linkedList.add(19);
            for (Integer x : linkedList) {
                System.out.print(x+" ");
            }
            System.out.println();
            System.out.println("================");

            for (int i = 0; i < linkedList.size(); i++) {
                System.out.print(linkedList.get(i)+" ");
            }
            System.out.println();
            System.out.println("================");

            ListIterator<Integer> it = linkedList.listIterator();
            while (it.hasNext()) {
                System.out.print(it.next()+" ");
            }
            System.out.println();
            System.out.println("=======ListIterator=========");

            ListIterator<Integer> it2 = linkedList.listIterator(linkedList.size());
            while (it2.hasPrevious()) {
                System.out.print(it2.previous()+" ");
            }
            System.out.println();
            System.out.println("=======ListIterator.hasPrevious=========");

        }

}
