import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-09-04
 * Time: 16:20
 */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        //首先创建两个链表
        List<List<Integer>> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        //第一层完成
        list2.add(1);
        list1.add(list2);
        for(int i = 1;i < numRows;i++) {
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);
            List<Integer> preRow = list1.get(i-1);
            for(int j = 1;j < i;j++) {
                int num = preRow.get(j)+preRow.get(j-1);
                curRow.add(num);
            }
            //最右边的1
            curRow.add(1);
            list1.add(curRow);

        }

        return list1;

    }
}
public class Triangle {

}
