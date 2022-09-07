package threading;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-09-05
 * Time: 23:30
 */
public class Demo6 {
    public static final long COUNT = 100_0000_0000L;
    public static void main(String[] args) {
        serial();
    }
    //串行执行任务
    public static void serial() {
        //记录ms级别的时间戳
        long begin = System.currentTimeMillis();

        long a = 0; 
        for (long i = 0; i < COUNT; i++) {
            a++;
        }
        a = 0;
        for (long i = 0; i < COUNT; i++) {
            a++;
        }
        long end = System.currentTimeMillis();
        System.out.println("执行的时间戳: " + (end - begin) + "ms");

    }
    //并行执行任务
    public static void concurrency() {

    }
}

