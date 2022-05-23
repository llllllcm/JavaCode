import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-23
 * Time: 12:30
 */
public class Main {
    public static User login(){
        System.out.println("请输入你的姓名");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("请输入你的身份: 1: 管理员， 0: 普通用户");
        int choice = scanner.nextInt();
        if (choice == 1){
            return new AdminUser(name);
        }else {
            return new NormalUser(name);
        }
    }
    public static void main(String[] args) {
        BookList bookList = new BookList();//准备图书
        //登录
        User user = login();
        //如果直接调用user.menu();是会报错的，因为user里面没有menu这个方法
        //也就是说得父类和子类都有这个方法才行（动态绑定）
        while (true) {
            int choice = user.menu();
            //接下来要区分具体操作是对哪个用户，即 1 对应的是普通用户的1还是管理者的1
            user.doOperation(choice, bookList);
        }

    }
}
