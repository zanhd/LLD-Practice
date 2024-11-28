package states;

public interface State {
    void insertMoney(int money);
    void selectProduct(int id);
    void dispenseProduct();
    void terminateTransaction();
    void completeRefund();
}
