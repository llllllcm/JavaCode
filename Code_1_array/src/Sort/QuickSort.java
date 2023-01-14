package Sort;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-12-10
 * Time: 14:26
 */
public class QuickSort {
    private static void swap(int[] num, int a, int b) {
        int temp = num[a];
        num[a] = num[b];
        num[b] = temp;
    }
    public static int partitionHoare(int[] num,int start,int end) {
        //i是用来存储start的初始值的
        int i = start;
        int key = num[i];
        //如果num[end] 与 key 判断的时候不取等号，就会造成死循环。
        while(start < end) {
            while(start < end && num[end] >= key) {
                end--;
            }
            while (start < end && num[start] <= key) {
                start++;
            }
            swap(num,start,end);
        }
        swap(num,start,i);
        return start;

    }
    public static int partitionHole(int[] num,int start,int end) {
        int key = num[start];
        while(start < end) {
            while (start < end && num[end] >= key) {
                end--;
            }
             num[start] = num[end];
            while (start < end && num[start] <= key) {
                start++;
            }
            num[end] = num[start];
        }
        //相遇了
        num[start] = key;
        return start;
    }
    public static void quickSort(int[] num,int left,int right) {
        //这里的大于号代表的是可能没有子树。
        if(left>= right) {
            return;
        }
        int pivot = partitionHole(num,left,right);
        quickSort(num,left,pivot-1);
        quickSort(num,pivot+1,right);
    }
    public static void main(String[] args) {
        int[] num = new int[] {2,3,1,5,10,8,4};
        quickSort(num,0,num.length-1);
        System.out.println(Arrays.toString(num));
    }
}
