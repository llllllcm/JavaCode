import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-11-16
 * Time: 14:57
 */

public class demo1 {
    public static int switchit(int x){
        int j=1;
        switch(x){
            case 1:j++;
            case 2:j++;
            case 3:j++;
            case 4:j++;
            case 5:j++;
            default:j++;
        }
        return j+x;
    }
    public static void main1(String[] args) {
        System.out.println("value="+switchit(4));//3
    }

    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        //注意 hasNext 和 hasNextLine 的区别
        //dp[i] 跳到第i个台阶需要跳多少次
        //dp[i] = dp[i-1]+dp[i-2]+dp[i-3]+....+dp[2]+dp[1];
        //dp[i-1] = dp[i-2]+dp[i-3]+.....+dp[2]+dp[1];
        int n = in.nextInt();
        //dp[i] = 2dp[i-1];dp[i]是一个等比数列
        int result = (int)Math.pow(2,n-1);
        System.out.println(result);
    }


    // 注意类名必须为 Main, 不要有任何 package xxx 信息
    //注意所给出的案例的大小。
        public static void main3(String[] args) {
            Scanner in = new Scanner(System.in);
            float a = 1.4f;
            a = (float) 1.4;
            // 注意 hasNext 和 hasNextLine 的区别
            double cat = 0;
            double r = 0;
            while (in.hasNext()) { // 注意 while 处理多个 case
                cat = in.nextDouble();
                r = in.nextDouble();
                if(cat > r*3.14*2) {
                    System.out.println("No");
                }else {
                    System.out.println("Yes");
                }
            }
        }

    public static void main4(String[] args) {
        int a=10;
        double b=3.14;
        System.out.println('A'+a+b);
    }

    public int Add(int num1,int num2) {
        while(num2 != 0) {
            int temp = num1^num2;
            num2 = (num1&num2)<<1;
            num1 = temp;
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            BigDecimal a = in.nextBigDecimal();
            BigDecimal b = in.nextBigDecimal();
            BigDecimal c = in.nextBigDecimal();
            if(a.add(b).compareTo(c) > 0 || b.add(c).compareTo(a) > 0 || a.add(c).compareTo(b) > 0) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }

}
