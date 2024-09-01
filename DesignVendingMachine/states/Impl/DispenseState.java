package states.Impl;

import context.VendingMachine;
import context.util.Product;
import states.State;

public class DispenseState implements  State {
    VendingMachine vendingMachine;
    int money = 0;
    int id = -1;

    public DispenseState(VendingMachine vendingMachine, int id, int money) {
        this.vendingMachine = vendingMachine;
        this.id = id;
        this.money = money;
    }

    public void insertMoney(int money) {
        System.out.println("Money is Already Inserted, Please wait we are dispensing the Product !!!");
    }

    public void selectProduct(int id) {
        System.out.println("Product is Already Selected, Please wait we are dispensing the Product !!!");
    }

    public void dispenseProduct() {
        Product product = vendingMachine.getProduct(id);

        if(product == null) {
            System.out.println("Product is SOLD-OUT !!!");
            vendingMachine.setState(new RefundState(vendingMachine, money));
        } else {
            if(product.getPrice() > money) {
                System.out.printf("Inserted Money(%d) is Lesser  than Product Price(%d) :(\n", money, product.getPrice());
                vendingMachine.setState(new RefundState(vendingMachine, money));
            } else {
                System.out.println("Please Collect Your Product " + id);
                vendingMachine.setState(new RefundState(vendingMachine, money - product.getPrice()));
                vendingMachine.removeProduct(id); // remove the product in end : IMP
            }
        }
        
    }

    public void terminateTransaction() {

    }

    public void completeRefund() {
        System.out.println("Please wait we are dispensing the Product !!!");
    }
}
