import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-09-19
 * Time: 19:29
 */
public class work3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = 0;
        float price = 0,sum = 0;
        System.out.println("请输入产品数量");
        amount = scanner.nextInt();
        System.out.println("请输入产品单价");
        price = scanner.nextFloat();
        sum = price * amount;
        System.out.printf("数量: %d,单价: %5.2f,总价值: %5.2f",amount,price,sum);

    }
}
