import org.junit.Test;
import static org.junit.Assert.*;

public class DarkRoastTest {

    @Test
    public void testDarkRoastWithMochaAndSoy() {
        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);

        assertEquals("Dark Roast Coffee, Mocha, Soy", beverage.getDescription());
        assertEquals(1.34, beverage.cost(), 0.01);
    }
}
