package Observable;
import Observers.Observer;

public class Product extends Observable {
    boolean isInStock;

    public Product(boolean isInStock) {
        this.isInStock = isInStock;
    }

    public void setIsInStock(boolean isInStock) {
        if(!this.isInStock && isInStock) {
            notifyObservers();
        }

        this.isInStock = isInStock;
    }

    public boolean getIsInStock(boolean isInStock) {
        return isInStock;
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }
}
