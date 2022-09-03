import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-08-31
 * Time: 11:34
 */
class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Test {
    public static void main19(String[] args) {
        String s = "hello";

        for (int i = 0; i < 100; i++) {
            s += "world";
        }
        System.out.println(s);
    }
    public static void main33(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.reverse();
        stringBuilder.append("hello ");
        stringBuilder.append("world");
        String s = stringBuilder.toString();
        System.out.println(s);
        System.out.println("====================");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("hello ");
        stringBuffer.append("world");
        String s1 = stringBuffer.toString();
        System.out.println(s);
    }
    public static void main(String[] args) {
        
        String str = "        hello world    ";
        str.indexOf("i");
        System.out.println(str);
        String s = "hello&WORLD";
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
    }
    public static void main15(String[] args) {
        String str = "hello world";
        System.out.println(str.substring(3));
        System.out.println(str.substring(3,6));//左闭右开的区间
    }
    public static void main14(String[] args) {
        String str = "ccc=12&ll=123";
        String[] result = str.split("&");
        for (int i = 0; i < result.length; i++) {
            //result[0] = ccc=12,result[1] = ll = 123
            String[] result2 = result[i].split("=");
            System.out.println(Arrays.toString(result2));
        }
    }
    public static void main13(String[] args) {
        String str = "192.168.1.1";
        String[] ret = str.split("\\.");
        for (String a:ret) {
            System.out.println(a);
        }
    }
    public static void main12(String[] args) {
        String str = "welcome to China" ;
        String[] result = str.split(" ",2) ;
        for(String s: result) {
            System.out.println(s);
        }
    }
    public static void main11(String[] args) {
        String str = "Welcome to China" ;
        String[] result = str.split(" ") ; // 按照空格拆分
        for(String s: result) {
            System.out.println(s);
        }
    }
    public static void main10(String[] args) {
        String str = "liuxllinglswasd" ;
        System.out.println(str.replaceAll("l", "_"));
        System.out.println(str.replaceFirst("l", "_"));
    }
    public static void main9(String[] args) {
            String s = String.format("%d-%d-%d", 2019, 9,14);
        System.out.println(s);
    }
    public static void main8(String[] args) {
            String s = "music";
// 字符串转数组
            char[] ch = s.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                System.out.print(ch[i]);
            }
            System.out.println();
// 数组转字符串
            String s2 = new String(ch);
            System.out.println(s2);
}
    public static void main7(String[] args) {
        String s1 = "overcome";
        String s2 = "OVERCOME";
// 小写转大写
        System.out.println(s1.toUpperCase());
// 大写转小写
        System.out.println(s2.toLowerCase());
    }
    public static void main6(String[] args) {
        // 数字转字符串
        String s1 = String.valueOf(3.14);
        String s2 = String.valueOf(314);
        String s3 = String.valueOf(true);
        String s4 = String.valueOf(new Student("HanXin", 18));
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println("=================================");
// 字符串转数字
// 注意：Integer、Double等是Java中的包装类型，这个后面会讲到
        int data1 = Integer.parseInt("1234");
        double data2 = Double.parseDouble("12.34");
        System.out.println(data1);
        System.out.println(data2);
    }
    public static void main5(String[] args) {
            String s = "aaabbbcccaaabbbccc";
            System.out.println(s.charAt(3)); // 'b'
            System.out.println(s.indexOf('c')); // 6
            System.out.println(s.indexOf('c', 10)); // 15
            System.out.println(s.indexOf("bbb")); // 3
            System.out.println(s.indexOf("bbb", 10)); // 12
            System.out.println(s.lastIndexOf('c')); // 17
            System.out.println(s.lastIndexOf('c', 10)); // 8
            System.out.println(s.lastIndexOf("bbb")); // 12
            System.out.println(s.lastIndexOf("bbb", 10)); // 3
    }
    public static void main4(String[] args) {
            String s1 = new String("abc");
            String s2 = new String("ac");
            String s3 = new String("ABc");
            String s4 = new String("abcdef");
            System.out.println(s1.compareToIgnoreCase(s2)); // 不同输出字符差值-1
            System.out.println(s1.compareToIgnoreCase(s3)); // 相同输出 0
            System.out.println(s1.compareToIgnoreCase(s4)); // 前k个字符完全相同，输出长度差值 -3
        }
    public static void main3(String[] args) {
            String s1 = new String("abc");
            String s2 = new String("ab");
            String s3 = new String("abc");
            String s4 = new String("abcdef");
            System.out.println(s1.compareTo(s2)); // 不同输出字符差值-1
            System.out.println(s1.compareTo(s3)); // 相同输出 0
            System.out.println(s1.compareTo(s4)); // 前k个字符完全相同，输出长度差值 -3
        }
    public static void main2(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");
        String s3 = new String("Hello");
// s1、s2、s3引用的是三个不同对象，因此==比较结果全部为false
        System.out.println(s1 == s2); // false
        System.out.println(s1 == s3); // false
// equals比较：String对象中的逐个字符
// 虽然s1与s2引用的不是同一个对象，但是两个对象中放置的内容相同，因此输出true
// s1与s3引用的不是同一个对象，而且两个对象中内容也不同，因此输出false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false
    }

    public static void main1(String[] args) {
        int a = 10;
        int b = 20;
        int c = 10;
// 对于基本类型变量，==比较两个变量中存储的值是否相同
        System.out.println(a == b); // false
        System.out.println(a == c); // true
// 对于引用类型变量，==比较两个引用变量引用的是否为同一个对象
        String s1 = new String("hello");
        String s2 = new String("hello");
        String s3 = new String("world");
        String s4 = s1;
        System.out.println(s1 == s2); // false
        System.out.println(s2 == s3); // false
        System.out.println(s1 == s4); // true
    }
}


