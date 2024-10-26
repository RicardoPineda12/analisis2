package service;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class NoSoundTest {
    private NoSound ns;
    private ByteArrayOutputStream out;

    @Before
    public void Before() throws Exception {
        ns = new NoSound();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void sound() {
        ns.makeSound();
        assertTrue(out.toString().toLowerCase().contains("no hago sonido") );
    }

    @Test
    public void testToString() {
        String esperado = "nosound{}";
        String obtenido = ns.toString().toLowerCase();
        assertEquals(esperado,obtenido);

    }
}