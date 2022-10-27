package demo;
import java.io.*;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-26
 * Time: 17:13
 */
public class test1 {
    public void fu() {
        System.out.println("非静态方法");
    }
    public static void func() {
        test1 ts = new test1();
        ts.fu();

    }
    public static void main(String[] args) {
        String  s1="abc"+"def";
        String  s2= new String(s1);
        if(s1 == s2){
            System.out.println("== succeeded");
        }
        if (s1.equals(s2)){
            System.out.println("equals");
        }
    }
}
