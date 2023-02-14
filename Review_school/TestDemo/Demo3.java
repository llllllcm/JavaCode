/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-02-11
 * Time: 23:42
 */
public class Demo3 {
    public static void main(String[] args) {
        String s = "hello";
        try {
            s = s+" world";
            s.toUpperCase();
            String[] a = s.split("o");
            System.out.println(a.length);
        } catch (Exception e) {
            System.out.print(s);
        } finally {
            System.out.print(s);
        }
    }

}
