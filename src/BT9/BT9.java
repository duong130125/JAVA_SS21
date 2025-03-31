package BT9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BT9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new BankAccount("741852963", 1000000));
        accounts.add(new BankAccount("321654987", 500000));

        System.out.print("Nhập số tài khoản nguồn: ");
        String sourceId = scanner.nextLine();
        BankAccount sourceAccount = findAccount(accounts, sourceId);

        if (sourceAccount == null) {
            System.out.println("Lỗi: Tài khoản nguồn không tồn tại!");
            return;
        }

        System.out.print("Nhập số tài khoản đích: ");
        String targetId = scanner.nextLine();
        BankAccount targetAccount = findAccount(accounts, targetId);

        System.out.print("Nhập số tiền cần chuyển: ");
        double amount = scanner.nextDouble();

        try {
            sourceAccount.transfer(targetAccount, amount);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static BankAccount findAccount(List<BankAccount> accounts, String accountId) {
        for (BankAccount account : accounts) {
            if (account.getAccountId().equals(accountId)) {
                return account;
            }
        }
        return null;
    }
}
