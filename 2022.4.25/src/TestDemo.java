import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-04-25
 * Time: 9:20
 */
public class TestDemo {
    public static void main4(String[] args) {
        //写1~100中即能被三整除也能被5整除的数据（用continue完成）
        int i = 1;
        while (i <= 100) {
            if(i % 3 == 0 && i % 5 ==0) {
                System.out.println(i);
                i++;
                continue;
            }
            i++;

        }

    }
    public static void main3(String[] args) {
        //计算各个阶乘的和
        //思路 先计算各个阶乘，然后在相加
        int j = 1;
        int sum = 0;
        while (j <= 5) {
            int ret = 1;
            int i = 1;
            while( i<= j) {
                ret *= i ;
                i++;
            }
            sum += ret;
            j++;
        }
        System.out.println(sum);

    }
    public static void main2(String[] args) {
        //计算5的阶乘
        int ret = 1;
        for (int i = 1;i <= 5;i++) {
            ret *= i;
        }
        System.out.println(ret);
    }
    public static void main1(String[] args) {
        //计算奇数和偶数的和
        int sum1 = 0;
        int sum2 = 0;
        int i = 1;
        for (i = 1;i <= 100;i++) {
            if (i % 2 == 0) {
                sum1 += i;
            }
            else {
                sum2 += i;
            }
        }
        System.out.println("偶数的和是"+sum1);
        System.out.println("奇数的和是"+sum2);
    }

    public static void main5(String[] args) {
        //输出乘法口诀表
        int product = 1;
        for(int i = 1; i <= 9; i++){
            for (int j = 1; j <= 9; j++) {
                product = i * j;
                System.out.println(i+"*"+j+"="+product);


            }
        }

    }

    public static void main6(String[] args) {
        /**
         * 编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，
         * 提示“登录成功”,密码错误， 可以重新输 入，最多输入三次。三次均错，则提示退出程序
         */
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(i<3){
            System.out.println("请输入密码");
            String password = scanner.nextLine();
            String initialword = "1234";
            if(initialword.equals(password)){
                System.out.println("登录成功");
                break;
            }
            else{
                System.out.println("输入失败");
                i++;
            }

        }



    }

    public static void main7(String[] args) {
        /**
         * 求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，
         * 其各位数字的立方和确好等于该数本 身，如；153＝1＋5＋3?，则153是一个“水仙花数“。）
         */
        for (int i = 100; i <= 999 ; i++) {
            int a = 0;
            int b = 0;
            int c = 0;
            a = i / 100;
            b = i % 100 / 10;
            c = i % 100 % 10;
            if(i == a*a*a + b*b*b + c*c*c){
                System.out.println(i);

            }


        }



    }

    public static void main8(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要打印几行的X图形");
        while(scanner.hasNextInt()) {
            int time = scanner.nextInt();
            for (int i = 0; i < time; i++) {
                int j = 0;
                for (j = 0; j < time; j++) {
                    if (i == j || j == time - i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
        }
    }

    public static void main9(String[] args) {
        /**
         * 求两个正整数的最大公约数
         */
        System.out.println("请输入要求最大公约数的两个整数");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        //暴力穷举法
        if(num1 >= num2){
            for (int i = num2; i>=1; i--) {
                if(num1 % i == 0 && num2 % i == 0) {
                    System.out.println("两个数的最大公约数为" + i);
                    break;
                }

            }
        }
        else{
            for (int i = num1; i>=1; i--) {
                if(num1 % i == 0 && num2 % i == 0) {
                    System.out.println("两个数的最大公约数为" + i);
                    break;
                }

            }
        }


    }

    public static void main10(String[] args) {
        //输出1000~2000之间的闰年
        for(int year = 1000 ; year <= 2000; year++){
            if(year % 400 == 0 ||(year % 4 ==0 && year % 100 != 0)){
                System.out.println(year);

            }
        }
    }

    public static void main11(String[] args) {
        //打印 1 - 100 之间所有的素数
        for (int prime = 2; prime <= 100; prime++) {
            boolean isprime = true;
            for (int j = 2; j < prime ; j++) {
                if (prime % j == 0) {
                    isprime = false;
                    break;

                }
            }

            if(isprime){
                System.out.println("素数是"+prime);
            }

        }
    }

    public static boolean judgePrime (int num) {
        if(num <= 3){
            return num>1;
        }
        for (int i = 2; i < num ; i++) {
            if(num % i == 0){
                return false;
            }

        }
        return true;

    }
    public static void main12(String[] args) {
        //给定一个数字，判定一个数字是否是素数
        System.out.println("请输入一个数字：");
        Scanner num = new Scanner(System.in);
        while(num.hasNextInt()){
            int n = num.nextInt();
            if(judgePrime(n)){
                System.out.println(n+"是素数");
            }
            else{
                System.out.println(n+"不是素数");
            }
        }
    }

    public static void main13(String[] args) {
        /**
         * 编写程序数一下 1到 100的所有整数中出现多少个数字9
         */
        /*int count = 0;
        //对其余10，如果结果为9那么个位数就是9，对其除10，结果为9，那么十位数就为9.
        for (int i = 1; i <= 100 ; i++) {
            if(i % 10 == 9 || i / 10 == 9){
                count ++;
                System.out.println(i);

            }

        }*/
        //以上代码有缺陷，设计到短路或的情况，如果这个数个位是9，十位是9，那么这个数本应该加两次个数，但是这种情况下只能加一次。
        //针对以上情况，我们做出改进。
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            int a = i % 10;
            int b = i / 10;
            if(a == 9){
                count++;
            }
            if (b == 9){
                count++;
            }
        }
        System.out.println("出现数字9的数有"+count+"个");

    }


}


