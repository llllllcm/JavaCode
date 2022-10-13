import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-09-18
 * Time: 22:55
 */
public class MyStack {
    public int[] elem;

    //当前栈中所存储的元素个数
    public int usedSize;

    public static final int DEFAULT_CAPACITY = 10;

    public MyStack() {
        elem = new int[DEFAULT_CAPACITY];
    }
    /**
     * 压栈
     * @param val
     */
    public void push(int val) {
        //判断栈是否为满
        if (isFull()) {
            elem = Arrays.copyOf(elem,elem.length *2);
        }
        elem[usedSize] = val;
        usedSize++;
    }

    /**
     * 判断栈是否为满
     * @return
     */
    public boolean isFull(){
        if (usedSize == elem.length) {
            return true;
        }
        return false;
    }
    /**
     * 删除栈顶元素
     */
    public int pop(){
        //删除之前需要先判断栈是否为空
        if (isEmpty()) {
            throw new EmptyStackException("栈为空");
        }
        int oldVal = elem[usedSize-1];
        usedSize--;
        return oldVal;
    }
    /**
     * 判断栈是否为空
     */
    public boolean isEmpty() {
        return usedSize == 0;
    }
    /**
     *获取栈顶元素
     */
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException("栈为空");
        }
        return  elem[usedSize-1];
    }

}
