package context;

import java.util.Map;
import states.State;
import states.Impl.IdleState;
import context.util.Product;

public class VendingMachine {
    State state;
    Map<Integer, Product> products;

    public VendingMachine(Map<Integer, Product> products) {
        this.state = new IdleState(this);
        this.products = products;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public Product getProduct(int id) {
        if(products.containsKey(id)) {
            return products.get(id);
        }

        return null;
    }

    public void removeProduct(int id) {
        if(products.containsKey(id)) {
            products.remove(id);
        }
    }

    /*
     * Functionality of Vending Machine
     */

    public void insertMoney(int money) {
        state.insertMoney(money);
    }

    public void selectProduct(int id) {
        state.selectProduct(id);
    }

    public void dispenseProduct() {
        state.dispenseProduct();
        state.completeRefund();
    }

    public void terminateTransaction() {
        state.terminateTransaction();
    }
}