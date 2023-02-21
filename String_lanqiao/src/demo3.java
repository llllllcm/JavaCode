/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-02-21
 * Time: 21:46
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class demo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int l = scan.nextInt();
        int m = 0,n = 0;
        while(scan.hasNext()){
            list.add(scan.nextInt());
        }
        Collections.sort(list);
        for(int i=1;i<list.size();i++){
            if(list.get(i)-list.get(i-1)==2){
                m = list.get(i)-1;
            }else if(list.get(i).equals(list.get(i-1))){
            /*注意列表中用的是包装类，需要使用equals来判断
            测试的时候写成==可以通过是因为Integer在-128~127的范围内==和equals的判断结果是一样的，因为Integer内一个叫IntegerCache的静态类
            Integer和int比较时会自动拆箱所以用==也没问题,注意两个包装类比较用equals比较值而不是用==比较地址就可以了*/
                n = list.get(i);
            }
        }
        System.out.println(m+" "+n);
        scan.close();
    }
}
