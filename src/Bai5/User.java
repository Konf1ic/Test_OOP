package Bai5;

public abstract class User {

    private String username;
    private String email;
    private String password;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract void login();

    public abstract void register();

    public abstract void logout();

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

class Main {

    public static void main(String[] args) {

        User admin = new Admin("admin", "admin@gmail.com", "123");
        System.out.println(admin);
        admin.login();
        admin.register();
        admin.logout();

        User customer = new Customer("customer", "customer@gmail.com", "123");
        System.out.println(customer);
        customer.login();
        customer.register();
        customer.logout();

        User moderator = new Moderator("moderator", "moderator@gmail.com", "123");
        System.out.println(moderator);
        moderator.login();
        moderator.register();
        moderator.logout();
    }
}
