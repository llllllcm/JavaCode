package threading;

import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-09-05
 * Time: 20:03
 */

class MyThread extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("hello thread!");
            //因为sleep是被static修饰的，所以可以通过类名调用
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
/**
 * 演示多线程的基本创建方式
 */
public class Demo1 {
    public static void main(String[] args) {
        //创建一个MyThread实例，并不会在系统中真的创建一个进程
        MyThread myThread = new MyThread();
        //调用start方法的时候，才是真正的创建一个新的进程
        myThread.start();
        while (true){
            System.out.println("hello main");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
