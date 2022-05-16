/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-15
 * Time: 20:08
 */
public class Test2 {
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public static void add(){
        System.out.println("add");
    }

    public static void main(String[] args) {
        Test2 a = new Test2();
        a.add();
        a.add(2,3);
    }
}
