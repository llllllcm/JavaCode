package imitate2_lanqiao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-12-05
 * Time: 20:20
 */
public class demo3 {
    public static int func(int n) {
        int ans = 1;
        for (int i = 0; i < n; i++) {
            ans *=16;
        }
        return ans;
    }
    public static void main1(String[] args) {
        int n = 10;
        while(true) {
            int result = 0;
            int[] arr = new int[100];
            int temp = n;
            int i = 0;
            while(temp > 0) {
                arr[i++] = temp%10;
                temp = temp/10;
            }
            for (int j = i-1; j >= 0; j--) {
                 int a = arr[j];
                result += a*func(j);
            }
            if(result % n == 0) {
                System.out.println(n);
                break;
            }
            n++;
        }
    }

    public static void main(String[] args) {
        for(int i = 10; i < 10000; i++) {
            String s = String.valueOf(i);
            if(check(s)) {
                System.out.println(s);
                break;
            }
        }
    }

    private static boolean check(String s) {
        int x = Integer.parseInt(s,16);
        int x1 = Integer.parseInt(s);
        if(x % x1 == 0) {
            return true;
        }
        return false;
    }
}
