/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-07-24
 * Time: 23:06
 */
    public class LogIn {
        private String userName = "admin";
        private String password = "123456";
        public static void loginInfo(String userName, String password) {
            if (!userName.equals(userName)) {

            } if (!password.equals(password)) {

            }
            System.out.println("登陆成功");
        }
        public static void main(String[] args) {
            loginInfo("admin", "123456");
        }
    }

