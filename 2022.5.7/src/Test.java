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

    public static void main(String[] args) {
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
}
