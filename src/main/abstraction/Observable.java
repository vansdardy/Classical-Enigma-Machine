package main.abstraction;

import java.util.*;

public abstract class Observable {
    private List<Observer> observers;

    public Observable() {
        observers = new ArrayList<>();
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(Set<Character> newIO) {
        for (Observer o : observers) {
            o.updateIO(newIO);
        }
    }
}
