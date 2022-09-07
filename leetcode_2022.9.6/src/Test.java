import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-09-06
 * Time: 19:13
 */
public class Test {

    class Solution {
        public int removeElement(int[] nums, int val) {
            Arrays.sort();
            int j = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i]!=val){
                    nums[j]=nums[i];
                    j++;
                }
            }
            return j;
        }
    }

}
