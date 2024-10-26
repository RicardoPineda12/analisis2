import org.junit.Test;
import static org.junit.Assert.*;

public class DecafTest {

    @Test
    public void testDecafWithMilk() {
        Beverage beverage = new Decaf();
        beverage = new Milk(beverage);

        assertEquals("Decaf Coffee, Milk", beverage.getDescription());
        assertEquals(1.15, beverage.cost(), 0.01);
    }
}
