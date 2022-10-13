import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-09-20
 * Time: 11:14
 */

public class PTA {

    public static void main(String[] args) {
        


    }
    public static void main3(String[] args) {
        final int f;
        boolean a = false;
        boolean b = true;
        boolean c = (a && b) && (!b);
        boolean result = (a & b) & (!b);
        System.out.println(result);

    }
    //输入2个整数，输出它们的和、差、乘积和准确的商。
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);

        System.out.println((double)a / b);
    }

    public static int compareInt(int a,int b) {
        int tmp = 0;
        if(a > b) {
            return a;
        }else if (a < b) {
            return b;
        }else {
            return a;
        }

    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int c = compareInt(A,B);
        System.out.println(c);

    }
}
