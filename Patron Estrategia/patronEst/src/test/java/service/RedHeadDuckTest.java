package service;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class RedHeadDuckTest extends Duck{

    private RedHeadDuck r;
    private ByteArrayOutputStream out;
    @Before
    public void Before() throws Exception {
        r=new RedHeadDuck ();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }
    @Test
    public void testSwim() {
        r.swim();
        assertTrue(out.toString().toLowerCase().contains("estoy nadando"));
    }
    @Test
    public void testPerformFlyWithWings() {
        r.performFly();
        assertTrue(out.toString().toLowerCase().contains("estoy volando"));
    }
    @Test
    public void testPerformMakeSoundQuack() {
        r.performSound();
        assertTrue(out.toString().toLowerCase().contains("estoy graznando"));
    }
    @Test
    public void display (){
        r.display();
        assertTrue(out.toString().toLowerCase().contains("hola soy un pato de cabeza roja"));
    }
    @Test
    public void testToString() {
        String esperado = "redheadduck{}";
        String obtenido = r.toString().toLowerCase();
        assertEquals (esperado, obtenido);
    }

}