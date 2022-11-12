/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-11-01
 * Time: 11:31
 */
//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            if(n == 0) {
//                break;
//            }
//        }
//
//    }
//}
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        int max = 0;
        int[][] dp = new int[s1.length()][s2.length()];
        dp[0][0] = 0;
        dp[0][1] = 0;
        dp[1][0] = 0;
        //那么 dp[i][j] = dp[i-1][j-1] + 1;
        for(int i = 1; i < s1.length(); i++) {
            for(int j = 1; j < s2.length(); j++) {
                if(s1.charAt(i) == s2.charAt(j)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                    if(dp[i][j] > max) {
                        max = dp[i][j];
                    }
                }
            }
        }
        System.out.println(max);
    }
}
