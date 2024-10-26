package service;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements ISubject {
    private List<IObserver> observers;
    private String state;

    public ConcreteSubject() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(IObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update();
        }
    }

    @Override
    public int getObserversCount() {
        return 0;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    public String getState() {
        return this.state;
    }

    @Override
    public String toString() {
        return "ConcreteSubject{" +
                "state='" + state + '\'' +
                '}';
    }
}
