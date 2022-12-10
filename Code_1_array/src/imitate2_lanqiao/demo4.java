package imitate2_lanqiao;

import javax.swing.plaf.basic.BasicDesktopIconUI;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-12-05
 * Time: 20:55
 */



public class demo4 {
    //问题描述:
    //    小蓝有一个 30 行 60 列的数字矩阵，矩阵中的每个数都是 0 到 9 之间的数字。
    //    现在小蓝想从这个矩阵的第一行第一列画一条折线到第 30 行 60 列，线只能沿水平向右走或竖直向下走，
    //    只能在有数字的地方拐弯。小蓝想知道，这样一条线经过的数字的和最大是多少。
        public static void main2(String[] args){
            Scanner scanner = new Scanner(System.in);
            int[][] q = new int[35][65];
            int[][] dp = new int[35][65];
            for(int i = 1; i <= 30; i++){
                String s = scanner.next();
                for(int j = 1; j <= 60; j++){
                    q[i][j] = s.charAt(j - 1) - '0';
                }
            }
            dp[1][1] = q[1][1];
            for(int i = 1; i <= 30; i++){
                for(int j = 1; j <= 60; j++){
                    if(i == 1 && j == 1) continue;
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + q[i][j];
                }
            }
            System.out.println(dp[30][60]);
        }


    public static void main3(String[] args) {
        int[][] arr = new int[30][60];
        int[][] dp = new int[30][60];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 30; i++) {
            String s = scanner.next();
            for (int j = 0; j < 60; j++) {
                arr[i][j] = s.charAt(j)-'0';
            }
        }
        //dp[i][j] = max（dp[i-1][j] + dp[i][j-1]） +arr[i][j];
        //i和j不能为0
        //初始化，dp[0][j] 和 dp[i][0]
        for(int i = 1 ; i < 30; i++) {
            dp[i][0] = arr[i][0] + dp[i-1][0];
        }
        for(int j = 1 ; j < 30; j++) {
            dp[0][j] = arr[0][j] + dp[0][j-1];
        }
        for (int i = 1; i < 30; i++) {
            for (int j = 1; j < 60; j++) {
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]) + arr[i][j];
            }
        }
        System.out.println(dp[29][59]);
    }
    public static void main1(String[] args) {
        String s = "1234567";
        int[] arr = new int[10];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i)-'0';
        }
        System.out.println(Arrays.toString(arr));
    }
}
