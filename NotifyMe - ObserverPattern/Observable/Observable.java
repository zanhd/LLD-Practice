package Observable;

import Observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    List<Observer> observers = new ArrayList<>();

    void subscribe(Observer observer) {
        observers.add(observer);
    }

    void notifyObservers() {
        observers.forEach((observer)->{
            observer.sendNotification();
        });
    }
}
