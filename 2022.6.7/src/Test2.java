/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-06-07
 * Time: 21:54
 */
//  <T> 标志类: 代表当前类是泛型类
class MyArray2<T>{
   //public Object[] array = new Object[10];
    public T[] array =(T[]) new Object[10];
    public T getPos(int pos ){
        return array[pos];
    }
    public void setVal(int pos, T val) {
        this.array[pos] = val;
    }
}
public class Test2 {
    public static void main(String[] args) {
        // 1、<>里面指定了类型，说明此时这个类型里面，只能放这个数据类型的数据

        MyArray2<String> myArray2 = new MyArray2<String>();
        myArray2.setVal(0,"abc");
        myArray2.setVal(1,"kk");
        String s = (String) myArray2.getPos(1);

        System.out.println(s);


        MyArray2<Integer> myArray3 = new MyArray2<Integer>();
        myArray3.setVal(0,22);




    }
}
