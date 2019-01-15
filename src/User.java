import util.Input;
public class User {
    private String username;
    private String password;
    private int numberOfSuccessfulLogins;
    private int numberOfFailedLoginAttempts;
    private static int numberOfUsers = 0;
    private boolean isLoggedIn = false;

    public User(String username, String password){
        this.username = username;
        this.password = password;
        numberOfFailedLoginAttempts = 0;
        numberOfUsers++;
    }

    public void changePassword(String password){
        if(this.password.equals(password)){
            Input input = new Input();

        }
    }



}
