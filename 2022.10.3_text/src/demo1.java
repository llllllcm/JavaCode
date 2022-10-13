/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-03
 * Time: 18:27
 */
public class demo1 {
    //打印100~200之间的素数
    //方法一 试除法
    public static void main1(String[] args) {
        for (int i = 101; i <= 200 ; i +=2 ) {
            int flag = 1;//用来标记这个数是否为素数
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.print(i+" ");
            }
        }
    }
    //筛选法
    public static void main(String[] args) {
        //默认数组各个大小为0
        int n = 100;
        int[] arr = new int[n+1];
        int m = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            //判断一下当前元素有无被标记
            if (arr[i] == 0) {
                //说明没有被标记
                m = n/i;
                for (int j = 2; j <= m; j++) {
                    arr[i*j] = 1;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (arr[i] == 0) {
                System.out.print(i+" ");
                count++;
                //控制换行
                if (count == 10) {
                    System.out.println();
                    count = 0;
                }
            }
        }
    }
}
