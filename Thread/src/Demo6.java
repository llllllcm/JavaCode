/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-01-04
 * Time: 20:09
 */
public class Demo6 {
    public static final long COUNT = 10_0000_0000;

    public static void main(String[] args) throws InterruptedException {
        serial();
//        concurrency();
    }
    //串行执行任务
    public static void serial() {
        //记录一个毫秒级别的时间戳
        long beg = System.currentTimeMillis();

        long a = 0;
        for (long i = 0; i < COUNT; i++) {
            a++;
        }
        a = 0;
        for (long i = 0; i < COUNT; i++) {
            a++;
        }
        long end = System.currentTimeMillis();
        System.out.println("执行的时间间隔：" + (end - beg) +"ms");
    }
    //并发执行
    public static void concurrency() throws InterruptedException {
        long beg = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            long a = 0;
            for (long i = 0; i < COUNT; i++) {
                a++;
            }
        });
        Thread t2 = new Thread(() -> {
            long a = 0;
            for (long i = 0; i < COUNT; i++) {
                a++;
            }
        });
        t1.start();
        t2.start();
        //当main执行完t1.start 和 t2.start 之后，仍然会继续往前走
        //如果t1和t2还没执行完，就计算时间是不合适的，所以需要使用join方法，
        //等待main线程执行完t1和t2后才停止计时
        t1.join();
        t2.join();
        long end = System.currentTimeMillis();
        System.out.println("执行的时间间隔：" + (end - beg) +"ms");
    }
}
