package Bai5;

public class Customer extends User {

    public Customer(String username, String email, String password) {
        super(username, email, password);
    }

    @Override
    public void login() {
        System.out.println("Đăng nhập customer");
    }

    @Override
    public void register() {
        System.out.println("Đăng ký customer");
    }

    @Override
    public void logout() {
        System.out.println("Đăng xuất customer");
    }
}
