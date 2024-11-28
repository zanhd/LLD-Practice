package context.util;

public class Product {
    int id;
    int price;

    public Product(int id, int price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }
}
