package bean;

public class user{
    private int username;
    private String password;

    public user() {
    }

    public user(int username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return username+","+password;
    }
}
