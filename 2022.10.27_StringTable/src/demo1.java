import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-27
 * Time: 12:20
 */
public class demo1 {
    public static void main(String[] args) {
        double a = 75;
        int num = 100;
        System.out.println(Math.round(a/num*100));
    }
    public static void main12(String[] args) {
        String s1 = "abc" + "def";
        String s2 = new String(s1);
        if(s1 == s2) {
            System.out.println("== succeeded");
        }
        if(s1.equals(s2)) {
            System.out.println(".equals() succeed");
        }
    }
    public static void main11(String[] args) {
        long start = System.currentTimeMillis();
        String s = "";
        for(int i = 0; i < 1_0000; ++i){
            s += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        start = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("");
        for(int i = 0; i < 1_0000; ++i){
            sbf.append(i);
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);
        start = System.currentTimeMillis();
        StringBuilder sbd = new StringBuilder();
        for(int i = 0; i < 1_0000; ++i){
            sbd.append(i);
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    public static void main10(String[] args) {
        char[] ch = new char[]{'a','b','c'};
        String s1 = new String(ch);
        String s2 = "abc";
        s2.replace('a','b');
        s1.intern();
        System.out.println(s1 == s2);
    }
    public static void main5(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("world");
        String s4 = new String("world");
    }

    public static void main4(String[] args) {
        String greeting = "hello";
        if(greeting == "hello") {
            System.out.println("1");
        }else if(greeting.substring(0,3) == "hel") {
            System.out.println(2);
        }
    }
    public static void main3(String[] args) {
        String s = "hello";
        String s2 = s.substring(0,3)+"p!";
        s.equals(s2);
        "hello".equals(s);
        //如果想忽略大小写比较
        s.equalsIgnoreCase(s2);
//        int age = 456;
//        s = s.toLowerCase();
//        System.out.println(s+age);
//        System.out.println("打印了一个字符串"+age);
    }






    public static void main2(String[] args) {
        String s1 = "hel";
        String s2 = "lo";
        String s3 = s1+s2;
        System.out.println(s3);
    }
    public static void main1(String[] args) {

        String s = "";//空的字符串
        String str = "Hello";
        str = str.substring(0,2);
        System.out.println(str);
        System.out.println("=======================");
        String str2 = "csdn";
        str2 = str2.substring(2);
        System.out.println(str2);
    }
}
