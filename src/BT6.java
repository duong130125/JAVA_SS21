import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> validNumbers = new ArrayList<>();
        int validCount = 0, invalidCount = 0;

        System.out.print("Nhập danh sách chuỗi, cách nhau bởi dấu phẩy: ");
        String input = scanner.nextLine();

        String[] tokens = input.split(",");

        for (String token : tokens) {
            token = token.trim();
            try {
                int number = Integer.parseInt(token);
                validNumbers.add(number);
                validCount++;
            } catch (NumberFormatException e) {
                invalidCount++;
            }
        }

        System.out.println("Số lượng chuỗi hợp lệ: " + validCount);
        System.out.println("Số lượng chuỗi không hợp lệ: " + invalidCount);
        System.out.println("Danh sách số nguyên hợp lệ: " + validNumbers);
    }
}
