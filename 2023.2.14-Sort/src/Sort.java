/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-02-14
 * Time: 23:41
 */
public class Sort {
    /**
     * 直接插入排序
     * 时间复杂度：逆序的时候(最坏)-> O(n^2)
     *          有序的时候(最好)-> O(n)
     *          结论：在数据基本有序的时候，使用直接插入排序
     * 空间复杂度：O(1)
     * 稳定性：稳定
     * @param num
     */
    public static void insertSort(int[] num) {
        for (int i = 1; i < num.length; i++) {
            int tmp = num[i];
            int j = i-1;
            for (; j >= 0; j--) {
                if (num[j] > tmp) {
                    num[j+1] = num[j];
                }else {
                    break;
                }
            }
            num[j+1] = tmp;
        }
    }


    /**
     * 希尔排序
     * 时间复杂度：O(n^1.3~n^1.5)
     * 空间复杂度：O(1)
     * 稳定性：不稳定
     * @param num
     */
    public static void shell(int[] num, int gap) {
        for (int i = gap; i < num.length; i++) {
            int tmp = num[i];
            int j = i - gap;
            for (; j >= 0; j -=gap) {
                if (num[j] > tmp) {
                    num[j+gap] = num[j];
                }else {
                    break;
                }
            }
            num[j+gap] = tmp;
        }
    }
    public static void shellSort(int[] num) {
        int gap = num.length;
        while (gap > 1) {
            shell(num,gap);
            gap /= 2;
        }
        shell(num,1);
    }


        /**
         * 直接选择排序
         * 时间复杂度：O(n^2) -> 对数据不敏感，不管你是有序还是无序，时间复杂度不变
         * 空间复杂度：O(1)
         * 稳定性： 不稳定的排序
         * @param num
         */
    public static void selectSort(int[] num) {
        for (int i = 0; i < num.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < num.length; j++) {
                if (num[j] < num[minIndex]) {
                    minIndex = j;
                }
            }
            swap(num,i,minIndex);
        }
    }
    public static void selectSort2(int[] num) {
        int left = 0;
        int right = num.length-1;
        while(left < right) {
            int minIndex = left;
            int maxIndex = left;
            for (int i = left+1; i <= right; i++) {
                if(num[i] > maxIndex) {
                    maxIndex = i;
                }
                if (num[i] < minIndex) {
                    minIndex = i;
                }
            }
            swap(num,left,minIndex);
            if (left == maxIndex) {
                maxIndex = minIndex;
            }
            swap(num,right,maxIndex);
            left++;
            right--;
        }
    }

    private static void swap(int[] array, int i, int minIndex) {
        int tmp = array[i];
        array[i] = array[minIndex];
        array[minIndex] = tmp;
    }

    /**
     * 时间复杂度：O(n*logn)
     * 空间复杂度：O(1)
     * 稳定性：不稳定的
     * @param num
     */
    public static void heapSort(int[] num) {
        createBigHeap(num);
        int end = num.length - 1;
        while (end >= 0) {
            swap(num,0,end);
            shiftDown(num,0,end);
            end--;
        }
    }
    private static void createBigHeap(int[] num) {
        for (int parent = (num.length-1-1)/2; parent >=0; parent--) {
            shiftDown(num,parent,num.length);
        }
    }

    /**
     * 实现向下调整
     * @param num
     * @param parent 每颗子树的根节点的下标
     * @param len 每颗子树调整的结束位置
     */
    private static void shiftDown(int[] num,int parent,int len) {
        int child = 2*parent + 1;
        //最起码保证有左孩子
        while (child < len) {
            //判断左右孩子最大值的前提是必须有右孩子
            if (child+1 < len && num[child] < num[child+1]) {
                child++;//此时保存了最大值的下标
            }
            if (num[child] > num[parent]) {
                swap(num,child,parent);
                parent = child;
                child = 2*parent+1;
            }else {
                break;
            }
        }
    }

    /**
     * 冒泡排序
     * 时间复杂度：O(N^2)
     * 空间复杂度：O(1)
     * 稳定性：稳定
     * @param num
     */
    public static void bubbleSort(int[] num) {
        for (int i = 0; i < num.length-1; i++) {
            for (int j = 0; j < num.length-1-i; j++) {
                if (num[j] > num[j+1]) {
                    swap(num,j,j+1);
                }
            }
        }
    }
    public static void bubbleSort2(int[] num) {
        for (int i = 0; i < num.length-1; i++) {
            boolean flag = false;
            for (int j = 0; j < num.length-1-i; j++) {
                if (num[j] > num[j+1]) {
                    swap(num,j,j+1);
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    /**
     * 快速排序
     * 时间复杂度：n*logN【最好状态】 O(N^2)【最坏情况】
     * 空间复杂度：
     * 稳定性：
     * @param num
     */
    public static void quickSort(int[] num,int left,int right) {
        //等于是因为代表只有一个节点，大于是因为left可能会大于right
        if(left >= right) {
            return;
        }
        int pivot = partition(num,left,right);
        quickSort(num,left,pivot-1);
        quickSort(num,pivot+1,right);
    }
    private static int partition(int[] num,int start,int end) {
        int i = start;
        int key = num[start];
        while (start < end) {
            //这里添加start < end 是因为可能会出现数组越界的情况
            //为啥这里取等号？
            //防止进入死循环，比如 3，4，2，5，3 这种情况。即 key与left和right相等。
            while (start < end && num[end] >= key) {
                end--;
            }
            while (start < end && num[start] <= key) {
                start++;
            }
            swap(num,start,end);
        }
        swap(num,i,start);
        return start;
    }
}
