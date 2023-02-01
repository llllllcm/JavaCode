package work;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-02-02
 * Time: 1:13
 */
class Single {
    private static Single instance = new Single();

    public static Single getSingle() {
        return instance;
    }
    private Single() {

    }
}
public class demo6 {
    public static void main(String[] args) {
        Single single = Single.getSingle();
    }
}
