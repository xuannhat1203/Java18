package BT09;

public class Product {
    int id;
    String name;
    float price;
    int quantity;
    public Product(int id, String name, float price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    public float getTotalPrice() {
        return price * quantity;
    }
}
