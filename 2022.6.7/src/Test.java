/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-06-07
 * Time: 21:28
 */
class MyArray{
    public Object[] array = new Object[10];
    public Object getPos(int pos ){
        return array[pos];
    }
    public void setVal(int pos, Object val) {
        this.array[pos] = val;
    }
}
public class Test {

    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.setVal(0,10);
        myArray.setVal(1,"kk");
        String s = (String) myArray.getPos(1);
        System.out.println(s);

    }
}
