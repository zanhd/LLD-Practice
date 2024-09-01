package states.Impl;

import context.VendingMachine;
import states.State;

public class InsertedMoneyState implements State {
    VendingMachine vendingMachine;
    int money = 0;

    public InsertedMoneyState(VendingMachine vendingMachine, int money) {
        this.vendingMachine = vendingMachine;
        this.money = money;
    }

    public void insertMoney(int money) {
        System.out.println("Money" + this.money + " already inserted, Please select Product :)");
    }

    public void selectProduct(int id) {
        System.out.println("You Selected Product : " + id);
        vendingMachine.setState(new DispenseState(vendingMachine, id, money));
    }

    public void dispenseProduct() {
        System.out.println("Please select Product :)");
    }

    public void terminateTransaction() {

    }

    public void completeRefund() {
        System.out.println("Please select Product :)");
    }
}
