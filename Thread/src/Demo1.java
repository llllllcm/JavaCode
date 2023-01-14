/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-01-04
 * Time: 15:44
 */

/**
 * 标准库中，提供了一个Thread类，使用的时候就可以继承这个类，这就相当于
 * 是对操作系统中的线程进行封装
 */
class MyThread extends Thread {
    //这里需要重写run方法，run里面的逻辑就是这个线程需要执行的工作
    //创建子类，并且重写run方法，相当于是重新安排工作。
    @Override
    public void run() {
        while(true) {
            System.out.println("hello thread!");
            //在重写的方法中无法通过throws抛出异常。
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
public class Demo1 {
    public static void main(String[] args) {
        //这里需要注意的是：创建一个MyThread实例，创建实例，并不会在系统中真的创建一个线程
        //调用start方法的时候，才是真正创建一个新的线程。
        //而新的线程就会启动run里面的逻辑，直到run里面的代码执行完，新的线程就运行结束
        MyThread t = new MyThread();
        t.start();
        while(true) {
            System.out.println("hello main");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
