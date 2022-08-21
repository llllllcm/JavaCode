/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-08-19
 * Time: 22:35
 */
public class PosIndexNotLegalException extends RuntimeException{
    public PosIndexNotLegalException() {
    }

    public PosIndexNotLegalException(String message) {
        super(message);
    }
}
