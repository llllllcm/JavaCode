import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-11
 * Time: 15:16
 */
//public class Main{
//    int i=2;
//    static int is;
//    static{
//        System.out.println("in static block");
//        is=5;
//        System.out.println("static variable is="+is);
//    }
//    {
//        System.out.println("in non-static block");
//        i=8;
//    }
////    Main(){
////        i=10;
////    }
//    public static void main(String args[]){
//        System.out.println("in main()");
//        Main m1=new Main();
//        System.out.println(m1.i);
//    }
//}

public class Main {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
//        Stack stack = new Stack();
//        for(int i = 0; i < str.length(); i++ ) {
//            queue.offer(i);
//        }
//        for(int i = 0; i < str.length(); i++ ) {
//            System.out.println(queue.poll(i));
//        }
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] arr = str.split(" ");
//        Stack stack = new Stack();
        for(int i = 0; i < arr.length; i++ ) {
            System.out.println(arr[i]);
        }
//        数组元素交换，要求：
//        （1）最大的元素与第一个元素交换（2）最小的元素与最后一个元素交换。
        String[] tmp = Arrays.copyOf(arr,arr.length);
        Arrays.sort(tmp);
        String max = tmp[tmp.length-1];
        String min = tmp[0];
        String first = arr[0];
        String last = arr[arr.length-1];
        arr[0] = max;

        System.out.println(Arrays.toString(tmp));


    }
}
