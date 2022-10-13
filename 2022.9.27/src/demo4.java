import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-09-27
 * Time: 11:12
 */
public class demo4 {
    //求满足1~n！之和 小于9999的最大整数n
    public static void main(String[] args) {
        int n = 1;
        int sum = 0;
        while(true) {
            sum += fac(n);
            if (sum > 9999) {
                break;
            }
            n++;
        }
        System.out.println(n);
    }
    public static int fac(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n* fac(n-1);
        }
    }
//    void looper(){
//
//        int x=0;
//        one:
//        while(x<20) {
//            two:
//            System.out.print(++x);
//            if(x>3)
//                break two;
//        }
//    }
    public static void func() {
        int a = 0;
    }

    public static void main9(String[] args) {
        System.out.println(2^3);
    }



    public static void main8(String[] args) {
        //水仙花数是指一个N位正整数（7≥N≥3），
        // 它的每个位上的数字的N次幂之和等于它本身。例如：153=1^3+5^3+3^3。 要求编写程序，计算所有N位水仙花数。
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        flowerCount(num);

    }
    public static void flowerCount(int num){
        //确认是几位数
        //获取每一位数
        //num = 3
        int k = 0;
        switch(num) {
            case 3:
                k = 999;
                break;
            case 4:
                k = 9999;
                break;
            case 5:
                k = 9_9999;
                break;
            case 6:
                k = 99_9999;
                break;
            case 7:
                k = 999_9999;
                break;
        }
        int m = 0;
        switch(num) {
            case 3:
                m = 100;
                break;
            case 4:
                m = 1000;
                break;
            case 5:
                m = 1_0000;
                break;
            case 6:
                m = 10_0000;
                break;
            case 7:
                m = 100_0000;
                break;
        }
        for ( int i = m ; i < k; i++) {
            int tmp = i;
            int sum = 0;
            while(tmp != 0) {
                sum += Math.pow(tmp%10,num);//复合运算符会自动进行转化。因为Math.pow是返回double类型
                tmp /=10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        outer:
        for(int i=0;i<3;i++){
            innner:
            for(int j=0;j<3;j++){
                if(j>1) break outer;
                System.out.println(j+" and "+i);
                System.out.println(j/10);
            }
        }
    }

    public static void main5(String[] args) {
        int i, j;
    outer:    for (i = 1;i < 3;i++) {
    inner:           for (j = 1; j < 3; j++) {
                          if (j == 2)  continue outer;
                          System.out.println("Value for i=" + i + " Value for j=" +j);
                     }
              }
    }

    public static void main4(String[] args) {
        int i=0;
        LOOP:
        while (i<11) {
            i++;
            System.out.println(i);
            while (i<12) {
                if ( i>10 ) break LOOP;
                i++;
            }
            System.out.println(i);
            if ( i>10 ) break;
        }
    }
    public static void main3(String args[]) {
        one:
        two:
        for(int i=0; i<3; i++) {
            three:
            for(int j=10; j<30; j+=10) {
                System.out.println(i+j);
                if(i>0)
                    break one;
            }
        }
    }

    public static void main2(String[] args) {
        aaa:for(int j = 0 ; j < 3 ; j++) { // j=0 外层for循环
            bbb:for(int i = 0 ; i < 2 ; i++) { // i=0 内层for循环
                System.out.println("hello world "); // 1
                break aaa;
            }
        }

    }
    public static void main1(String[] args) {
        int a = 0;

        int i=0;
        while (i--<0){
            System.out.println("The value of i is "+i);
        }
        System.out.println("The end");
    }
}
