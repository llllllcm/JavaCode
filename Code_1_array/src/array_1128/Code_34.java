package array_1128;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-11-29
 * Time: 16:32
 */
public class Code_34 {
    public int[] searchRange (int[] num,int target) {
        int leftFound = found1(num,target);
        int rightFound = found2(num,target);
        if(leftFound > rightFound) {
            return new int[] {-1,-1};
        }else {
            return new int[] {leftFound,rightFound};
        }
    }
    //寻找左边界
    private int found1(int[] num, int target) {
        int left = 0;
        int right = num.length-1;
        while(left <= right) {
            int middle = left + ((right-left)>>1);
            if(target <= num[middle]) {
                right = middle-1;
            }else {
                //target > num[middle]
                left = middle+1;
            }
        }
        return left;
    }
    //寻找右边界
    private int found2(int[] num, int target) {
        int left = 0;
        int right = num.length-1;
        while(left <= right) {
            int middle = left + ((right-left)>>1);
            if(target >= num[middle]) {
                left = middle+1;
            }else {
                //target < num[middle]
                right = middle-1;
            }
        }
        return right;
    }
}
