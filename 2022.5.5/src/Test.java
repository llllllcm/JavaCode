import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-05
 * Time: 15:21
 */
public class Test {
    public static void main1(String[] args) {
        /**
         * 判断一个数是不是二的n次方数
         * 可以巧妙的运用&运算，因为你会发现2的n次方与2的n次方减1
         * 进行与操作的话，答案为0
         */
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        if ((temp&(temp-1))==0) {
            System.out.println(temp+"是2的n次方");
        }else {
            System.out.println(temp+"不是2的n次方");
        }



    }

    public static void main2(String[] args) {
        /**
         * 求一个数二进制的奇数位和偶数位
         */
        //这里采用i从高位减到低位是因为这样更直观的观察这个数
        int n = 7;
        for (int i = 30; i >= 0 ; i-=2) {
            //奇数位
            System.out.print(((n>>i)&1)+" ");
        }
        System.out.println();
        for (int i = 31; i >= 1 ; i-=2) {
            //偶数位
            System.out.print(((n>>i)&1)+" ");
        }


    }

    public static void main3(String[] args) {
        /**
         * 打印x图形
         */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print("*");
                } else if (i+j+1 == n) {
                    System.out.print("*");
                    }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /**
         * 猜数字游戏
         */
        Scanner scanner = new Scanner(System.in);
        //Random random = new Random(12);//根据这个数随机生成的（伪随机）
        Random random = new Random();
        int randNum = random.nextInt(101);//把随机数赋给他。[0,101)==>[0,100];这里是左闭右开区间。如果没有给101，这里将产生int类型取值中的任一一个数字。


        //System.out.println("随机数是"+randNum);
        while (true) {
            System.out.println("请输入你要猜的数字");
            int num = scanner.nextInt();
            if (num == randNum) {
                System.out.println("猜对了");
                break;
            } else if (num > randNum) {
                System.out.println("猜大了");
            } else  {
                System.out.println("猜小了");
            }
        }
    }
}
