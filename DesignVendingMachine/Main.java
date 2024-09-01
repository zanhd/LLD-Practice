import context.VendingMachine;
import java.util.*;
import context.util.Product;

class Main {
    private static Map<Integer, Product> getProducts() {
        Map<Integer, Product> products = new HashMap<>();
        products.put(1, new Product(1, 100));
        products.put(2, new Product(2, 200));
        return products;
    }

    public static void main(String[] args) {
        System.out.println("VendingMachine : STARTED");
        VendingMachine vendingMachine = new VendingMachine(getProducts());

        vendingMachine.insertMoney(600);
        vendingMachine.selectProduct(1);
        vendingMachine.dispenseProduct();


        vendingMachine.insertMoney(200);
        vendingMachine.selectProduct(2);
        vendingMachine.dispenseProduct();


        vendingMachine.insertMoney(500);
        vendingMachine.selectProduct(3);
        vendingMachine.terminateTransaction();
        vendingMachine.dispenseProduct();

        System.out.println("VendingMachine : STOPED");
    }
}