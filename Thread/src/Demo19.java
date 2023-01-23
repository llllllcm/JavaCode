/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-01-22
 * Time: 22:38
 */
class MyTimer{
    private long time;
    public void schedule(Runnable runnable , long after) {
        time = System.currentTimeMillis() + after;

    }
}
public class Demo19 {
    public static void main(String[] args) {
        MyTimer myTimer = new MyTimer();
        myTimer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("时间到");
            }
        },100);
    }
}
