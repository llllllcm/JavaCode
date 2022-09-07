import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-09-03
 * Time: 10:26
 */
public class MyArrayList {
    public int elem[];

    //记录当前有多少元素存入数组之中
    public int usedSize;
    public int Default_Capacity = 10;

    // 利用构造方法更好的完成对数组的初始化
    public MyArrayList(){
        this.elem = new int[Default_Capacity];
    }

    // 打印顺序表
    public void display() {
        for (int i = 0; i < this.usedSize ; i++) {
            System.out.print(elem[i]+" ");
        }
        System.out.println();
    }
    // 新增元素,默认在数组最后新增
    public void add(int data) {
        //在新增之前需要判断数组是否满
        if(isFull(elem)){
            this.elem = Arrays.copyOf(this.elem,2*elem.length);
        }
        elem[usedSize] = data;
        usedSize++;
    }
    public boolean isFull(int elem[]){
        return usedSize == elem.length;
    }
    private void checkAddPos(int pos){
        if(pos < 0 || pos > usedSize){
            throw new PosIndexNotLegalException("pos下标不合法");
        }
    }
    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        //在新增元素之前，需要检查pos位置是否合法以及数组是否满
        try {
            checkAddPos(pos);
            if (isFull(elem)){
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
// 判定是否包含某个元素
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
        for (int i = 0; i < usedSize ; i++) {
            if (toFind == elem[i]){
                return i;
            }
        }
        return -1;
    }
    public void checkPos(int pos){
       if(pos < 0 || pos >=usedSize ){
           throw new PosIndexNotLegalException("下标不合法");
       }
    }
    // 获取 pos 位置的元素
    public int get(int pos) {
        //同样在获取pos下标之前，需要判断下标是否合法
        checkPos(pos);
        return elem[pos];
    }
    // 给 pos 位置的元素设为 value
    public void set(int pos, int value) {
        checkPos(pos);
        elem[pos] = value;
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int index = indexOf(toRemove);
        if(index == -1){
            System.out.println("没有你要删除的数字");
            return;
        }
        for (int i = index; i < usedSize-1; i++) {
            elem[i] = elem[i+1];
        }
        usedSize--;
    }
    // 获取顺序表长度
    public int size() {
        return usedSize;
    }
    // 清空顺序表
    public void clear() {
        usedSize = 0;
    }
}
