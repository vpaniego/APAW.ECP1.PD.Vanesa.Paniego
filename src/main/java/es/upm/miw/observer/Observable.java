package es.upm.miw.observer;

import java.util.HashSet;
import java.util.Set;

public class Observable {
    private final Set<Observer> observers = new HashSet<Observer>();

    public void addObserver(Observer observador) {
        assert observador != null;
        this.observers.add(observador);
    }

    public void removeObserver(Observer observador) {
        assert observador != null;
        this.observers.remove(observador);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
