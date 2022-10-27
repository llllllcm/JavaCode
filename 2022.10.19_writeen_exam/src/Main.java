///**
// * Created with IntelliJ IDEA.
// * Description:
// * User: 86136
// * Date: 2022-10-19
// * Time: 17:59
// */
//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static boolean isCharSort(String[] arr) {
//        for(int i = 0; i < arr.length-1; i++) {
//            if(arr[i].compareTo(arr[i+1]) > 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//    public static boolean isLengthSort(String[] arr) {
//        for(int i = 0; i < arr.length-1; i++) {
//            if(arr[i].length() > arr[i+1].length()) {
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int count = in.nextInt();
//        in.nextLine();
//        String[] arr = new String[count];
//        for(int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextLine();
//        }
//        if(isCharSort(arr) && isLengthSort(arr)) {
//            System.out.println("both");
//        }
//        if(!isCharSort(arr) && !isLengthSort(arr)) {
//            System.out.println("none");
//        }
//        if(isCharSort(arr) && !isLengthSort(arr)) {
//            System.out.println("lexicographically");
//        }
//        if(!isCharSort(arr) && isLengthSort(arr)) {
//            System.out.println("lengths");
//        }
//    }
//}
import java.sql.Statement;
import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        Statement
        String[] arr = new String[2022];
        int  count = 0;
        for(int i = 1; i <= 2020; i++) {
            arr[i] = i+"";
            for(int j = 0; j < arr[i].length(); j++ ) {
                if(arr[i].charAt(i) == '2') {
                    count++;
                }
            }
        }
        System.out.print(count);
        scan.close();
    }
}