/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-02-26
 * Time: 14:51
 */
public class Sort {
    // 插入排序
    public static void insertSort(int[] array){
        // write code  here
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i-1;
            for (; j >= 0 ; j--) {
                if(array[j] > tmp) {
                    array[j+1] = array[j];
                }else {
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }


        // 希尔排序
    public  static void shell(int[] array,int gap){
        // write code here
        for (int i = gap; i < array.length; i++) {
            int tmp = array[i];
            int j = i - gap;
            for (; j >= 0; j -= gap) {
                if (array[j] > tmp) {
                    array[j+gap] = array[j];
                }else {
                    break;
                }
            }
            array[j+gap] = tmp;
        }
    }
    public static void shellSort(int[] array) {
        int gap = array.length;

        while (gap > 1) {
            shell(array,gap);
            gap /= 2;
        }
        //前面是尽量让待排序的数据趋于有序
        shell(array,1);
    }
    // 选择排序
    public static void selectSort(int[] array){
        // write code  here
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(array,i,minIndex);
        }
    }

    private static void swap(int[] array, int j, int minIndex) {
        int tmp = array[j];
        array[j] = array[minIndex];
        array[minIndex] = tmp;
    }


    /**
     * 堆排序的流程：
     * 1.建立一个大根堆
     * 2.每次最后一个元素跟堆顶元素交换
     * 3.之后进行向下调整
     *
     */
    public static void createBigHeap(int[] array) {
        for (int parent = (array.length-1-1)/2; parent >= 0 ; parent--) {
            shiftDown(array,parent,array.length);
        }
    }
    public static void heapSort(int[] array){
        // write code  here
        createBigHeap(array);
        int end = array.length-1;

        while(end >= 0) {
            swap(array,0,end);
            shiftDown(array,0,end);
            end--;
        }
    }

    /**
     *
     * @param array
     * @param parent 每颗子树的根节点
     * @param len 每颗子树调整的结束位置。
     */

    private static void shiftDown(int[] array,int parent,int len) {
        int child = 2*parent + 1;//child下标储存较大值
        //确保有左孩子
        while (child < len) {
            if (child + 1 < len && array[child] < array[child+1]) {
                child++;
            }
            if (array[child] > array[parent]) {
                swap(array,child,parent);
                parent = child;
                child = parent*2+1;
            }else {
                break;
            }
        }
    }
    public static void bubbleSort(int[] num) {
        for (int i = 0; i < num.length-1; i++) {
            for (int j = 0; j < num.length-1-i; j++) {
                if (num[j] > num[j+1]) {
                    swap(num,j,j+1);
                }
            }
        }
    }

    public static int partition(int[] num,int start,int end) {
        int key = num[start];
        while (start < end) {
            while (start < end && num[end] >= key) {
                end--;
            }
            num[start] = num[end];
            while (start < end && num[start] <= key) {
                start++;
            }
            num[end] = num[start];
        }
        num[start] = key;
        return start;
    }
    public static void quickSortHole(int[] num,int left,int right) {
        if (left >= right) {
            return;
        }
        int pivot = partition(num,left,right);
        partition(num,left,pivot-1);
        partition(num,pivot+1,right);
    }

    public static void quickSort(int[] num) {
        quickSortHole(num,0, num.length-1);
    }

    public static void mergeSort1(int[] array,int left,int right){
        // write code  here
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        //分解左边
        mergeSort1(array,left,mid);
        //分解右边
        mergeSort1(array,mid+1,right);
        //合并
        merge(array,left,right,mid);
    }

    private static void merge(int[] array, int left, int right, int mid) {
        int[] tmpArr = new int[right-left+1];
        int k = 0;//表示tmpArr数组的下标
        int s1 = left;
        int s2 = mid+1;
        //两边都有数据
        while(s1 <= mid && s2 <= right) {
            if (array[s1] < array[s2]) {
                tmpArr[k++] = array[s1++];
            }else {
                tmpArr[k++] = array[s2++];
            }
        }
        //只有一边有数据
        while (s1 <= mid) {
            tmpArr[k++] = array[s1++];
        }
        while (s2 <= right) {
            tmpArr[k++] = array[s2++];
        }
        for (int i = 0; i < k; i++) {
            array[i+left] = tmpArr[i];
        }
    }

    // 归并排序---非递归
    public static void mergeSort2(int[] array){
        // write code  here

    }

// 计数排序
    public static void countSort(int[] array){
        // write code  here
    }
}
