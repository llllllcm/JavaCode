/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-07-24
 * Time: 23:00
 */
public class Test3 {
    public static void main(String[] args) {
        try {
            func();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("捕获到了数组越界");
        }
    }

    public static void func(){
        int[] arr = {1,2,3};
        System.out.println(arr[100]);
    }
}
