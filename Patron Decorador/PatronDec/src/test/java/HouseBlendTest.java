import org.junit.Test;
import static org.junit.Assert.*;

public class HouseBlendTest {

    @Test
    public void testHouseBlendWithMilkAndMocha() {
        Beverage beverage = new HouseBlend();
        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);

        assertEquals("House Blend Coffee, Milk, Mocha", beverage.getDescription());
        assertEquals(1.19, beverage.cost(), 0.01);
    }
}
