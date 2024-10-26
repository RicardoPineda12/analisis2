package service;

import java.util.ArrayList;
import java.util.List;

public interface ISubject {
    void registerObserver(IObserver o);
    void removeObserver(IObserver o);
    void notifyObservers();

    int getObserversCount();
}

