package coder_1130;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-11-30
 * Time: 17:01
 */
public class demo1 {
    //牛客 最难的问题
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String s = sc.nextLine();
            StringBuffer ans = new StringBuffer();
            for(int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if(ch == ' ') {
                    ans.append(ch);
                }else {
                    ans.append((char)(ch > 'E' ? ch-5 : ch+21));
                }
            }
            System.out.println(ans);

        }
    }


}
