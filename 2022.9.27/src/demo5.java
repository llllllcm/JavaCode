import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-03
 * Time: 21:12
 */
public class demo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = 0;
        double price = 0;
        System.out.println("输入电量：");
        amount = scanner.nextDouble();
        if (amount <= 90 && amount >= 1 ) {
            price = amount*0.6;
        }else if(amount <= 150 && amount >= 91) {
            price = (amount-90)*1.1+0.6*90;
        } else if (amount > 150) {
            price = (amount-150)*1.7+1.1*60+0.6*90;
        }else {
            System.out.println("输出电量："+amount+"不合理");
        }
        System.out.printf("电费：%5.2f",price);
    }
}
