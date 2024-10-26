package service;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class RubberDuckTest extends Duck{
    private RubberDuck rd ;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        rd = new RubberDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testSwim() {
        rd.swim();
        assertTrue(out.toString().toLowerCase().contains("estoy nadando"));
    }
    @Test
    public void testPerformNoFly() {
        rd.performFly();
        assertTrue(out.toString().toLowerCase().contains("no vuelo"));
    }
    @Test
    public void testPerformMakeSoundSquick() {
        rd.performSound();
        assertTrue(out.toString().toLowerCase().contains("estoy chillando"));
    }
    @Test
    public void display (){
        rd.display();
        assertTrue(out.toString().toLowerCase().contains("hola soy un pato de goma"));
    }

    @Test
    public void testToString() {
        String esperado = "rubberduck{}";
        String obtenido = rd.toString().toLowerCase();
        assertEquals (esperado, obtenido);
    }

}