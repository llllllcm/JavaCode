import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-09-27
 * Time: 10:47
 */
public class demo3 {
    //求1000之内的完数
    public static void number(int n) {
        int tmp = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
               tmp += i;
            }
        }
        if (tmp == n) {
            System.out.println(tmp+"这是一个完数");
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            number(i);
        }
    }
}
