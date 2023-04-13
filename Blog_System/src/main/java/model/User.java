package model;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * model.User: 86136
 * Date: 2023-04-02
 * Time: 16:00
 */
public class User {
    private int userId;
    private String username;
    private String password;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
