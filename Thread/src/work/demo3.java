package work;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-01-12
 * Time: 14:23
 */
public class demo3 {
    public static void main(String[] args) throws InterruptedException {
        Thread[] t = new Thread[20];
        for (int i = 0; i < 20; i++) {
            final int n = i;
            t[i] = new Thread(() -> {
                System.out.println(n);
            });
            t[i].start();
            t[i].join();
        }
        System.out.println("ok");
    }
}
