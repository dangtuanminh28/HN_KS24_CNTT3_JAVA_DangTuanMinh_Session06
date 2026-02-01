class Employee {
    String customerID;
    String customerName;
    double salary;

    public Employee() {
        this.customerID = "Chưa xác định";
        this.customerName = "Nhân viên mới";
        this.salary = 0;
    }

    public Employee(String customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.salary = 0;
    }

    public Employee(String customerID, String customerName, double salary) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.salary = salary;
    }

    public void displayMenu() {
        System.out.println("Mã: " + customerID + " | Tên: " + customerName + " | Lương: " + salary);
        System.out.println("------------------------------------------------------");
    }
}

public class Bai4 {
    public static void main(String[] args) {
        Employee nv1 = new Employee();
        Employee nv2 = new Employee("NV001", "Dang Tuan Minh");
        Employee nv3 = new Employee("NV002", "Nguyen Van A", 15000);

        System.out.println("Danh sách nhân viên");
        nv1.displayMenu();
        nv2.displayMenu();
        nv3.displayMenu();
    }
}
//