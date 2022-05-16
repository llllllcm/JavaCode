/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-16
 * Time: 20:00
 */

class Value {
    public int a;

}
public class Swap {
    public static void swap(Value value1,Value value2){
        int temp = value1.a;
        value1.a = value2.a;
        value2.a = temp;
    }
    public static void main(String[] args) {
        Value value1 = new Value();
        Value value2 = new Value();
        value1.a = 10;
        value2.a = 20;

        //对其赋值
        System.out.println(value1.a);
        System.out.println(value2.a);
        System.out.println("=================");
        swap(value1,value2);
        System.out.println(value1.a);
        System.out.println(value2.a);

    }
}
