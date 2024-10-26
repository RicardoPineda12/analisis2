import org.junit.Test;
import static org.junit.Assert.*;

public class EspressoTest {

    @Test
    public void testEspressoWithSoy() {
        Beverage beverage = new Espresso();
        beverage = new Soy(beverage);

        assertEquals("Espresso, Soy", beverage.getDescription());
        assertEquals(2.14, beverage.cost(), 0.01);
    }
}
