import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-09-27
 * Time: 10:21
 */
public class demo2 {
    //计算1~20的各个阶乘的和

    /**
     * 非递归方法
     */
    public static void fac1() {
        int sum = 0;
        int k = 1;
        //先把每个阶乘求出
        for (int i = 1; i <= 20 ; i++) {
            k = k*i;
            sum += k;
        }
        System.out.println(sum);
    }

    /**
     * 递归
     */
    public static int fac2(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n*fac2(n-1);
        }
    }

    public static void main(String[] args) {
//        fac1();
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum += fac2(i);
        }
        System.out.println(sum);
    }
}
