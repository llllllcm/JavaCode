package imitate2_lanqiao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-12-05
 * Time: 19:04
 */
public class demo1 {
    //最小数
    public static void main1(String[] args) {
        int n = 2023;
        while(true) {
            StringBuffer s = new StringBuffer();
            int temp = n;
            while(temp > 0) {
                s.append(temp%2);
                temp = temp/2;
            }
            int count = 0;
            for (int i = 0; i < 6; i++) {
                if(s.charAt(i) != '0') {
                    break;
                }
                count++;
            }
            if(count == 6 ) {
                System.out.println(n);
                break;
            }
            n++;
        }
    }

    public static void main(String[] args) {
        int n = 2023;
        while(true){
            String s = Integer.toBinaryString(n);
            boolean flag = true;
            for(int i = s.length() - 6; i < s.length(); i++){
                if(s.charAt(i) != '0'){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(n);
                break;
            }
            n++;
        }
    }

}
