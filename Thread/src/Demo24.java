import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-01-26
 * Time: 23:22
 */

public class Demo24 {
    public static void main(String[] args) {
        //此处创建线程池，没有显示的new，而是通过另外 Executors 类的静态方法newCachedThreadPool来完成
        //这种做法叫做工厂模式，对应此处的newCachedThreadPool()方法就是工厂方法。
        ExecutorService pool = Executors.newCachedThreadPool();
        pool.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        });
    }
}
