package BT9;

public class BankAccount {
    private String accountId;
    private double balance;

    public BankAccount(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Lỗi: Số tiền gửi phải lớn hơn 0!");
        }
        balance += amount;
        System.out.println("Gửi tiền thành công! Số dư mới: " + balance);
    }

    public void withdraw(double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Lỗi: Số tiền rút phải lớn hơn 0!");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Lỗi: Số tiền rút vượt quá số dư!");
        }
        balance -= amount;
        System.out.println("Rút tiền thành công! Số dư còn lại: " + balance);
    }

    public void transfer(BankAccount recipient, double amount) throws IllegalArgumentException {
        if (recipient == null) {
            throw new IllegalArgumentException("Lỗi: Tài khoản nhận không tồn tại!");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Lỗi: Số tiền chuyển phải lớn hơn 0!");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Lỗi: Số tiền chuyển vượt quá số dư!");
        }
        balance -= amount;
        recipient.balance += amount;
        System.out.println("Chuyển tiền thành công! Số dư còn lại: " + balance);
    }
}
