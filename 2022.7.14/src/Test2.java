/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-07-14
 * Time: 23:26
 */
class MyArray2<T> {

    //public Object[] array = new Object[10];
    public T[] array = (T[])new Object[10];

    public T getPos(int pos) {
        return array[pos];
    }

    public void setVal(int pos,T val) {
        this.array[pos] = val;
    }
}

public class Test2 {
    public static void main(String[] args) {
        //1、<> 里面指定了类型，说明此时这个类里面，只能放这个数据类型的数据，类类型
        MyArray2<String> myArray = new MyArray2<String>();

        myArray.setVal(0,"abc");
        myArray.setVal(1,"hello");

        String s = myArray.getPos(1);

        System.out.println(s);

        MyArray2<Integer> myArray2 = new MyArray2<Integer>();
        myArray2.setVal(0,10);
        myArray2.setVal(1,24);
        myArray2.setVal(2,98);

    }
}
