import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập số nguyên thứ nhất: ");
            int num1 = scanner.nextInt();

            System.out.print("Nhập số nguyên thứ hai: ");
            int num2 = scanner.nextInt();

            int result = num1 / num2;
            System.out.println("Kết quả của " + num1 + " / " + num2 + " là: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Lỗi: Không thể chia cho 0.");
        }
    }
}
