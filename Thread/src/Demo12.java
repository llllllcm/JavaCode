/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-01-12
 * Time: 17:26
 */
public class Demo12 {
    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        //new就绪状态
        System.out.println(t.getState());
        t.start();
        //正在休眠
        Thread.sleep(400);
        System.out.println(t.getState());
        t.join();
        //结束之后，得到的是Terminated
        System.out.println(t.getState());
    }
}
