package Sort;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-12-10
 * Time: 14:26
 */
public class SelectSort {
    public static void selectSort1(int[] num) {
        for (int i = 0; i < num.length ; i++) {
            int minIndex = i;
            for (int j = i+1; j < num.length ; j++) {
                if(num[j] < num[minIndex]) {
                    minIndex = j;

                }
            }
            swap(num,i,minIndex);
        }
    }
    //对上述代码进行优化,缩短其时间复杂度。
    public static void selectSort(int[] num) {
        int left = 0;
        int right = num.length-1;
        while(left < right) {
            int minIndex = left;
            int maxIndex = left;
            for (int i = left+1 ; i <= right ; i++) {
                if(num[i] > num[maxIndex]) {
                    maxIndex = i;
                }
                if(num[i] < num[minIndex]) {
                    minIndex = i;
                }
            }
            swap(num,minIndex,left);
            if(maxIndex == left) {
                maxIndex = minIndex;
            }
            swap(num,maxIndex,right);
            left++;
            right--;
        }
    }

    private static void swap(int[] num, int a, int b) {
        int temp = num[a];
        num[a] = num[b];
        num[b] = temp;
    }

    public static void main(String[] args) {
        int[] num = new int[] {2,3,1,5,10,8,4};
        selectSort(num);
        System.out.println(Arrays.toString(num));
    }
}
