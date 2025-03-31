package BT10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart {
    private List<CartItem> items = new ArrayList<>();

    public void addToCart(Product product, int quantity) {
        if (quantity <= 0) {
            System.out.println("Lỗi: Số lượng không hợp lệ!");
            return;
        }
        for (CartItem item : items) {
            if (item.getProduct().getId().equals(product.getId())) {
                item.increaseQuantity(quantity);
                return;
            }
        }
        items.add(new CartItem(product, quantity));
    }

    public void removeFromCart(String productId) {
        Iterator<CartItem> iterator = items.iterator();
        while (iterator.hasNext()) {
            CartItem item = iterator.next();
            if (item.getProduct().getId().equals(productId)) {
                iterator.remove();
                return;
            }
        }
        System.out.println("Lỗi: Không tìm thấy sản phẩm trong giỏ hàng!");
    }

    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Giỏ hàng trống.");
            return;
        }
        for (CartItem item : items) {
            System.out.println(item.getProduct().getName() + " - Số lượng: " + item.getQuantity() + " - Giá: " + item.getProduct().getPrice());
        }
    }

    public void checkout() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getProduct().getPrice() * item.getQuantity();
        }
        System.out.println("Tổng tiền cần thanh toán: " + total);
    }
}
