package service;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SquickSoundTest {
    private SquickSound ss;
    private ByteArrayOutputStream out;

    @Before
    public void Before() throws Exception {
        ss = new SquickSound();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void sound() {
        ss.makeSound();
        assertTrue(out.toString().toLowerCase().contains("squick") );
    }

    @Test
    public void testToString() {
        String esperado = "squicksound{}";
        String obtenido = ss.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}