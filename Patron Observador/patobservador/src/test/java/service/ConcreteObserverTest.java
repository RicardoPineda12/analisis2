package service;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConcreteObserverTest {

    private ConcreteSubject subject;
    private ConcreteObserver observer;

    @Before
    public void setUp() {
        subject = new ConcreteSubject();
        observer = new ConcreteObserver(subject);
    }

    @Test
    public void testObserverUpdate() {
        subject.setState("State 1");
        assertEquals("State 1", observer.toString());

        subject.setState("State 2");
        assertEquals("State 2", observer.toString());
    }

    @Test
    public void testObserverToString() {
        subject.setState("Test State");
        assertEquals("ConcreteObserver{observerState='Test State'}", observer.toString());
    }

    @Test
    public void testObserverIsNotifiedOnSubjectChange() {
        subject.setState("Initial State");
        assertEquals("Initial State", observer.toString());
    }
}
