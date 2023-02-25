import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-02-23
 * Time: 10:31
 */
public class demo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = 0 ;
        int[] arr = new int[10000];
        while(scan.hasNextInt()) {
            arr[m++] = scan.nextInt();
        }
        Arrays.sort(arr,0,n);
        for(int i = 0; i < n-1; i++) {
            if(arr[i] != arr[i+1]-1) {
                System.out.println(arr[i]+1);
                break;
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }

    }
}
