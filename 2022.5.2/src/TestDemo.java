import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-02
 * Time: 14:58
 */
public class TestDemo {
    /**
     * 求和的重载
     * 在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。
     * 并执行代码，求出结果
     */
    public static int add(int a,int b) {
        return a + b;
    }
    public static double add(double a,double b,double c) {
        return a + b + c;
    }
    public static void main1(String[] args) {
        int c = add(2,3);
        double e = add(2.222,23.2,2.3);
        System.out.println(c);
        System.out.println(e);

    }
    public static int fac(int num) {
        //求某个数的阶乘
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum *= i;
        }
        return sum;
    }

    public static void main2(String[] args) {
        /**
         * 求1！+2！+3！+4！+........+n!的和
         */
        System.out.println("请输入要求的阶乘数： ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0 ;
        for (int i = 1; i <=n; i++) {
            sum += fac(i);
        }
        System.out.println(sum);

    }

    public static void main3(String[] args) {
        /**
         * 找出出现一次的数字
         * 有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
         */
        int [] array = new int[]{1,2,9,2,1};
        int single = 0;
        for (int i = 0; i <array.length ; i++) {
            single ^= array[i];

        }
        System.out.println(single);


    }
    public static int MaxWays(int a,int b) {
        int max = 0;
        if(a > b){
            max = a;

        } else if (a==b) {
            System.out.println("两数相同，请重新输入");

        }else {
            max = b;
        }
        return max;


    }
    public static double MaxWays(double a,double b) {
        double max = 0;
        if(a > b){
            max = a;

        } else if (a==b) {
            System.out.println("两数相同，请重新输入");

        }else {
            max = b;
        }
        return max;

    }
    public static void MaxWays(int a,double b,double c) {

        if(a-b>0 && a-c>0){
            System.out.println(a);
        } else if (b-a>0 && b-c>0) {
            System.out.println(b);
        } else if (c-a>0 && c-b>0) {
            System.out.println(c);

        }


    }

    public static void main4(String[] args) {
        //求最大值方法的重载
        //在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，
        //还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
        int Max1 = MaxWays(99,9);
        System.out.println(Max1);
        double Max2 = MaxWays(2.3,23.4);
        System.out.println(Max2);
        MaxWays(3,27.33,12.3);


    }


}
