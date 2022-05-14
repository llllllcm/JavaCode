/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-13
 * Time: 0:57
 */
public class TestDemo {
        public static void main(String[] args) {
            Date date = new Date();
            //date.year = 1999;
            date.setYear(1999);
            System.out.println("获取当前的年份： "+date.getYear());
            //date.month = 9;
            //date.day = 8;
            date.setMonth(9);
            System.out.println("获取当前的月份："+date.getMonth());
            date.setDay(10);
            System.out.println("获取当前的号："+date.getDay());
            date.printDate();
        }
    }

