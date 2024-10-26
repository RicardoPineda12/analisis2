package service;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class DecoyDuckTest {

    private DecoyDuck d ;
    private ByteArrayOutputStream out;
    @Before
    public void Before() throws Exception {
        d=new DecoyDuck ();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }
    @Test
    public void testSwim() {
        d.swim();
        assertTrue(out.toString().toLowerCase().contains("estoy nadando"));
    }
    @Test
    public void testPerformFlyWithWings() {
        d.performFly();
        assertTrue(out.toString().toLowerCase().contains("no estoy volando"));
    }
    @Test
    public void testPerformMakeSoundQuack() {
        d.performSound();
        assertTrue(out.toString().toLowerCase().contains("no hago sonido"));
    }
    @Test
    public void display (){
        d.display();
        assertTrue(out.toString().toLowerCase().contains("hola soy un pato de señuelo"));
    }
    @Test
    public void testToString() {
        String esperado = "decoyduck{}";
        String obtenido = d.toString().toLowerCase();
        assertEquals (esperado, obtenido);
    }


}