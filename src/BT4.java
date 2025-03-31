import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập một số nguyên: ");
            int number = scanner.nextInt();
            System.out.println("Bạn đã nhập: " + number);
        } catch (Exception e) {
            System.out.println("Lỗi: Bạn phải nhập số nguyên!");
        } finally {
            System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
            scanner.close();
        }
    }
}
