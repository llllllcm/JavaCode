package imitate2_lanqiao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-12-05
 * Time: 19:42
 */
public class demo2 {
    public static boolean isLeapYear (int year) {
        if((year % 4 == 0 && year % 100 != 0 )|| year % 400 == 0) {
            return true;
        }else {
            return false;
        }

    }
    //数天数
    public static void main(String[] args) {
        int count = 0;
        int i = 1950;
        while(i <= 2021) {
            if(isLeapYear(i)) {
                count += 366;
            }else {
                count += 365;
            }
            i++;
        }
        System.out.println(count+31+30+31);
    }

    public static void main2(String[] args){
        int res = 31 + 30 + 31;
        for(int i = 1950; i < 2022; i++){
            if(isLeapYear(i)){
                res += 366;
            }else{
                res += 365;
            }
        }
        System.out.println(res);
    }
}
