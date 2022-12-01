package array_1128;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-11-29
 * Time: 19:01
 */

public class Code_367 {
    //暴力
    public boolean isPerfectSquare1(int num) {
        long x = 1;
        long q = 1;
        while(q <= num) {
            if(q == num) {
                return true;
            }
            x++;
            q = x * x;
        }
        return false;
    }

    //二分
    public boolean isPerfectSquare(int x) {
        int left = 1;
        int right = x;
        while(left <= right) {
            int mid = left + ((right-left)>>1);
            long square = (long)mid*mid;
            if(square > x) {
                right = mid-1;
            }else if(square < x) {
                left = mid+1;
            }else {
                return true;
            }
        }
        return false;
    }
    public static boolean isPerfectSquare3(int x) {
        int left = 1;
        int right = x;
        while(left <= right) {
            int mid = left + ((right-left)>>1);
            if(mid > x/mid) {
                right = mid-1;
            }else if(mid < x/mid) {
                left = mid+1;
            }else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int x = 1;
        boolean a = isPerfectSquare3(5);
        System.out.println(a);
    }

}
