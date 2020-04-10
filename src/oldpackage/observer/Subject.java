package oldpackage.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    public List<Observer> observers = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }

    public void attach(Observer observer) {
        observers.add(observer);

    }

    public void notifyAllObserver() {
        observers.forEach(observer -> observer.update());
    }
}
