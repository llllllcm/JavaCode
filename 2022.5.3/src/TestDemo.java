/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-03
 * Time: 19:56
 */
public class TestDemo {
    public static int fib1(int n) {
        /**
         * 求斐波那契数列的第n项。(递归实现)
         * 有一定弊端，求的数越大，需要重复计算的数据就越多
         * 所以一般使用迭代实现
         */
        if(n == 1||n == 2) {
            return 1;
        }else {
            int tmp = 0;
            tmp = fib1(n-1) + fib1(n-2);
            return tmp;
        }
    }
    public static int fib2(int n) {
        int f1 = 1;
        int f2 = 1;
        int f3 = -1;
        for (int i = 3; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;



    }
    public static void main1(String[] args) {
        int result = fib2(6);
        System.out.println(result);


    }
    public static int sum(int n) {
        /**
         * 写一个递归方法，输入一个非负整数，返回组成它的数字之和
         */
        if (n < 10) {
            return n;
        }
        //123%10 +123/10
        int tmp=0;
         tmp = n%10+sum(n/10);
        return tmp;


    }

    public static void main2(String[] args) {
        int ret = sum(123);
        System.out.println(ret);

    }
    public static void DigitSingle(int n) {
        /**
         * 按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
         */
        if (n > 9) {
            DigitSingle(n/10);
        }
        System.out.println(n % 10);

    }

    public static void main3(String[] args) {
        DigitSingle(1234);




    }
    public static int Sum(int n) {
        /**
         * 递归求 1 + 2 + 3 + ... + 10
         */
        if (n == 0) {
            return 0;
        }
        int sum = n+Sum(n-1);
        return sum;



    }
    public static void main4(String[] args) {
        int sum = Sum(4);
        System.out.println(sum);

    }
    

    public static void main(String[] args) {

    }

}
