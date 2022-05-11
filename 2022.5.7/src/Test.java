import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:知识巩固
 * User: 86136
 * Date: 2022-05-07
 * Time: 13:51
 */
public class Test {
    public static void main1(String[] args) {
        //数组的三种初始化方式
        int[] array1 = {1,2,3,4,5};//1 ,2 意义类似、
        int[] array2 = new int[]{1,2,3,4,5};
        int[] array3 = new int[5];
        //创建了5个数组空间，但是每个的大小为0.
        //打印数组
       /* for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]+" ");
        }*/
        /*for (int x:array1) {
            System.out.print(x+" ");

        }*/
        //在java中提供了为了更好操作数组，提供了一系列的方法，在工具类Arrays中

        String ret = Arrays.toString(array1);
        System.out.println(ret);


    }

    public static void main2(String[] args) {
        int[] array1 = new int[3];
        array1[0] = 10;
        array1[1] = 20;
        array1[2] = 30;

        int[] array2 = new int[]{1,2,3,4,5};
        array2[0] = 100;
        array2[1] = 200;
        array1 = array2;
        array2[2] = 300;
        array2[3] = 400;
        array2[4] = 500;
        for (int x:array2) {
            System.out.println(x);

        }
        String ret = Arrays.toString(array2);
        System.out.println(ret);

    }

    public static void main3(String[] args) {
        //小写的null置为空。
        int[] array = null;
        System.out.println(array[2]);



    }
    public static void test2(int tmpArray[]) {
        tmpArray = new int[]{11,22,33};
    }
    public static void test1(int tmpArray[]) {
        //这样是可以更改数组的值的
        tmpArray[2] = 100;

    }

    public static void main5(String[] args) {
        int[] array = {1,2,3,4,5};
        test2(array);
        String ret = Arrays.toString(array);
        System.out.println(ret);

    }

    public static void main4(String[] args) {
        //这里打印的不是array的内容，而是地址。
        int[] array = {1,2,3,4,5};
        test1(array);
        System.out.println(array);
    }
    public static int[] test3() {
        int[] tmp = {1,2,3,4,5};
        return tmp;
    }

    public static void main6(String[] args) {
        int[] arr = test3();
        //这里是因为test是函数，结束后会销毁，但是tmp的内容在堆上，系统回收之前要判断这里的值会不会被引用，
        // 这里得到了引用，所以没被销毁
        System.out.println(Arrays.toString(arr));
    }
    public static String myToString(int[] tmp) {
        if (tmp == null) return "null";
        String ret ="[";
        for (int i = 0; i < tmp.length ; i++) {
            ret += tmp[i];//这里进行了隐式的类型转换
            if (i< tmp.length-1) {
                ret+=", ";
            }
        }
        ret +="]";
        return ret;

    }

    public static void main7(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(myToString(arr));
    }
    public static void transform(int[] temp) {
        for (int i = 0; i < temp.length; i++) {
            temp[i]*=2;
        }

    }

    public static void main8(String[] args) {
        /**
         * 实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 ,
         * 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
         */
        //可以分为两个方法这题：
        //1、对数组本身进行修改  2、生成另外一个数组。对其进行修改
        int[] array = new int[]{1,2,3,4};
        transform(array);
        System.out.println(Arrays.toString(array));


    }

    public static void main9(String[] args) {
        /**
         * 创建一个 int 类型的数组, 元素个数为 100,
         * 并把每个元素依次设置为 1 - 100
         */
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i+1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main10(String[] args) {
        /**
         * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
         * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
         * 你可以按任意顺序返回答案。
         * 示例 1：
         * 输入：nums = [2,7,11,15], target = 9
         * 输出：[0,1]
         * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
         */
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // 返回值
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        System.out.println(Arrays.toString(result));


    }
    public static void bubbleSort(int[] temp) {
        /*
        for (int i = 0; i < temp.length-1 ; i++) {//趟数
            for (int j = 0; j < temp.length-1-i; j++) {//比较的次数
                if(temp[j]>temp[j+1]) {
                    int x = temp[j+1];
                    temp[j+1] = temp[j];
                    temp[j] = x;
                }

            }
        }*/
        //以上代码可以改良，因为如果是已经有部分或者全部排好序的可以跳过
        for (int i = 0; i < temp.length-1 ; i++) {//趟数
            boolean flag = false;
            for (int j = 0; j < temp.length-1-i; j++) {//比较的次数
                if(temp[j]>temp[j+1]) {
                    int x = temp[j+1];
                    temp[j+1] = temp[j];
                    temp[j] = x;
                    flag = true;
                }
            }
            if (flag == false)
                break;
        }

    }

    public static void main11(String[] args) {
        /**
         * 给定一个整型数组, 实现冒泡排序(升序排序)
         */
        int[] num = new int[]{2,1,4,3,5};
        bubbleSort(num);
        System.out.println(Arrays.toString(num));

    }

    public static void main12(String[] args) {
        /**
         * 实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
         */
        int[] num = new int[]{1,2,3,4};
        int[] copy = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            copy[i] = num[i];
        }
        System.out.println(Arrays.toString(copy));

    }

    /**
     * 函数尽量不要打印，这种判断应该用boolean类型来写
     * @param temp
     */
    public static boolean isOrder(int temp[]){
        int i = 0;
        for ( i = 0; i < temp.length-1; i++) {
            if (temp[i]>temp[i+1]){
               return false;
            }
        }
       return true;
    }
//    public static void isOrder(int temp[]){
//        int i = 0;
//        for ( i = 0; i < temp.length-1; i++) {
//            if (temp[i]>temp[i+1]){
//                System.out.println("不是递增数列");
//                break;
//            }
//        }
//        if(i == temp.length-1){
//            System.out.println("是递增数列");
//        }
//
//    }

    public static void main(String[] args) {
        /**
         * 给定一个整型数组, 判定数组是否有序（递增
         */
        int[] arr = new int[]{1,2,4,5};
        System.out.println(isOrder(arr));

    }
    public static int binaryFind(int[] temp,int toFind) {
        int left = 0;
        int right = temp.length-1;
        int mid = 0;
        while(left<=right) {
            mid = (left+right)/2;
            if(toFind == temp[mid]){
                return mid;
            } else if (toFind < temp[mid]) {
                right = mid-1;
            } else if (toFind > temp[mid]) {
                left = mid+1;
            }

        }
        return -1;//找不到退出循环。
    }

    public static void main14(String[] args) {
        /**
         * 给定一个有序整型数组, 实现二分查找,找到后返回其下标
         */
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        int toFind = 6;
        int index = binaryFind(array, toFind);
        if (index != -1) {
            System.out.println("找到了，下标是" + index);
        } else {
            System.out.println("找不到");
        }
    }

    public static void main15(String[] args) {
        /**
         * 求一个数组的平均值
         */
        int sum = 0;
        int[] array = new int[]{1,2,3,4};
        for (int x:array) {
            sum+=x;
        }
        System.out.println("average： "+sum*1.0/ array.length);

    }

    public static void main16(String[] args) {
        //java中提供了一种方法可以直接实现二分查找
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        int index = Arrays.binarySearch(array,6);
        System.out.println(index);

    }

    public static void main17(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        int[] copy = Arrays.copyOf(array,array.length*2);
        //如果你要拷贝一部分，那当然也是可以的
        int[] copy2 = Arrays.copyOfRange(array,1,3);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(copy));
        System.out.println(Arrays.toString(copy2));



    }

    public static void main18(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        int[] copy = new int[array.length];
        System.arraycopy(array,0,copy,0,array.length);//啥都可以，因为object是祖先类
        System.out.println(Arrays.toString(copy));

    }

    public static void main13(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        int[] copy = array.clone();//产生一个副本
        System.out.println(Arrays.toString(copy));
        System.out.println(Arrays.toString(array));
    }
}
