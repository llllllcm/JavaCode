/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-02-12
 * Time: 0:51
 */
class A{
    int i=7;
    public A(){
        setI(20);
        System.out.println("i="+i);
    }
    public void setI(int i){
        this.i=2*i;
    }
}
class B extends A{
    public B(){
        System.out.println("i="+i);
    }
    public void setI(int i){
        this.i=3*i;
    }
}

public class Demo6 {
    public int a;
    public static void main(String[] args) {
        new A();
        new B();
    }
}
