import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BT8 {
    public static void validatePhoneNumber(String phone) throws InvalidPhoneNumberLengthException {
        if (!phone.matches("\\d{10}")) {
            throw new InvalidPhoneNumberLengthException("Số điện thoại không hợp lệ: " + phone);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập các số điện thoại, cách nhau bằng dấu phẩy: ");
        String input = scanner.nextLine();

        String[] phoneNumbers = input.split(",");
        List<String> validNumbers = new ArrayList<>();
        List<String> invalidNumbers = new ArrayList<>();

        for (String phone : phoneNumbers) {
            phone = phone.trim();
            try {
                validatePhoneNumber(phone);
                validNumbers.add(phone);
            } catch (InvalidPhoneNumberLengthException e) {
                invalidNumbers.add(e.getMessage());
            }
        }

        System.out.println("\nDanh sách số điện thoại hợp lệ: " + validNumbers);
        System.out.println("Danh sách số điện thoại không hợp lệ:");
        for (String error : invalidNumbers) {
            System.out.println(error);
        }
    }

    static class InvalidPhoneNumberLengthException extends Exception {
        public InvalidPhoneNumberLengthException(String message) {
            super(message);
        }
    }

}
