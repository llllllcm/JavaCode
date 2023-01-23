/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-01-20
 * Time: 21:23
 */
class Single{
    //用static修饰，这样就可以让instance变为这个类的唯一实例。
    private static Single instance = new Single();

    //因为要在不创建额外实例的情况下调用这个方法，必须将其设置为static方法
    public static Single getSingle() {
        return instance;
    }
    //为了防止Single在类外可以被实例，这边将其的构造方法设计未private。
    private Single() {

    }
}
public class Demo16 {
    public static void main(String[] args) {
        Single instance = Single.getSingle();
    }
}
