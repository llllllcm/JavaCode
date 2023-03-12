import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-02-26
 * Time: 15:06
 */
public class TestSort {
    public static void main(String[] args) {
        int[] arr = new int[] {3,1,6,2,7,3,10};
//        Sort.insertSort(arr);
//        Sort.shellSort(arr);
//        Sort.selectSort(arr);
//        Sort.heapSort(arr);
//        Sort.bubbleSort(arr);
        Sort.quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
