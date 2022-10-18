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
class Teacher{
    int id;  //学号
    String name;  //姓名
    int age;  //年龄

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Main {
    public static void Swap(int[] arr) {
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] arr = str.split(" ");
        for(int i = 0; i < arr.length; i++ ) {
            System.out.println(arr[i]);
        }
        int[] arrInt = new int[arr.length];
        for(int i = 0; i < arr.length; i++ ) {
            arrInt[i] = Integer.parseInt(arr[i]);
        }
        //找出最大的元素
        int max = 0;
        int maxIndex = 0;
        for(int i = 0; i < arrInt.length; i++ ) {
            if(arrInt[i] > max) {
                max = arrInt[i];
                maxIndex = i;
            }
        }
        int min = 0;
        int minIndex = 0;
        //找出最小的元素
        for(int i = 0; i < arrInt.length; i++ ) {
            if(arrInt[i] < min) {
                min = arrInt[i];
                minIndex = i;
            }
        }
        int[] swapMax = {arrInt[0],arrInt[maxIndex]};
        int[] swapMin = {arrInt[arrInt.length-1],arrInt[minIndex]};
        //写一个交换的函数
        Swap(swapMin);
        Swap(swapMax);
        for(int i = 0; i < arrInt.length; i++) {
            System.out.println(arrInt[i]);
        }
    }
}
//public class Main {


//    public static void main(String[] args) {
//        Teacher teacher = new Teacher();
//        System.out.println(teacher.toString());
//    }
//    public static void main1(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int[] arr = new int[]
//        // 注意 hasNext 和 hasNextLine 的区别
//        String str = in.nextLine();
//        //定义两个字符串，用来比较的，s2则用来存放答案。
//        StringBuffer s1 = new StringBuffer();
//        StringBuffer s2 = new StringBuffer();
//        System.out.println(s1.length());
//        s1.reverse();
//        s2.insert(1,s2);
//        for(int i = 0; i < str.length(); i++ ) {
//            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
//                //遇见这个数字串
//                s1.append(str.charAt(i));
//                s1.append('a');
//            }else {
//                if(s1.length() > s2.length()) {
//                    s2 = s1;
//                }
//
//            }
//        }
//    }
//}

