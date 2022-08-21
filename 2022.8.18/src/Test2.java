/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-08-19
 * Time: 14:52
 */
public class Test2 {
    public static int func(int a){
        try{
            if (a == 0 ){
                throw new ArithmeticException();
            }
            return 10;
        }catch (ArithmeticException e){
            System.out.println("捕获到一个算术异常");

        }finally {
            return 20;

        }
    }
    public static void main(String[] args) {
        System.out.println(func(10));
    }
}
