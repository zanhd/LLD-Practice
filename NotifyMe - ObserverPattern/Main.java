import Observable.Product;
import Observers.NotifyMe;
import Observers.Observer;

public class Main {
    public static void main(String[] args) {
        //Product
        Product product = new Product(true);

        //Observer
        Observer notifyMe = new NotifyMe();

        //subscribe to product/Observable
        product.subscribe(notifyMe);

        //changes in stock availability
        product.setIsInStock(false); // No - notification
        product.setIsInStock(true); // back in  stock : now send the notification
    }
}
