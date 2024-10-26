package service;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConcreteSubjectTest {

    private ConcreteSubject subject;

    @Before
    public void setUp() {
        subject = new ConcreteSubject();
    }

    @Test
    public void testRegisterObserver() {
        IObserver observer = new ConcreteObserver(subject);
        assertEquals(1, subject.getObserversCount()); // Asegúrate de tener el método para obtener el número de observadores
    }

    @Test
    public void testRemoveObserver() {
        IObserver observer = new ConcreteObserver(subject);
        subject.removeObserver(observer);
        assertEquals(0, subject.getObserversCount());
    }

    @Test
    public void testNotifyObservers() {
        ConcreteObserver observer1 = new ConcreteObserver(subject);
        ConcreteObserver observer2 = new ConcreteObserver(subject);
        subject.setState("Updated State");
        assertEquals("Updated State", observer1.toString());
        assertEquals("Updated State", observer2.toString());
    }

    @Test
    public void testStateChange() {
        subject.setState("New State");
        assertEquals("New State", subject.getState());
    }
}
