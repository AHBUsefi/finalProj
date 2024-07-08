package FPr.shop.model;

public abstract class User {
    protected String username;
    protected String password;
    protected String email;
    protected String address;
    protected String phoneNumber;

    public User(String username, String password, String email, String address, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
