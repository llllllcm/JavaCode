import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-07-24
 * Time: 22:25
 */
public class Test2 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            int[] arr = null;
            System.out.println(arr.length);
        } catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("捕获到一个空指针异常");
        } catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("捕获了一个算数异常");
        } finally {
            System.out.println("此时会自动帮我们关闭功能，不管有没有捕获异常都能进行， 进行资源的关闭");
        }
        System.out.println("我是其他代码逻辑");

    }
}
