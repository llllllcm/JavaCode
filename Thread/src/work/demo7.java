package work;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-02-02
 * Time: 1:16
 */
class Singleton{
    private static volatile Singleton instance = null;

    public static Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    private Singleton() {

    }

}
public class demo7 {
    public static void main(String[] args) {

    }
}
