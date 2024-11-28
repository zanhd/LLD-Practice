package Observable;

import Observers.Observer;

public interface ObservableInterface {
    void subscribe(Observer observer);
    void notifyObservers();
}
