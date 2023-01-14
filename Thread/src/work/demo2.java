package work;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-01-12
 * Time: 1:59
 */
class SumOperator {
    //偶数
    long evenSun;
    //奇数
    long oddSum;
    public void addEvenSum(int num) {
        evenSun += num;
    }
    public void addOddSum(int num) {
        oddSum += num;
    }
    public long result() {
        System.out.println("偶数和"+ evenSun);
        System.out.println("奇数和"+ oddSum);
        return evenSun + oddSum;
    }

}
public class demo2 {
    public static void main(String[] args) throws InterruptedException {
        //数组的准备
        int capacity = 1000_0000;
        int[] arr = new int[capacity];
        //记录开始时间
        long start = System.currentTimeMillis();
        //构造随机数
        Random random = new Random();
        for (int i = 0; i < capacity; i++) {
            int num = random.nextInt(100)+1;
            arr[i] = num;
        }
        SumOperator sum = new SumOperator();
        //计算偶数的下标和
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < capacity; i +=2) {
                sum.addEvenSum(arr[i]);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 1; i < capacity; i += 2) {
                sum.addOddSum(arr[i]);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        long end = System.currentTimeMillis();
        System.out.println("计算的结果" + sum.result());
        System.out.println("总耗时" + (end-start)+"ms");

    }
}
