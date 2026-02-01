class User {
    private int id;
    private String username;
    private String password;
    private String email;

    public User(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.setPassword(password);
        this.setEmail(email);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    // Kiểm tra rỗng
    public void setPassword(String password) {
        if (password != null && !password.trim().isEmpty()) {
            this.password = password;
        } else {
            System.out.println("Mật khẩu không được để trống!");
            this.password = "default123"; // Gán giá trị mặc định nếu sai
        }
    }

    // Kiểm tra ký tự @
    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Email '" + email + "' không hợp lệ (thiếu @)!");
            this.email = "unknown@example.com";
        }
    }

    public void displayInfo() {
        System.out.println("ID: " + id + " | User: " + username + " | Email: " + email + " | Pass: ********");
        System.out.println("------------------------------------------------------");
    }
}

public class Bai6 {
    public static void main(String[] args) {
        // Kiểm tra đúng
        System.out.println("User 1:");
        User userFirst = new User(1, "DangTuanMinh", "minh123", "minh@gmail.com");
        userFirst.displayInfo();

        // Kiểm tra sai
        System.out.println("User 2:");
        User userSecond = new User(2, "hocvien_01", "", "email_khong_hop_le");
        userSecond.displayInfo();

        // Test pass đã thay đổi
        System.out.println("Kiểm tra mật khẩu mới:");
        userFirst.setPassword("   ");
        userFirst.displayInfo();
    }
}