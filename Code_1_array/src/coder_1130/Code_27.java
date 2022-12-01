package coder_1130;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-11-30
 * Time: 17:29
 */
public class Code_27 {
    //双指针法
    public  int removeElement1(int[] nums, int val) {
        int k = 0;
        for(int x : nums) {
            if(x != val) {
                nums[k++] = x;
            }
        }
        return k;
    }
    //暴力遍历
    public  int removeElement(int[] nums, int val) {
        int length = nums.length;
        for(int i = 0; i < length ; i++) {
            if(nums[i] == val) {
                for (int j = i; j < length-1; j++) {
                    nums[j] = nums[j+1];
                }
                length--;
                i--;//因为下标i之后的数组都向前移动了一位，所以i向前移动一位
                //比如 12246 要移除元素为2. 如果i不减的话，那么可能造成第二个2被遗漏。
            }
        }
        return length;
    }

}
