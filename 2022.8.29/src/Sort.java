/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-08-29
 * Time: 9:12
 */
public class Sort {
    /**
     * 直接插入排序
     * 时间复杂度:
     *   最好的情况: O(n)   有序
     *   最坏的情况: O(n^2) 逆序
     *   结论: 对于直接插入排序，数据有序的话，速度越快
     *   适用场景: 当数据基本上有序的时候，使用直接插入排序
     * 空间复杂度: O(1)
     * 一个本身稳定的排序可以实现不稳定的，反之则不行
     * @param arr
     */
    public static void insertSort(int[] arr){
        int tmp = 0;
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            tmp = arr[i];
            for (j = i-1; j >= 0 ; j--) {
                if (arr[j] > tmp){
                    arr[j+1] = arr[j];
                }else {
                    break;
                }
            }
            /**
             * 退出来无非就两种情况
             * 1.arr[j] < tmp，
             * 2.j越界
             */
            arr[j+1] = tmp;
        }


    }
}
