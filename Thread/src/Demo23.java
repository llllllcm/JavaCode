import java.util.Timer;
import java.util.TimerTask;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-01-26
 * Time: 22:47
 */
public class Demo23 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        System.out.println("开始计时");
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("时间到1");
            }
        },3000);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("时间到2");
            }
        },4000);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("时间到3");
            }
        },5000);
    }
}
