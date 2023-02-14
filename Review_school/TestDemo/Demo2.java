/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-02-11
 * Time: 23:10
 */
public class Demo2 {
    public static void main(String[] args) {
        try {
            String s = "5.6";
            Integer.parseInt(s); // 引起一个 NumberFormatException异常

            int i = 0;
            int y = 2 / i;
            s.toUpperCase();
        }
        catch (Exception ex) {
            System.out.println("NumberFormatException");
        }
//        catch (RuntimeException ex) {
//            System.out.println("RuntimeException");
//        }
    }
}
