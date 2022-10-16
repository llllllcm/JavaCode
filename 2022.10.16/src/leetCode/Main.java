package leetCode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-16
 * Time: 8:54
 */

//class B {
//    int age = 0;
//
//    public B(int age) {
//        this.age = age;
//        System.out.println("调用B的构造方法");
//    }
//}
//class C{
//    int number = 0;
//
//    public C(int number) {
//        this.number = number;
//        System.out.println("调用c的构造方法");
//    }
//}
//class A extends B{
//    int age2 = 0;
//    C c = new C(2);
//    public A(int age, int age2) {
//        super(age);
//        this.age2 = age2;
//        System.out.println("调用A的构造方法");
//    }
//
//}
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String str = in.nextLine();
        //定义两个字符串，用来比较的，s2则用来存放答案。
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();
        System.out.println(s1.length());
        s1.reverse();
        s2.insert(1,s2);
        for(int i = 0; i < str.length(); i++ ) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                //遇见这个数字串
                s1.append(str.charAt(i));
                s1.append('a');
            }else {
                if(s1.length() > s2.length()) {
                    s2 = s1;
                }

            }
        }
    }
}

