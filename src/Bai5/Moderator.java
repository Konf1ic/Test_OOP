package Bai5;

public class Moderator extends User {

    public Moderator(String username, String email, String password) {
        super(username, email, password);
    }

    @Override
    public void login() {
        System.out.println("Đăng nhập Moderator");
    }

    @Override
    public void register() {
        System.out.println("Đăng ký Moderator");
    }

    @Override
    public void logout() {
        System.out.println("Đăng xuất Moderator");
    }
}
