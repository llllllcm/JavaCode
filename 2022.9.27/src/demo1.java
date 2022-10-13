import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-09-27
 * Time: 10:04
 */
public class demo1 {
    public static void giveMess(int number) {
        if(number/1_0000 <= 0 || number/1_0000 >= 10) {
            System.out.println("请给出5位数的彩票号码");
        }else {
            int d1 = number%10; //尾号
            int d2 = number%100; //后两位数
            int d3 = number%1000; //后三位数
            if(d1 == 9 || d1 == 3 || d1 == 1) {
                System.out.println("彩票是三等奖");
            }else {
                System.out.println("彩票不是三等奖");
            }
            if (d2 == 29 || d2 == 46 || d2 == 21) {
                System.out.println("彩票是二等奖");
            }else {
                System.out.println("彩票不是二等奖");
            }
            if (d3 == 875 || d3 == 326 || d3 == 596) {
                System.out.println("彩票是一等奖");
            }else {
                System.out.println("彩票不是一等奖");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入彩票号码");
        int number = scanner.nextInt();
        giveMess(number);
    }
}
