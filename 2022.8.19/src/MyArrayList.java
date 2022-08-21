import java.util.Arrays;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-08-19
 * Time: 22:00
 */
public class MyArrayList {
    public int[] elem;
    public int usedSize;
    public static final int DEFAULT_CAPACITY = 2;

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
//            try{
//                if (isFull()){
//                    elem = Arrays.copyOf(elem,-1);
//                }
//            }catch ( NegativeArraySizeException e){
//                e.printStackTrace();
//                elem = Arrays.copyOf(elem,2*elem.length);
//            }
            if (isFull()){
                    elem = Arrays.copyOf(elem,2*elem.length);
            }
            elem[usedSize++] = data;

    }

    public boolean isFull(){
            return usedSize == elem.length;
    }

    /**
     * 检查新增元素的位置是否合法
     */
    private void checkAddPos(int pos){
        if (pos < 0 || pos > usedSize){
            throw new PosIndexNotLegalException("pos位置不合法");
        }
    }
    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        try {
            checkAddPos(pos);
            if (isFull()){
                elem = Arrays.copyOf(elem,2*elem.length);
            }
            for (int i = usedSize-1; i >= pos ; i--) {
                elem[i+1] = elem[i];
            }
            elem[pos] = data;
            usedSize++;
        }catch (PosIndexNotLegalException e){
            e.printStackTrace();

        }

    }
    public boolean contains(int toFind) {
        for (int i = 0; i < usedSize; i++) {
                if (toFind == elem[i]){
                    return true;
                }
        }
        return false;
    }
        // 查找某个元素对应的位置
    public int indexOf(int toFind) {
        for (int i = 0; i < usedSize; i++) {
            if (toFind == elem[i]){
                return i;
            }
        }
            return -1;
    }
    private void checkGetPos(int pos){
        if (pos < 0 || pos >= usedSize){
            throw new PosIndexNotLegalException("pos位置不合法");
        }
    }
        // 获取 pos 位置的元素
    public int get(int pos) {
            checkGetPos(pos);
            return elem[pos];
    }
        // 给 pos 位置的元素设为 value
    public void set(int pos, int value) {
        checkGetPos(pos);
        elem[pos] = value;

    }
        //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int index = indexOf(toRemove);
        if (index == -1 ){
            return;
        }
        for (int i = index; i < usedSize-1 ; i++) {
            elem[i] = elem[i+1];
        }
        usedSize++;

    }
        // 获取顺序表长度
    public int size() {
        return usedSize;
    }

        // 清空顺序表
    public void clear() {
        usedSize = 0;

    }

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,1);
        myArrayList.add(1,2);
        myArrayList.add(2,3);
        myArrayList.display();
    }

}
