package demo4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-21
 * Time: 14:39
 */
interface IA{
    void funcA();
}
interface IB{
    void funcB();
}
//接口的继承（扩展功能）就是IC接口里面有自己的方法和IA,IB的方法
interface IC extends IA,IB{
    void funcC();
}
class T implements IC{
    @Override
    public void funcA() {

    }

    @Override
    public void funcB() {

    }

    @Override
    public void funcC() {

    }
    //重写三个方法
}
public class Test2 {
    public static void main(String[] args) {

    }
}
