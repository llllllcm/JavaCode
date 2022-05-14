/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-10
 * Time: 0:32
 */
public class Date {
    public int year;
    public int month;
    public int day;

//    public Date(int year, int month, int day) {
//        this.year = year;
//        this.month = month;
//        this.day = day;
//    }

    public Date(){
//        this.year = 3;
//        this.day = 2;
        this(1,2,3);
        System.out.println("不带参数的构造方法");
    }
    public Date(int year,int month,int day){
        this.day = day;
        this.year = year;
        this.month = month;
        System.out.println("带参数的构造方法");

    }
    public void setDay(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void printDate(){
        System.out.println(this.year + "/" + this.month + "/" + this.day);
    }

    public static void main(String[] args) {
        Date day2 = new Date();
        day2.printDate();
//        System.out.println("===================");
//        Date day1 = new Date(2,3,1);
 //       day1.printDate();
    }
    public static void main1(String[] args) {
// 构造三个日期类型的对象 d1 d2 d3
        Date d1 = new Date();
        Date d2 = new Date();
        Date d3 = new Date();
// 对d1，d2，d3的日期设置
        d1.setDay(2020,9,15);
        d2.setDay(2020,9,16);
        d3.setDay(2020,9,17);
// 打印日期中的内容
        d1.printDate();
        d2.printDate();
        d3.printDate();
    }
}
