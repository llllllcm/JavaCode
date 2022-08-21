/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-08-20
 * Time: 16:51
 */
class Base {
    int a = 10;
    int b = 20;
    public void methodA(){
        System.out.println("Base::methodA");
    }
    public void methodB(int x){
        System.out.println("Base::methodB(int)");
    }

}
class Derived extends Base{
    int a = 30;
    int c = 40;
    public void methodA(){
        System.out.println("Base::methodA");
    }
    public void methodB(){
        System.out.println("Derived::methodB");
    }
    public void Test(){
        methodB();
        methodB(2);
        methodA();
    }
}
public class Test2 {
    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.Test();
    }
}
