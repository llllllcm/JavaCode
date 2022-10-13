import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-03
 * Time: 21:43
 */
public class demo6 {
    //猜数字
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("给你一个1~100之间的整数，请猜测这个数");
        int realNumber = random.nextInt(100)+1;
        int yourGuess = 0;
        System.out.println("请输入你的猜测");
        yourGuess = scanner.nextInt();
        while(true) {
            if (yourGuess > realNumber) {
                System.out.println("猜大了，再输入你的猜测");
                yourGuess = scanner.nextInt();
            } else if (yourGuess < realNumber) {
                System.out.println("猜小了，再次输入你的猜测");
                yourGuess = scanner.nextInt();
            }else {
                System.out.println("猜对了");
                break;
            }
        }
    }
}
