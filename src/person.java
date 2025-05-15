// Person.java
public abstract class person {
    protected String username;
    protected String password;

    public person(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public abstract boolean login(String inputUsername, String inputPassword);

    public String getUsername() {
        return username;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }
}
