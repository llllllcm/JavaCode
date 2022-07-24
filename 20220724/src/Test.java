import java.io.FileNotFoundException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-07-24
 * Time: 16:54
 */
public class Test {
    public static void main1(String[] args) {
       // System.out.println(10/0);
        int[] arr = null;
        //System.out.println(arr.length);

    }
    public static void func(int a){
        if(a == 0){
            throw new RuntimeException("a == 0");
        }
    }

    public static void main2(String[] args) {
        func(0);
    }
    public static void func1(int a) throws Exception {
        if(a == 0){
            throw new CloneNotSupportedException("a == 0");
        }
        if (a == 1){
            throw new FileNotFoundException();
        }
    }

    public static void main3(String[] args) throws Exception{
        func1(0);

    }

    public static void main(String[] args) {
        try{
            int[] arr = null;
            System.out.println(arr.length);
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("捕获到一个空指针异常");
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("捕获了一个算数异常");
        }
        System.out.println("我是其他代码逻辑");

    }

}
