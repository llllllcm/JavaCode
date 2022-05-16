/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-16
 * Time: 19:13
 */
class Base{

    public Base(String s){

        System.out.print("B");

    }

}

 class Derived extends Base{

    public Derived (String s) {
        super(s);
        System.out.print("D");

    }


}
public class Test {
    public static void main(String[] args) {

        new Derived("C");
    }

}
