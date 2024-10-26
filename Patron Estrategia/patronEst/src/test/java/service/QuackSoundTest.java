package service;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class QuackSoundTest {
    private QuackSound qs;
    private ByteArrayOutputStream out;

    @Before
    public void Before() throws Exception {
        qs = new QuackSound();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

    }

    @Test
    public void sound() {
        qs.makeSound();
        assertTrue(out.toString().toLowerCase().contains("quack"));
    }

    @Test
    public void testToString() {
        String esperado = "quacksound{}";
        String obtenido = qs.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}