package service;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class NoFlyTest {
    private NoFly nf;
    private ByteArrayOutputStream out;

    @Before
    public void Before() throws Exception {
        nf= new NoFly();
        out= new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void fly() {
        nf.fly();
        assertTrue(out.toString().toLowerCase().contains("no vuelo") );
    }

    @Test
    public void testToString() {
        String esperado = "nofly{}";
        String obtenido = nf.toString().toLowerCase();
        assertEquals(esperado,obtenido);
    }
}