import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-16
 * Time: 20:59
 */
class Solution {
    public static void Swap(int[] arr) {
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(Arrays.toString(arr));
        Swap(arr);
        System.out.println(Arrays.toString(arr));

    }
//    public int minPathSum(int[][] grid) {
//        int m = grid.length;
//        int n = grid[0].length;
//        int[][] dp = new int[m][n];
//        //规定dp[m-1][n-1] 是到这个地方的最小路径和
//        //dp[i][j] = arr[i][j] + Math(dp[i-1][j],dp[i][j-1])
//        //给定初始值
//        dp[0][0] = arr[0][0];
//        //然后呢 又因为这里的i或j都不能为0，如果为0，那么后面数组就会访问越界
//        //所以分别对最左行，和第一行进行初始化
//
//        //对第一行初始化
//        for(int i = 1; i < m; i++) {
//            dp[i][0] = arr[i][0] + dp[i-1][0];
//        }
//        //对最左列进行初始化
//        for(int j = 1; j < n; i++) {
//            dp[0][j] = arr[0][j] + dp[0][j-1];
//        }
//        for(int i = 1; i < m; i++) {
//            for(int j = 1; j < n; j++) {
//                dp[i-1][j-1] = Math(dp[i][j-1],dp[i-1][j])+arr[i-1][j-1];
//            }
//        }
//        return dp[i-1][j-1];
//    }
}