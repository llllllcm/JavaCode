import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-25
 * Time: 23:42
 */

public class Main {
    public static void menu(){
        System.out.println("欢迎来到图书管理系统！");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = scanner.nextLine();
        System.out.println(name+"请输入你的身份： 1——管理员，2——普通用户");
        int choice = scanner.nextInt();



    }
    public static void main(String[] args) {
        menu();

    }
}
