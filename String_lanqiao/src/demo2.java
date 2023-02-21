/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-02-21
 * Time: 20:22
 */
public class demo2 {
    /**
     * 罗马数字转int
     */

    class Solution {
        public int romanToInt(String s) {
            int sum = 0;
            int preNum = getValue(s.charAt(0));
            for(int i = 1;i < s.length(); i ++) {
                int num = getValue(s.charAt(i));
                if(preNum < num) {
                    sum -= preNum;
                } else {
                    sum += preNum;
                }
                preNum = num;
            }
            sum += preNum;
            return sum;
        }

        private int getValue(char ch) {
            switch(ch) {
                case 'I': return 1;
                case 'V': return 5;
                case 'X': return 10;
                case 'L': return 50;
                case 'C': return 100;
                case 'D': return 500;
                case 'M': return 1000;
                default: return 0;
            }
        }
    }

}
