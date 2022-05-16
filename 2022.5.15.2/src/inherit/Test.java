package inherit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-15
 * Time: 15:47
 */
class Base{
    public int a = 1;
    public int b = 2;
    public   void methodA(){
        System.out.println();
        System.out.println("base::method");
    }
    public  void methodB(){
        System.out.println("父类的方法");
    }
    public Base(int a,int b){


    }



}
class Derived extends Base{
    public char a = 'd';
    public static int d = 4;

    public Derived(int a, int b) {
        super(a, b);
    }

    public void methodA(int a ,int b){
        System.out.println("带有两个参数的方法"+a);
    }
    public  void methodB(){
        System.out.println("derived::method");
    }
    public   void test() {
//        methodA();
//        methodA(2,3);
        methodB();
        methodB();
        //System.out.println(d);
        /*System.out.println("访问父类的a: "+super.a);
        System.out.println(this.b);
        System.out.println(this.a);
        System.out.println(this.d);*/
    }
}
public class Test {
    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.test();
    }
}
