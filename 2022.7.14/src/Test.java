/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-07-14
 * Time: 23:26
 */
import java.io.FileNotFoundException;


class MyArray {
    public Object[] array = new Object[10];

    public Object getPos(int pos) {
        return array[pos];
    }

    public void setVal(int pos,Object val) {
        this.array[pos] = val;
    }
}

public class Test {

    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.setVal(0,19);
        myArray.setVal(1,"hello");

        String s = (String)myArray.getPos(1);
        System.out.println(s);

    }
}
