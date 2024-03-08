package Bai5;

public class Admin extends User {

    public Admin(String username, String email, String password) {
        super(username, email, password);
    }

    @Override
    public void login() {
        System.out.println("Đăng nhập admin");
    }

    @Override
    public void register() {
        System.out.println("Đăng ký admin");
    }

    @Override
    public void logout() {
        System.out.println("Đăng xuất admin");
    }
}
