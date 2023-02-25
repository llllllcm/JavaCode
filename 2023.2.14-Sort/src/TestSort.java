import java.util.Arrays;
import java.util.Random;
import java.util.SplittableRandom;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-02-14
 * Time: 23:41
 */
public class TestSort {
    public static void main1(String[] args) {
        int[] arr = new int[10_0000];
//        int[] a = new int[] {1,3,7,45,2,0};
//        Sort.quickSort(a,0,a.length-1);
//        System.out.println(Arrays.toString(a));
//        initArrayNotOrder(arr);
        initArrayOrder(arr);
        testHeapSort(arr);
//        testQuickSort1(arr);
        testQuickSort3(arr);

        testShellSort(arr);
    }
    public static void main(String[] args) {
        int[] a = new int[] {10,6,7,1,3,9,4,2};
//        Sort.quickSort(a,0,a.length-1);
//        System.out.println(Arrays.toString(a));
//        initArrayNotOrder(arr);
//        Sort.quickSort(a);
        Sort.mergerSort2(a);
        System.out.println(Arrays.toString(a));

    }
    public static void testQuickSort1(int[] num) {
        num = Arrays.copyOf(num,num.length);
        long startTime = System.currentTimeMillis();
        Sort.quickSortHoare(num,0, num.length - 1);
        long endTime = System.currentTimeMillis();
        System.out.println("快速排序耗时为: "+(endTime-startTime));
    }
    public static void testQuickSort2(int[] num) {
        num = Arrays.copyOf(num,num.length);
        long startTime = System.currentTimeMillis();
        Sort.quickSortHole(num,0, num.length - 1);
        long endTime = System.currentTimeMillis();
        System.out.println("快速排序耗时为: "+(endTime-startTime));
    }
    public static void testQuickSort3(int[] num) {
        num = Arrays.copyOf(num,num.length);
        long startTime = System.currentTimeMillis();
        Sort.quickSort(num,0, num.length - 1);
        long endTime = System.currentTimeMillis();
        System.out.println("快速排序耗时为: "+(endTime-startTime));
    }
    public static void testHeapSort(int[] num) {
        num = Arrays.copyOf(num,num.length);
        long startTime = System.currentTimeMillis();
        Sort.heapSort(num);
        long endTime = System.currentTimeMillis();
        System.out.println("堆排序耗时为: "+(endTime-startTime));
    }
    public static void testShellSort(int[] num) {
        num = Arrays.copyOf(num,num.length);
        long startTime = System.currentTimeMillis();
        Sort.shellSort(num);
        long endTime = System.currentTimeMillis();
        System.out.println("希尔排序耗时为: "+(endTime-startTime));
    }
    public static void testInsertSort(int[] num) {
        num = Arrays.copyOf(num,num.length);
        long startTime = System.currentTimeMillis();
        Sort.insertSort(num);
        long endTime = System.currentTimeMillis();
        System.out.println("直接插入排序耗时为: "+(endTime-startTime));
    }
    public static void initArrayNotOrder(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000_0000);
        }
    }
    public static void initArrayOrder(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }

}
