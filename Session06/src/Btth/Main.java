package Btth;

public class Main {
    public static void main(String[] args) {
        BankAccount firstAcc = new BankAccount("0123456", "Dang Tuan Minh", 1000.0);
        BankAccount secAcc = new BankAccount("987654", "Nguyen Van A", 500.0);

        System.out.println("--- Giao dịch 1 ---");
        firstAcc.deposit(500);
        firstAcc.withdraw(200);
        firstAcc.displayInfo();

        System.out.println("--- Giao dịch 2 ---");
        secAcc.withdraw(600);
        secAcc.displayInfo();
    }
}
//