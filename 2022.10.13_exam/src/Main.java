import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-13
 * Time: 19:19
 */
final class A{

}

public class Main {
    public static void main(String[] args) {
        String s1 = "lover";
        String s2 = s1.toLowerCase();
        System.out.println(s1 == s2);//输出 true
        String s3 = "Lover";
        String s4 = s3.toLowerCase();
        System.out.println(s3 == s4);
    }
    int a = 4;
    public static void main3(String[] args) {
        //八进制数是用0开头。
        //布尔类型无法转化为数值类型
        long test = 012;
        System.out.println(test);
    }

    float f =-11;
    public static void main2(String[] args) {
        A a = new A();
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();//行
        int width = in.nextInt();//列
        int count = 0;
        int[][] arr = new int[length-1][width-1];
        for (int i = 0; i < length-1 ; i++) {
            for (int j = 0; j < width-1 ; j++) {

            }

        }

    }
//    final int a;

    public static void main1(String[] args) {
        final int a;
        Main main = new Main();
////        System.out.println(main.a);//后续代码如果屏蔽的话，这个运行的结果为0.
//        System.out.println();
//        String s ;
//        System.out.println(s);
//        int a;
//        System.out.println(a);
//        Scanner in = new Scanner(System.in);
//        Arrays.asList();
//        int A = 0;
//        int B1 = 0;
//        int B2 = 0;
//        int C = 0;
//        while(in.hasNextInt()) {
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int c = in.nextInt();
//            int d = in.nextInt();
//            A = (a+c)/2;
//            B1 = (c-a)/2;
//            B2 = (b+d)/2;
//            C = (d-b)/2;
//        }
//        if(B1 != B2) {
//            System.out.print("NO");
//        }else {
//            System.out.print(A+" ");
//            System.out.print(B1+" ");
//            System.out.print(C+" ");
//        }
    }
}
