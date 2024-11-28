package Component;

public class Watch extends Product {
    double price;
    public Watch(double price) {
        this.price = price;
    }

    @Override
    public double cost() {
        return 100;
    }
}
