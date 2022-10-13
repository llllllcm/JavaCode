import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-04
 * Time: 16:55
 */
public class demo2 {
    //给定两个数，求这两个数的最大公约数
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        //找出两个数的最小值
        int min = (a > b ? b : a);
        while (true){
            if (a % min == 0 && b % min == 0 ) {
                break;
            }
            min--;
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = a;
        int y = b;
        int m = a % b;5
        while (m != 0 ) {
             a = b;
             b = m;
             m = a % b;
        }
        //先利用辗转相除法求最大公约数
        System.out.println(x*y/b);
    }

    public static void main2(String[] args) {
        //求最小公倍数
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int max = a > b ? a : b;
        while(true) {
            if (max % a == 0 && max % b == 0) {
                break;
            }
            max++;
        }
        System.out.println(max);
    }
}
