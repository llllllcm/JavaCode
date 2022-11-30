package array_1128;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-11-28
 * Time: 18:42
 */
//二分查找
//这道题目的前提是数组为有序数组，同时题目还强调数组中无重复元素
class Solution {
    public int search(int[] nums, int target) {
        int right = nums.length-1;
        int left = 0;
        while(left <= right) {
            int middle = (right+left)/2;
            if(target > nums[middle]) {
                left = middle+1;
            }else if(target < nums[middle]) {
                right = middle-1;
            }else{
                return middle;
            }
        }
        return -1;
    }
}
// 搜索插入位置
class Solution2 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left <= right) {
            int middle = (left + right)/2;
            if(target > nums[middle]) {
                left = middle+1;
            }else if(target < nums[middle]) {
                right = middle-1;
            }else {
                return middle;
            }
        }
        return left;
    }
}
public class binary {

    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(arr.length);
    }
}

