import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-08-18
 * Time: 21:20
 */
public class TestDemo {
    public static void func(int x) throws Exception {
        if (x == 0){
//            throw new RuntimeException("x == 0");
            throw new CloneNotSupportedException();
        }
        if (x == 2){
            throw new FileNotFoundException();
        }

    }
    public static void func1() throws ArithmeticException {
        System.out.println("没有异常");
    }
    public static void func2(int x){
        if (x == 0){
            throw new ArithmeticException("X == 0");
        }
    }

        public static void main2(String[] args) throws Exception{
                               func2(0);
    }

    public static void main1(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] arr = null;
            System.out.println(arr.length);
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("空指针异常");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("算术异常");
        } finally {
            System.out.println("进行资源的关闭");
        }
    }
    public static void main(String[] args) {
//        try {
//            func();
//        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
//        }
        func();
        System.out.println("after try catch");
    }
    public static void func() {
        int[] arr = {1, 2};
        System.out.println(arr[60]);
    }
}
