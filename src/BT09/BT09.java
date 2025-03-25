package BT09;

import java.util.HashMap;
import java.util.Map;

public class BT09 {
    public static void main(String[] args) {
        Map<Integer, Product> products = new HashMap<>();
        products.put(1, new Product(1, "Iphone 16", 5.65f, 10));
        products.put(2, new Product(2, "Samsung Galaxy S24", 6.1f, 15));
        products.put(3, new Product(3, "Google Pixel 8", 5.8f, 12));
        products.put(4, new Product(4, "Xiaomi 14 Pro", 6.3f, 8));
        products.put(5, new Product(5, "OnePlus 12", 6.5f, 20));
        System.out.println("Thay doi gia san pham: ");
        if (products.containsKey(2)) {
            Product p = products.get(2);
            p.setPrice(7.0f);
        }
        System.out.println("Thay doi so luong san pham: ");
        if (products.containsKey(3)) {
            Product p = products.get(3);
            p.setQuantity(5);
        }
        System.out.println("Xoa san pham co id = 4");
        products.remove(4);
        System.out.print("Tong gia tri san pham trong kho: ");
        float count = 0;
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            Product p = entry.getValue();
            count += p.getTotalPrice();
        }
        System.out.print(count);
    }
}
