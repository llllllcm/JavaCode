package imitate2_lanqiao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-12-11
 * Time: 15:40
 */
import java.util.*;
class Main{
    static boolean IsRun(int y) {
        if(y%400==0||(y%4==0&&y%100!=0)) return true;
        return false;
    }
    static boolean ABBA(String Str){//判断回文日期
        char []str=Str.toCharArray();
        if(str[0]==str[7]&&str[1]==str[6]&&str[2]==str[5]&&str[3]==str[4]) return true;
        return false;
    }
    static boolean ABAB(String Str) {//判断ABBA型
        char []str=Str.toCharArray();
        if(str[0]==str[2]&&str[2]==str[5]&&str[5]==str[7]&&str[1]==str[3]&&str[3]==str[4]&&str[4]==str[6]&&str[0]!=str[1])
            return true;
        return false;
    }
    public static void main(String args[]) {
        int monthes[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner in=new Scanner(System.in);
        String time=in.next();
        Integer tt=Integer.parseInt(time);
        int year=tt/10000;
        int month=tt%10000/100;
        int day=tt%100+1;
        int n;
        int []ans=new int[2];
        boolean flag1=false,flag2=false;
        if(IsRun(year)) monthes[2]=29;
        for(int i=year;i<=9999;i++,month=1,day=1) {//巧妙运用for循环的顺序，可以实现从当前日期开始往后寻找
            for(int j=month;j<=12;j++,day=1) {
                for(int k=day;k<=monthes[j];k++) {
                    n=i*10000+j*100+k;

                    String Str=String.valueOf(n);
                    if(ABBA(Str)&&flag1==false) {
                        String str1=Str;
                        flag1=true;
                        ans[0]=n;
                    }
                    if(ABAB(Str)&&flag2==false) {
                        String str2=Str;
                        flag2=true;
                        ans[1]=n;
                    }
                    if(flag1==true&&flag2==true) break;
                }
            }
        }
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}
