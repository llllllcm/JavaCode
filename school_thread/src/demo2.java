/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-12-06
 * Time: 10:57
 */
public class demo2 {
    class MyThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
    public static void main(String[] args) {
        Thread t1 = new Thread();
        t1.setName("t1");
        t1.start();
        Thread t2 = new Thread();
        t2.setName("t2");
        t2.start();
        for (int i = 0; i < 50; i++) {
            System.out.println("main : "+i);
        }
    }
}
