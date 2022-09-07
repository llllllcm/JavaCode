/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-09-07
 * Time: 20:02
 */
public class IndexNotLegalException extends RuntimeException{
    public IndexNotLegalException() {
    }

    public IndexNotLegalException(String message) {
        super(message);
    }
}
