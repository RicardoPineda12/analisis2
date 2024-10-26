package service;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FlyWithWingsTest {
    private FlyWithWings fww;
    private ByteArrayOutputStream out;

    @Before
    public void Before () throws Exception {
        fww = new FlyWithWings();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void fly() {
        fww.fly();
        assertTrue(out.toString().toLowerCase().contains("vuelo"));
    }

    @Test
    public void testToString() {
        String esperado = "flywithwings{}";
        String obtenido = fww.toString().toLowerCase();
        assertEquals (esperado, obtenido);
    }
}