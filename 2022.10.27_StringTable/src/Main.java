import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-27
 * Time: 19:37
 */
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String s = in.nextLine();
        s = s.toLowerCase();
        String target = in.nextLine();
        target = target.toLowerCase();
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(target.equals(ch) == true) {
                count++;
            }
        }
        System.out.print(count);
    }
}
