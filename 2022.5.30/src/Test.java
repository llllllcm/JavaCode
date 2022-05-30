/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-30
 * Time: 22:02
 */
import java.util.Scanner;

public class Test {

        public static boolean isAdmin(String userId){
            return userId.toLowerCase()=="admin";
        }
        public static void main(String[] args){
//            System.out.println(isAdmin("Admin"));
            String s1="abc"+"def";//1
            String s2=new String(s1);//2
            if(s1.equals(s2))//3
                System.out.println(".equals succeeded");//4
            if(s1==s2)//5
                System.out.println("==succeeded");//6
        }


        String str = new String("good");
        char[ ] ch = { 'a' , 'b' , 'c' };
        public static void main2(String args[]){
            Test ex = new Test();
            ex.change(ex.str,ex.ch);
            System.out.print(ex.str + " and ");
            System.out.print(ex.ch);
        }
        public void change(String str,char ch[ ]){
            str = "test ok";
            ch[0] = 'g';
        }

        public static void main1(String[] args) {
            Scanner scanner=new Scanner(System.in);
            float h=scanner.nextFloat();
            int n =scanner.nextInt();


            //write your code here......
            float sum = 0;
            for(int i = 0; i < n; i++){
                h /= 2;
                sum += h*3;
            }


            //输出格式为：System.out.println(String.format("%.3f", h)+" "+String.format("%.3f", sum));
            System.out.println(String.format("%.3f", h)+" "+String.format("%.3f", sum-h));

        }

}