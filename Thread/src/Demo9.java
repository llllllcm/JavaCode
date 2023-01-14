/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-01-05
 * Time: 16:42
 */
public class Demo9 {
    //因为多个线程公用同一份内存空间所以在main线程中修改可以影响到其他线程
    private static boolean isQuit = false;
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            while(!isQuit) {
                System.out.println("hello thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
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
        isQuit = true;
        System.out.println("设置t线程结束");
    }
}
