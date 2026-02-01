package Btth;

public class BankAccount {
    private String accountNumber;
    private String accountName;
    private double balance;

    public BankAccount() {
        this.accountNumber = "00000000";
        this.accountName = "Không rõ";
        this.balance = 0;
    }

    public BankAccount(String accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        setBalance(balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Lỗi: Số dư không được âm!");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Nạp thành công: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Rút thành công: " + amount);
        } else {
            System.out.println("Rút tiền thất bại");
        }
    }

    public void displayInfo() {
        System.out.println("STK: " + accountNumber + " | Chủ thẻ: " + accountName + " | Số dư: " + balance);
    }
}
