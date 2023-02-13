package Login;

public class User {
    private String Username;
    private String pw;

    public User(String username, String pw) {
        Username = username;
        this.pw = pw;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
}
