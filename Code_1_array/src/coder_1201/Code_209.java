package coder_1201;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-12-01
 * Time: 20:02
 */
public class Code_209 {
    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            //暴力,但是时间复杂度太高，过不了ac，以下使用滑动窗口来解题
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < nums.length; i++) {
                int sum = nums[i];
                if(sum >= target) {
                    return 1;
                }
                for(int j = i+1;j < nums.length; j++) {
                    sum += nums[j];
                    if(sum >= target) {
                        min = Math.min(min,j-i+1);
                    }
                }
            }
            return min == Integer.MAX_VALUE ? 0 : min;
        }
    }
    class Solution2 {
        public int minSubArrayLen(int target, int[] nums) {
            //滑动窗口
            int len = Integer.MAX_VALUE;
            int i = 0;
            int sum = 0;
            for(int j = 0; j < nums.length; j++) {
                sum += nums[j];
                while(sum >= target) {
                    len = Math.min(len,j-i+1);
                    sum -= nums[i++];
                }
            }
            return len == Integer.MAX_VALUE ? 0 : len;
        }
    }
}
