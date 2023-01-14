package work;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-01-12
 * Time: 1:47
 */
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("我的run");
    }
}
class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("实现自己的接口");
    }
}

public class demo1 {
    public static void main(String[] args) {
        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println("匿名内部类重写run");
            }
        } ;
        t.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类接口实现");
            }
        });
        t2.start();
        Thread t3 = new Thread(() -> {
            System.out.println("lambda表达式");
        }) ;

    }
}
