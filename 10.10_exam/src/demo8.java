import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-12
 * Time: 20:55
 */
public class demo8 {
    public static String delStr(String str1,String str2){

    for(int i=0;i<str1.length();i++){

        for(int j=0;j<str2.length();j++){
            if(str2.charAt(j)==str1.charAt(i)){
                str1 = str1.replace(str1.charAt(i)+"","");
            }

        }

    }
        return str1;
}
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        System.out.print(delStr(str1,str2));
    }
}
