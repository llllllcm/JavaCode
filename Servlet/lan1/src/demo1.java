import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-03-11
 * Time: 19:36
 */
public class demo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String s = in.nextLine();
            int[] arr = new int[1000];
            for(int i = 0; i < s.length(); i++) {
                arr[s.charAt(i)-'a']++;
            }
            for(int i = 0; i < arr.length-1; i++) {
                if(arr[i] != 0) {
                    System.out.print(arr[i]);
                }
            }
        }
    }
}
