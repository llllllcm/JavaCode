/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-21
 * Time: 7:38
 */

//class A{
//    public int age = 10;
//
//
//
//    public int getAge() {
//        age = age +10;
//        return age;
//    }
//}
public class demo1 {
    public static void main(String[] args) {
        int[] arr = new int[]{};
        try {
            System.out.println(10/0);
        }catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("算术异常");
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("异常");
        }
    }
}
