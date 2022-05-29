package exercise;

import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-29
 * Time: 9:30
 */
public class Test {
    public static int getCM(int m, int n){
        //两数的乘积/最大公约数
        int a = m;
        int b = n;

        //write your code here......
        int c = m % n;
        while(c != 0){
            m = n;
            n = c;
            c = m % n;
        }
        return a*b/n;


    }
    public static void main1(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        //write your code here......
        while(scanner.nextInt() > 0){
            count++;
        }
        System.out.print(count);
    }
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        //write your code here......
        System.out.println(Integer.toBinaryString(num));

    }

    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int seed = scanner.nextInt();
            Random random = new Random(seed);

            //write your code here......
            int randNum = random.nextInt(6);
            System.out.println(randNum+1);

        }
    }
    public static void main4(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double num = scanner.nextDouble();

        //write your code here......
        System.out.println(Math.abs(num));
        System.out.println(Math.sqrt(num));
        System.out.println(Math.log(num));
        System.out.println(Math.sin(num));
    }

    /**
     * 字符串最后一个单词的长度
     * @param args
     */
    public static void main(String[] args) {
        //标准输入
        Scanner sc=new Scanner(System.in);
        //键盘输入字符串
        String s=sc.nextLine();
        //定义指针变量
        int index=-1;
        for(int i=s.length()-1;i>=0;i--){
            //从后往前第一个空格的位置
            if(s.charAt(i)==' '){
                index=i;
                break;
            }
        }
        //总长度减去指针到开头一段的长度，即得到最后一个单词的长度
        System.out.println(s.length()-index-1);
    }
}
