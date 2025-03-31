import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.print("Mảng có các phần tử: ");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();

            System.out.print("Nhập chỉ số phần tử của mảng: ");
            int index = scanner.nextInt();

            int value = numbers[index];
            System.out.println("Giá trị tại chỉ số " + index + " là: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Lỗi: Chỉ số nằm ngoài phạm vi của mảng.");
        }
    }
}
