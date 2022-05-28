import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:牛客Java学习
 * User: 86136
 * Date: 2022-05-28
 * Time: 10:47
 */

public class Main {
    /**
     * 类型转换
     *
     * @param args
     */
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        System.out.println(Main.typeConversion(d));
    }

    public static int typeConversion(double d) {

        //write your code here......
        return (int) d;

    }

    /**
     * 四舍五入
     */
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();

        //write your code here......
        int i = (int) (d + 0.5);

        System.out.println(i);
    }

    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        //write your code here.......
        //但是这个方法有弊端，就是a+b如果超过int的范围就不行了。
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }

    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        //write your code here.......
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + " " + b);
    }

    public static void main5(String[] args) {
        Scanner console = new Scanner(System.in);
        int price = console.nextInt();
        int cost = 0;
        //write your code here......
        if (price < 100) {
            cost = price;
        } else if (price >= 100 && price < 500) {
            cost = (int) (price * 0.9);
        } else if (price >= 500 && price < 2000) {
            cost = (int) (price * 0.8);
        } else if (price >= 2000 && price < 5000) {
            cost = (int) (price * 0.7);
        } else if (price >= 5000) {
            cost = (int) (price * 0.6);
        }
        System.out.println(cost);
    }
    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height = scanner.nextDouble();
        double weight = scanner.nextDouble();
        //write your code here......
        double state = weight/(height*height);
        if(state < 18.5){
            System.out.println("偏瘦");
        }else if (state >= 18.5 && state < 20.9){
            System.out.println("苗条");
        }else if (state >= 20.9 && state < 24.9){
            System.out.println("适中");
        }else if (state > 24.9){
            System.out.println("偏胖");
        }
    }

    public static void main7(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String emailMatcher="[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+";
        //write your code here......
        System.out.println(str.matches(emailMatcher)?"邮箱格式合法":"邮箱格式不合法");

    }

    public static void main(String[] args) {
        long sum = 0;
        long a = 0;
        //write your code here........
        for(int i = 0 ; i < 10 ; i++){
            a = a * 10 + 9;
            sum += a;
        }
        System.out.println(sum);
    }

}

