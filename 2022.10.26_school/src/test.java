import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-11-01
 * Time: 10:28
 */
//定义一个Birthday类，其成员变量有3个整形变量（出生的年月日）：year,month,day；提供构造方法对这3个成员变量进行初始化
// ；提供成员变量的get、set方法；成员函数有getAge(),功能是实现计算到2017年12月25日时该Birthday对象的年龄。编写程序测试这个类。
class Birthday {
    int year;
    int month;
    int day;

    public Birthday(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void getAge() {
        //功能是实现计算到2017年12月25日时该Birthday对象的年龄
        int year = this.year-2017;
        System.out.println("age = "+year);
    }
}
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        Birthday birthday = new Birthday(year,month,day);
        birthday.getAge();
    }
}
