import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-02-21
 * Time: 20:17
 */
public class demo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int count = 0;
        String s = scan.nextLine();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ' || s.charAt(i) != '\n' ) {
                count++;
            }
        }
        System.out.println(count);
        scan.close();
    }
}
