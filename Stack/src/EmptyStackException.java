/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-09-18
 * Time: 23:56
 */
public class EmptyStackException extends RuntimeException{
    public EmptyStackException() {
    }

    public EmptyStackException(String message) {
        super(message);
    }
}
