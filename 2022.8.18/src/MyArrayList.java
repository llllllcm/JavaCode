import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-08-18
 * Time: 19:40
 */
public class MyArrayList {
    public int[] elem;
    public int usedSize;
    public static final int DEFAULT_CAPACITY = 10;

    public MyArrayList(){
        this.elem = new int[DEFAULT_CAPACITY];
    }

        // 打印顺序表
        public void display() {
            for (int i = 0; i < usedSize; i++) {
                System.out.println(this.elem[i]+" ");
            }

        }
        // 新增元素,默认在数组最后新增
        public void add(int data) {
        //判断是否满
            if (isFull()){
                elem = Arrays.copyOf(elem,2*elem.length);
            }
            elem[usedSize++] = data;

        }
        // 在 pos 位置新增元素
    public boolean isFull(){
        return usedSize == elem.length;
    }

        public void add(int pos, int data) {

        }

        public boolean contains(int toFind) {
            return true;
        }
        // 查找某个元素对应的位置
        public int indexOf(int toFind) {
            return -1;
        }
        // 获取 pos 位置的元素
        public int get(int pos) {

            return -1;
        }
        // 给 pos 位置的元素设为 value
        public void set(int pos, int value) {

        }
        //删除第一次出现的关键字key
        public void remove(int toRemove) {

        }
        // 获取顺序表长度
        public int size() {


            return 0;
        }
        // 清空顺序表
        public void clear() {

        }
    }
