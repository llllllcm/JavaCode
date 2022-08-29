import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-08-29
 * Time: 11:17
 */
public class TestSort {
    public static void TestInsertSort(int[] arr){
        Long startTime = System.currentTimeMillis();
        Sort.insertSort(arr);
        Long endTime = System.currentTimeMillis();
        System.out.println("直接插入排序耗时:  "+(endTime-startTime));
    }

    public static void initArrayOrder(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = i;
        }
    }
    public static void initArrayNotOrder(int[] arr){
        Random random = new Random();
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = random.nextInt(10_0000);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[10_0000];
        Sort sort = new Sort();
        initArrayNotOrder(arr);
        TestInsertSort(arr);

    }

}
