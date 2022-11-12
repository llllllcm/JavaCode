import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-11-11
 * Time: 20:59
 */
//十进制整数 2 在十进制中是 1 位数，在二进制中对应 10 ，是 2 位数。
//十进制整数 22 在十进制中是 2 位数，在二进制中对应 10110 ，是 5 位数。
//请问十进制整数 2022 在二进制中是几位数？
public class demo1 {
    public static void main1(String[] args) {
        int count = 0;
        int n = 2022;
        StringBuffer stringBuffer = new StringBuffer();
        while (n > 0) {
            stringBuffer.append(n % 2);
            n = n / 2;
        }
        System.out.println(stringBuffer.length());
        for (int i = stringBuffer.length() - 1; i >= 0; i--) {
            System.out.print(stringBuffer.charAt(i));
        }
    }

    //小蓝每周六、周日都晨跑，每月的 1、11、21、31日也晨跑。其它时间不晨跑。
    //已知 2022年1月1日是周六，请问小蓝整个2022年晨跑多少天？
    public static void main2(String[] args) {
        //
        //12*3 + 7 +
        int d[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int ans = 0;
        int week = 6;
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= d[i]; j++) {
                if (week == 6 || week == 0 || j == 1 || j == 11 || j == 21 || j == 31) {
                    ans++;
                }
                week++;
                week = week % 7;
            }
        }
        System.out.println(ans);
    }
//小蓝特别喜欢调和级数 S(n)=1/1+1/2+1/3+1/4+…+1/n 。
//请问，n 至少为多大时，S(n)>12 ？
    public static void main3(String[] args) {
        int n = 0;
        double ans = 0;
        while(ans <= 12) {
            ans += 1.0 / (n+1.0);
            n++;
        }
        System.out.println(n);
    }
//输入一个由小写英文字母组成的字符串，请将其中的元音字母（a, e, i, o, u)转换成大写，其它字母仍然保持小写。
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                arr[i] -= 32;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hesuan = scanner.nextInt();
        int chakan = scanner.nextInt();
        // 周三
        // 周一
        int result = 0;
        if(hesuan > chakan) {
            result = 7-hesuan+chakan;
        }else {
            result = chakan-hesuan;
        }
        System.out.println(result);
    }
}
