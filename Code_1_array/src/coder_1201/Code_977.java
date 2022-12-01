package coder_1201;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-12-01
 * Time: 19:25
 */
public class Code_977 {
    class Solution1 {
        public int[] sortedSquares(int[] nums) {
            //双指针
            //数组其实是有序的，只不过负数的平方之后可能成为最大数了
            //数组的平方的最大值就是在数组的两端，不是最左边就是最右边，不能是中间。
            int i = 0;
            int k = nums.length-1;
            for(int m = 0; m < nums.length; m++) {
                nums[m] *= nums[m];
            }
            int[] ans = new int[nums.length];
            int an = ans.length-1;
            while(i <= k) {
                if(nums[i] > nums[k]) {
                    ans[an--] = nums[i++];
                }else {
                    //nums[i] <= nums[k]
                    ans[an--] = nums[k--];
                }
            }
            return ans;
        }
    }
    //暴力
    class Solution {
        public int[] sortedSquares(int[] nums) {
            //暴力
            for(int i = 0; i < nums.length; i++) {
                nums[i] *= nums[i];
            }
            Arrays.sort(nums);
            return nums;
        }
    }

}
