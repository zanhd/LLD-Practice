package Observers;

public class NotifyMe implements Observer {
    @Override
    public void sendNotification() {
        System.out.println("Product is available");
        // => here we can send notification to User via UI, gmail, etc
    }
}
