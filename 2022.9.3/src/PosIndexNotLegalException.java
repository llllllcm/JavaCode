/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-09-03
 * Time: 13:15
 */
public class PosIndexNotLegalException extends RuntimeException{
    public PosIndexNotLegalException() {
    }

    public PosIndexNotLegalException(String message) {
        super(message);
    }
}
