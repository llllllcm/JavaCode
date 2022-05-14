/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-12
 * Time: 20:14
 */

public class Date {
    public int year;
    public int month;
    private int day;

    //无参构造方法
    public Date(){
        //由于这里无参和三个参数的构造方法内容是一样的，所以这里可以简化为
        this(1999,2,18);
        /*this.day = 1;
        this.year = 1800;
        this.month = 1;*/
    }
    //带有三个参数的构造方法
    public Date(int year,int month,int day){
        this.year = year ;
        this.day = day;
        this.month = month;
    }

    public int getDay() {
        return day;
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

    public void setDay(int day) {
        this.day = day;
    }

    public void printDate(){
        System.out.println(year+"-"+month+"-"+day);
    }

    public static void main(String[] args) {
        Date day1 = new Date();
        day1.printDate();
    }

}