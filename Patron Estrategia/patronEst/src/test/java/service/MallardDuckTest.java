package service;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MallardDuckTest {

    private MallardDuck m;
    private ByteArrayOutputStream out;
    @Before
    public void Before() throws Exception {
        m=new MallardDuck ();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }
    @Test
    public void testSwim() {
        m.swim();
        assertTrue(out.toString().toLowerCase().contains("estoy nadando"));
    }
    @Test
    public void testPerformFlyWithWings() {
        m.performFly();
        assertTrue(out.toString().toLowerCase().contains("estoy volando"));
    }
    @Test
    public void testPerformMakeSoundQuack() {
        m.performSound();
        assertTrue(out.toString().toLowerCase().contains("estoy graznando"));
    }
    @Test
    public void display (){
        m.display();
        assertTrue(out.toString().toLowerCase().contains("hola soy un pato silvestre"));
    }
    @Test
    public void testToString() {
        String esperado = "mallardduck{}";
        String obtenido = m.toString().toLowerCase();
        assertEquals (esperado, obtenido);
    }

    @Test
    public void testToString1() {
    }

    @Test
    public void testDisplay() {
    }
}