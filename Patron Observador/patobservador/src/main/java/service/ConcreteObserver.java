package service;

public class ConcreteObserver implements IObserver {
    private ConcreteSubject subject;
    private String observerState;

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update() {
        this.observerState = subject.getState();
        System.out.println("Observer updated with new state: " + observerState);
    }

    @Override
    public String toString() {
        return "ConcreteObserver{" +
                "observerState='" + observerState + '\'' +
                '}';
    }
}
