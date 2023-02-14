/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-02-11
 * Time: 23:55
 */
public class Demo4 {
    static int count = 0;

    public static void main(String[] args) {
        //for循环没有条件就是死循环
        for (;;) {
            System.out.println(1);
        }
    }
    public static void main1(String[] args) {
            for ( ;; ) {
                try {
                    if ( count++ == 0 )
                        throw new Exception();
                    System.out.println(1);
                } catch (Exception e) {
                    System.out.println(2);
                } finally {
                    System.out.println(3);
                    if ( count == 2 )
                        break;
                }
                System.out.println(4);
            }
    }
}
