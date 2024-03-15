package is.hi.hbv202g.ass9.compositeObserved;

import java.util.List;

public abstract class Observable {
    private List<Observer> observers;

    public Observable() {
        observers = new java.util.ArrayList<>();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }
}
