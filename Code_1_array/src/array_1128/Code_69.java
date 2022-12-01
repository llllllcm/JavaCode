package array_1128;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-11-29
 * Time: 17:55
 */
public class Code_69 {
    //x的平方根
    //解法1 直接利用库函数
    class Solution1 {
        public int mySqrt(int x) {
            return (int)Math.sqrt(x);
        }
    }
    //解法2 使用二分查找
        public static int mySqrt(int x) {
            //mid * mid 与 x 做比较 ->为了防止整形溢出，这里 用 mid 与 x/mid 做比较
            int left = 1;
            int right = (x>>1) + 1;
            while(left <= right) {
                int mid = left + ((right-left)>>1);
                if(mid > x/mid) {
                    right = mid-1;
                } else if (mid < x/mid) {
                    left = mid+1;
                }else {
                    return mid;
                }
            }
            return right;
        }

    public static void main(String[] args) {
        int x = mySqrt(8);
        System.out.println(x);
    }

}
