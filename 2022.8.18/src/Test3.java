/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-08-19
 * Time: 17:14
 */
class UserNameException extends RuntimeException{
    public UserNameException() {

    }

    public UserNameException(String message) {
        super(message);
    }
}
class PasswordException extends RuntimeException{
    public PasswordException() {

    }

    public PasswordException(String message) {
        super(message);
    }
}
public class Test3 {
    public class LogIn {
        private final String userName = "admin";
        private final String password = "123456";
        public  void loginInfo(String userName, String password) {
            if (!this.userName.equals(userName)) {
                throw new UserNameException("用户名错误");
            } if (!this.password.equals(password)) {
                throw new PasswordException("密码错误");
            }
            System.out.println("登陆成功");
        }
    }
    public static void main(String[] args) {
        Test3 test = new Test3();
        Test3.LogIn logIn = test.new LogIn();
        logIn.loginInfo("admi", "123456");
    }
}
