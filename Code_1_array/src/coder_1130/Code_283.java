package coder_1130;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-11-30
 * Time: 20:02
 */
public class Code_283 {
    //双指针法，利用foreach 减少定义一个指针。
    public void moveZeroes(int[] nums) {
        int k = 0;
        for(int x : nums)
            if(x != 0) nums[k++] = x;
        while(k < nums.length) {
            nums[k++] = 0;
        }
    }
}
