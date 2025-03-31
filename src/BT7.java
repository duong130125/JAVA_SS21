import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();

        while (true) {
            System.out.print("Nhập số tiền muốn rút (hoặc 'exit' để thoát): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int amount = Integer.parseInt(input);
                account.withdraw(amount);
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập một số hợp lệ!");
            }
        }
    }

    static class BankAccount {
        private int balance = 1000000;

        public void withdraw(int amount) {
            int MIN_BALANCE = 50000;
            if (amount > balance) {
                System.out.println("Lỗi: Số tiền rút vượt quá số dư!");
            } else if (balance - amount < MIN_BALANCE) {
                System.out.println("Lỗi: Tài khoản phải duy trì số dư tối thiểu 50.000 đồng!");
            } else {
                balance -= amount;
                System.out.println("Rút tiền thành công! Số dư còn lại: " + balance + " đồng");
            }
        }
    }
}
