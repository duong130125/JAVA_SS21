package BT10;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BT10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        List<Product> availableProducts = Arrays.asList(
                new Product("P01", "Laptop", 1500.0),
                new Product("P02", "Điện thoại", 800.0),
                new Product("P03", "Tai nghe", 100.0)
        );

        while (true) {
            System.out.println("\n1. Xem danh sách sản phẩm");
            System.out.println("2. Thêm sản phẩm vào giỏ hàng");
            System.out.println("3. Xóa sản phẩm khỏi giỏ hàng");
            System.out.println("4. Xem giỏ hàng");
            System.out.println("5. Hiển thị tổng tiền");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Danh sách sản phẩm có sẵn:");
                    for (Product p : availableProducts) {
                        System.out.println(p.getId() + ": " + p.getName() + " - " + p.getPrice());
                    }
                    break;
                case 2:
                    System.out.print("Nhập mã sản phẩm: ");
                    String productId = scanner.nextLine();
                    Product selectedProduct = availableProducts.stream()
                            .filter(p -> p.getId().equals(productId))
                            .findFirst()
                            .orElse(null);
                    if (selectedProduct == null) {
                        System.out.println("Sản phẩm không tồn tại!");
                        break;
                    }
                    System.out.print("Nhập số lượng: ");
                    int quantity;
                    try {
                        quantity = scanner.nextInt();
                    } catch (Exception e) {
                        System.out.println("Lỗi: Số lượng không hợp lệ!");
                        scanner.nextLine();
                        break;
                    }
                    cart.addToCart(selectedProduct, quantity);
                    break;
                case 3:
                    System.out.print("Nhập mã sản phẩm cần xóa: ");
                    String removeId = scanner.nextLine();
                    cart.removeFromCart(removeId);
                    break;
                case 4:
                    cart.displayCart();
                    break;
                case 5:
                    cart.checkout();
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
