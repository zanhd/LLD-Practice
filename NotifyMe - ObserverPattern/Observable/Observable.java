package Observable;

import Observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Observable implements ObservableInterface {
    List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        observers.forEach((observer)->{
            observer.sendNotification();
        });
    }
}
