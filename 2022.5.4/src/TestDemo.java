import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-04
 * Time: 18:58
 */
public class TestDemo {
    public static void Prime1(int n) {
        /**
         * 判断素数
         */
        int i = 0;
        for ( i = 2; i < n ; i++) {
            if (n % i == 0){
                System.out.println("不是素数");
                break;//如果已经遇到可整除的话，后面就没有继续下去的必要了
            }
            }
        //到这步的时候：要么是i==n，要么就是i%2=0.
        if (i == n){
            System.out.println("是素数");
        }

    }
    public static void Prime2(int n) {
        /**
         * 因为不是素数的数：可以把它写成a*b的这种形式
         * 比如：16=4*4，2*8，
         * 15=3*5，
         * 其中的一个因数，都可以写成小于等于n/2的情况。
         */
        int i = 0;
        for (i = 2; i <= n/2 ; i++) {
            if (n % i ==0){
                System.out.println("不是素数");
                break;
            }
        }
        if (i > n/2) {
            System.out.println("是素数");

        }
    }
    public static void Prime3(int n){
        /**
         * 同理可得：可以发现其中有一个因子是小于根号n的，这种方法也是效率
         * 最高的。
         */
        int i = 0;
        for (i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                System.out.println("不是素数");
                break;
            }


        }
        if (i > Math.sqrt(n)) {
            System.out.println("是素数");
        }

    }

    public static void main1(String[] args) {
        Prime3(5);

    }
    public static int CommonDivisor1(int n1,int n2) {
        /**
         * 利用辗转相除法求最大公约数
         */

        int ret = n1 % n2;
        while(ret != 0){
            n1 = n2;
            n2 = ret;
            ret = n1 % n2;
        }
        //到这里的时候ret就等于0了
        return n2;
    }
    public static int CommonDivisor2(int n1,int n2) {
        //递归版本

        return n2!=0?CommonDivisor2(n2,n1%n2):n1;

    }

        public static void main3(String[] args) {
        int MaxDivisor = CommonDivisor2(24,18);
        System.out.println("最大的公约数是： "+MaxDivisor);
    }
    public static int CommonMultiple(int n1,int n2) {
        /**
         * 求两个数的最小公倍数
         */
        return Math.abs(n1*n2)/CommonDivisor2(n1,n2);
    }

    public static void main4(String[] args) {
        int ret = CommonMultiple(24,6);
        System.out.println(ret);
    }

    public static void main5(String[] args) {
        //自幂数
        //首先判断是几位数
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int tmp = num;
        while(tmp !=0) {
            count++;
            tmp = tmp/10;

        }
        tmp = num;
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += Math.pow(tmp%10,count);
            tmp/=10;
        }
        if (sum == num){
            System.out.println(num);
        }else {
            System.out.println("该数不是自幂数");
        }

    }

    public static void main6(String[] args) {
        //判断一个数的二进制中有几个1
        int n = 7;
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if (((n>>i)&1 )!= 0) {
                count ++;
            }

        }
        System.out.println(count);


    }

    public static void main(String[] args) {
        /**
         * 以上代码其实效率不高，因为可能后面的的二进制全为0了，没有判断的必要
         */
        int n = 7;
        int count = 0;
        while(n!=0){
            if((n&1)!=0) {
                count++;
            }
            n=n>>1;
        }
        System.out.println(count);

    }




}
