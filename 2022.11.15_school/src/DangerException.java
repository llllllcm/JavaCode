/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-11-15
 * Time: 10:06
 */
public class DangerException extends Exception{
    String message;
    public DangerException() {
        message = "危险品";
    }
    public void toShow() {
        System.out.println(message+" ");
    }
}
