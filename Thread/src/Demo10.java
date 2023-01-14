/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-01-05
 * Time: 16:42
 */
public class Demo10 {
    //因为多个线程公用同一份内存空间所以在main线程中修改可以影响到其他线程
    private static boolean isQuit = false;
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            //这里的currentThread()方法是Thread类的静态方法，通过这个方法，就可以拿到当前线程的实例，即拿到当前线程对应的 Thread对象。
            while(!Thread.currentThread().isInterrupted()) {
                System.out.println("hello thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
//                    e.printStackTrace();
                    //方式1 立即执行
//                    break;
                    //方式2 不理会

                    //方式3 稍后理会
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        e.printStackTrace();
                    }
                    break;
                }
            }
            System.out.println("t线程执行完成了");
        });
        t.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt();
        System.out.println("设置t线程结束");
    }
}
