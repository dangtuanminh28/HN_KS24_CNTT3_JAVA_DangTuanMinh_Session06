class Account {
    String username;
    String password;
    String email;

    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
        System.out.println("Đã đổi mật khẩu " + username);
    }

    public void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("Email:    " + email);
        System.out.println("Password: ******** ");
    }
}

public class Bai2 {
    public static void main(String[] args) {
        Account user1 = new Account("dangtuanminh", "minh123", "minh@gmail.com");

        System.out.println("Trạng thái ban đầu:");
        user1.displayInfo();
        user1.changePassword("new_password_2026");

        System.out.println("------------------------------");
        System.out.println("Trạng thái sau khi đổi mật khẩu:");
        user1.displayInfo();
        System.out.println("------------------------------");
    }
}