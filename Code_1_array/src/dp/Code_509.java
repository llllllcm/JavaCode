package dp;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-12-06
 * Time: 18:25
 */
public class Code_509 {
    public int fib(int n) {
        //考虑n=0的情况
        if(n == 0) {
            return 0;
        }
        // 1. 定义状态数组，dp[i] 表示的是数字 i 的斐波那契数
        int[] dp = new int[n + 1];

        // 2. 状态初始化
        dp[0] = 0;
        dp[1] = 1;

        // 3. 状态转移
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        // 4. 返回最终需要的状态值
        return dp[n];
    }
    //对于以上代码我们还可以进行空间复杂度的优化
    public int fib2(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        int f;
        int f1 = 1;//n-1
        int f2 = 0;//n-2
        for (int i = 2; i <= n; i++) {
            f = f1 + f2;
            f2 = f1;
            f1 = f;
        }
        return f1;
    }
}
