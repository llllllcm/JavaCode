import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-26
 * Time: 22:01
 */
public class demo3 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{0,1,0,0,0},{0,0,1,0,1},{0,0,0,1,0},{0,0,1,0,0,},{0,0,0,0,1}};
        int count = 12;
        while(count > 0) {
            for (int i = 0; i < arr[0].length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    for (int k = 0; k < arr[0].length; k++) {
                        for (int l = 0; l < arr.length; l++) {
                            arr[i][j] = arr[k][l]*arr[l][k];
                        }
                    }
                }
            }
            count--;
        }
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i][j]);
            }
        }



    }
}
