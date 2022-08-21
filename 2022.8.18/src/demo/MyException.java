package demo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-08-19
 * Time: 17:29
 */
public class MyException extends RuntimeException{
    public MyException() {

    }

    public MyException(String message) {
        super(message);
    }
}
