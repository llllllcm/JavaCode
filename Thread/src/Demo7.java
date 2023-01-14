/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-01-05
 * Time: 16:05
 */
public class Demo7 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            while (true) {
                System.out.println("hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        //可以使用setDaemon 来设置为后台线程
        //注意这里的设置需要在线程启动之前，即start之前。否则修改无效。
        t.setDaemon(true);
        t.start();
        System.out.println("main线程执行结束");
    }
}
