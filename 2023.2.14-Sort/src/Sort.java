import java.util.Stack;

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
     * 时间复杂度：n*logN【最好状态-> 每次都均分待排序的数据】
     *          O(N^2)【最坏情况-> 数据有序或者逆序】
     * 空间复杂度：logN
     * 稳定性：不稳定
     * @param num
     */
    public static void quickSortHoare(int[] num,int left,int right) {
        //等于是因为代表只有一个节点，大于是因为left可能会大于right
        if(left >= right) {
            return;
        }
        int pivot = partition1(num,left,right);
        quickSortHoare(num,left,pivot-1);
        quickSortHoare(num,pivot+1,right);
    }

    /**
     * hoare法
     * @param num
     * @param start
     * @param end
     * @return
     */
    private static int partition1(int[] num,int start,int end) {
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
    public static void quickSortHole(int[] num,int left,int right) {
        //等于是因为代表只有一个节点，大于是因为left可能会大于right(有序或者逆序的情况)
        if(left >= right) {
            return;
        }
        int pivot = partition2(num,left,right);
        quickSortHole(num,left,pivot-1);
        quickSortHole(num,pivot+1,right);
    }

    /**
     * 挖坑法
     * @param num
     * @param start
     * @param end
     * @return
     */

    private static int partition2(int[] num,int start,int end) {
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

    /**
     * 前后指针法(快排)
     * @param num
     * @param left
     * @param right
     */
    public static void quickSortPointer(int[] num,int left,int right) {
        //等于是因为代表只有一个节点，大于是因为left可能会大于right(有序或者逆序的情况)
        if(left >= right) {
            return;
        }
        int pivot = partition3(num,left,right);
        quickSortHoare(num,left,pivot-1);
        quickSortHoare(num,pivot+1,right);
    }

    private static int partition3(int[] num,int start,int end) {
        int prev = start;
        int cur = start+1;
        while(cur <= end) {
            if (num[cur] < num[start] && num[++prev] != num[cur]) {
                swap(num,cur,prev);
            }
            cur++;
        }
        swap(num,start,prev);
        return prev;
    }

    /**
     * 快排优化
     * 时间复杂度：n*logN
     * 空间复杂度：最好：O(logN)。最坏。O(N) 当n足够大的时候，递归的深度就大
     * 稳定性：不稳定。
     * @param num
     * @param start
     * @param end
     */
    public static void insertSort2(int[] num,int start,int end) {
        for (int i = start+1; i <= end; i++) {
            int tmp = num[i];
            int j = i-1;
            for (; j >= start; j--) {
                if (num[j] > tmp) {
                    num[j+1] = num[j];
                }else {
                    break;
                }
            }
            num[j+1] = tmp;
        }
    }
    public static void quickSort(int[] num,int left,int right) {
        //等于是因为代表只有一个节点，大于是因为left可能会大于right(有序或者逆序的情况)
        if(left >= right) {
            return;
        }
        //小区间使用了插入排序，主要是优化了递归的深度
        if (right - left + 1 <= 7) {
            insertSort2(num,left,right);
            return;
        }
        //三数取中,用了这个方法每次的待排序序列，每次基本都是采取二分的方法。
        int index = midNumIndex(num,left,right);
        swap(num,left,index);
        int pivot = partition2(num,left,right);
        quickSort(num,left,pivot-1);
        quickSort(num,pivot+1,right);
    }
    //全排列-六种情况
    private static int midNumIndex(int[] num,int left,int right) {
        int mid = (left + right) / 2;
        if(num[left] < num[right]) {
            if (num[mid] < num[left]) {
                return left;
            }else if(num[mid] > num[right]) {
                return right;
            }else {
                return mid;
            }
        }else {
            if (num[mid] < num[right]) {
                return right;
            } else if (num[mid] > num[left]) {
                return left;
            }else {
                return mid;
            }
        }
    }

    /**
     * 非递归实现快排
     * @param arr
     */
    public static void quickSort(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int left = 0;
        int right = arr.length-1;
        int pivot = partition2(arr,left,right);
        if (pivot > left+1) {
            stack.push(left);
            stack.push(pivot-1);
        }
        if (pivot < right-1) {
            stack.push(pivot+1);
            stack.push(right);
        }
        while (!stack.empty()) {
            right = stack.pop();
            left = stack.pop();
            pivot = partition2(arr,left,right);
            if (pivot > left+1) {
                stack.push(left);
                stack.push(pivot-1);
            }
            if (pivot < right-1) {
                stack.push(pivot+1);
                stack.push(right);
            }
        }
    }
    private static void mergeSortFunc(int[] arr,int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        // 1.分解左边
        mergeSortFunc(arr,left,mid);
        // 2.分解右边
        mergeSortFunc(arr,mid+1,right);
        // 3.进行合并
        merge(arr,left,right,mid);
    }
    private static void merge(int[] arr, int start, int end,
                              int mid) {
        int[] tmpArr = new int[end-start+1];
        //tmpArr 数组的下标
        int k = 0;
        int s1 = start;
        int s2 = mid+1;
        //两个归并段都有数据
        while (s1 <= mid && s2 <= end) {
            if (arr[s1] <= arr[s2]) {
                tmpArr[k++] = arr[s1++];
            }else {
                tmpArr[k++] = arr[s2++];
            }
        }
        //到走这里时候，说明有一段的数据中没了数据，需要拷贝另一端的全部数据到数组中。
        while (s1 <= mid) {
            tmpArr[k++] = arr[s1++];
        }
        while (s2 <= end) {
            tmpArr[k++] = arr[s2++];
        }
        //把排好序的数字拷贝会原数组
        for (int i = 0; i < k; i++) {
            arr[i+start] = tmpArr[i];
        }
    }

    /**
     * 时间复杂度；O(n*logN)
     * 空间复杂度：O(N)
     * 稳定性：稳定排序
     * 直接插入排序，冒泡排序，归并
     * @param arr
     */

    public static void mergerSort(int[] arr) {
        mergeSortFunc(arr,0,arr.length-1);
    }

    /**
     * 非递归实现归并排序
     * @param arr
     */
    public static void mergerSort2(int[] arr) {
        int gap = 1;

        while(gap < arr.length) {

            for (int i = 0; i < arr.length; i += gap*2) {
                int s1 = i;
                int e1 = s1+gap-1;
                if (e1 >= arr.length) {
                    e1 = arr.length-1;
                }
                int s2 = e1+1;
                if (s2 >= arr.length) {
                    s2 = arr.length-1;
                }
                int e2 = s2+gap-1;
                if (e2 >= arr.length) {
                    e2 = arr.length-1;
                }
                merge(arr,s1,e2,e1);
            }
            gap *= 2;
        }
    }

    /**
     * 计数排序
     * 适合给定一个范围数据进行排序
     * @param num
     */
    public static void countSort(int[] num) {
        int maxVal = num[0];
        int minVal = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] < minVal) {
                minVal = num[i];
            }
            if (num[i] > maxVal) {
                maxVal = num[i];
            }
        }
        int len = maxVal - minVal + 1;
        int[] count = new int[len];
        //开始遍历num数组，开始计数。
        for (int i = 0; i < num.length; i++) {
            int val = num[i];
            count[val-minVal]++;
        }
        //这时num数组的下标
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            //确保当前count数组可以打印完成
            while (count[i] != 0) {
                num[index] = i+minVal;
                index++;
                count[i]--;
            }
        }
    }

}
