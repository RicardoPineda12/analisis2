package service;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FlyLikeRocketTest {
    private FlyLikeRocket flr;
    private ByteArrayOutputStream out;

    @Before
    public void Before() throws Exception {
        flr = new FlyLikeRocket();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void fly() {
        flr.fly();
        assertTrue(out.toString().toLowerCase().contains("vuelo como un cohete"));
    }

    @Test
    public void testToString() {
        String esperado = "flylikerocket{}";
        String obtenido = flr.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}