import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-12
 * Time: 17:50
 */
public class demo7 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr[2]++);
        System.out.println(Arrays.toString(arr));
    }
    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Stack stack = new Stack();
        String[] arrChar = str.split(" ");
        for (int i = 0; i < arrChar.length ; i++) {
            stack.push(arrChar[i]);
        }
        for (int i = 0; i < arrChar.length; i++) {
            System.out.println(stack.pop());
        }
    }
    public static void main1(String[] args) {
        //如果牛牛把6个队员划分到两个队伍
        //如果方案为:
        //team1:{1,2,5}, team2:{5,5,8}, 这时候水平值总和为7.
        //而如果方案为:
        //team1:{2,5,8}, team2:{1,5,5}, 这时候水平值总和为10.
        //没有比总和为10更大的方案,所以输出10.
//        2
//        5 2 8 5 1 5
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n*3];
        for (int i = 0; i < arr.length; i++ ) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[arr.length - 2*(i+1)];
        }
        System.out.println(sum);
    }
}
