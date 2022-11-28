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

class Solution3 {
    //在排序数组中查找元素的第一个和最后一个位置
    public int[] searchRange(int[] nums, int target) {
        int first = searchRangeSon(nums, target, true);
        int last = searchRangeSon(nums, target, false);
        if (first == -1 && last == -1){
            return new int[]{-1,-1};
        } else {
            return new int[]{first,last};
        }
    }
    public int searchRangeSon(int[] nums, int target, boolean first) {
        int left = 0,right = nums.length-1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (nums[mid] == target){
                if (first){
                    //寻找第一个target
                    if ((mid - 1 >= left && nums[mid - 1] != target) || (mid - 1 < left)){
                        //如果当前位置的左边元素已经越界，或者左边元素不等于当前元素，说明已经找到第一个target
                        return mid;
                    } else if (mid - 1 >= left && nums[mid - 1] == target){
                        //如果当前位置的左边元素等于当前元素，继续往左边寻找第一个target
                        right = mid - 1;
                    }
                } else {
                    //寻找最后一个target
                    if ((mid + 1 <= right && nums[mid + 1] != target) || (mid + 1 > right)){
                        //如果当前位置的右边元素已经越界，或者右边元素不等于当前元素，说明已经找到最后一个target
                        return mid;
                    } else if (mid + 1 <= right && nums[mid + 1] == target){
                        //如果当前位置的右边元素等于当前元素，继续往右边寻找最后一个target
                        left = mid + 1;
                    }
                }
            } else if (nums[mid] > target){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}

public class binary {

    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(arr.length);
    }
}
