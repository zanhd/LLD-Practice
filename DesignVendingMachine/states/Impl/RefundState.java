package states.Impl;

import context.VendingMachine;
import states.State;

public class RefundState implements State {
    VendingMachine vendingMachine;
    int money = 0;

    public RefundState(VendingMachine vendingMachine, int money) {
        this.vendingMachine = vendingMachine;
        this.money = money;
    }

    public void insertMoney(int money) {
        System.out.println("Wait we are Refunding your Money !!!");
    }

    public void selectProduct(int id) {
        System.out.println("Wait we are Refunding your Money !!!");
    }

    public void dispenseProduct() {
        System.out.println("Wait we are Refunding your Money !!!");
    }

    public void terminateTransaction() {
        System.out.println("Wait we are Refunding your Money !!!");
    }

    public void completeRefund() {
        if(money > 0) System.out.println("Please Collect Your Refund/Remaining-Money : " + money);
        vendingMachine.setState(new IdleState(vendingMachine));
    }
}
