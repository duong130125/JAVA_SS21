import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập một số nguyên dương: ");
            int number = scanner.nextInt();

            if (number <= 0) {
                throw new IllegalArgumentException("Lỗi: Bạn phải nhập một số nguyên dương!");
            }

            if (isPrime(number)) {
                System.out.println(number + " là số nguyên tố.");
            } else {
                System.out.println(number + " không phải là số nguyên tố.");
            }
        } catch (Exception e) {
            System.out.println("Lỗi: Bạn phải nhập số nguyên!");
        } finally {
            System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
