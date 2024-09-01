package states.Impl;
import states.State;
import context.VendingMachine;

public class IdleState implements State {
    VendingMachine vendingMachine;

    public IdleState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public void insertMoney(int money) {
        vendingMachine.setState(new InsertedMoneyState(vendingMachine, money)); //idle -> insertedMoneyState
        System.out.println("Inserted Money : " + money);
    }

    public void selectProduct(int id) {
        System.out.println("Please Insert Money :(");
    }

    public void dispenseProduct() {
        System.out.println("Please Insert Money :(");
    }

    public void terminateTransaction() {
        System.out.println("Please Insert Money :(");
    }

    public void completeRefund() {
        System.out.println("Please Insert Money :(");
    }
}