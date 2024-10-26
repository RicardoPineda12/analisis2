package service;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ModelDuckTest {
    private Duck md;
    private ByteArrayOutputStream out;

    @Before
    public void before() throws Exception {
        md = new ModelDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }
    @Test
    public void testSwim() {
        md.swim();
        assertTrue(out.toString().toLowerCase().contains("estoy nadando"));
    }
    @Test
    public void testPerformFlyLikeRocket() {

        

    }
    @Test
    public void testPerformNoSound() {
        md.performSound();
        assertTrue(out.toString().toLowerCase().contains("no hago sonido"));
    }

    @Test
    public void testToString() {
        String esperado = "modelduck{}";
        String obtenido = md.toString().toLowerCase();
        assertEquals(esperado, obtenido);

    }

    @Test
    public void testChangeFLyBehavior (){
        md.performFly();
        assertTrue(out.toString().toLowerCase().contains("no vuelo") );

        md.setFb(new FlyLikeRocket());
        md.performFly();
        assertTrue(out.toString().toLowerCase().contains("vuelo como un cohete"));
    }

    @Test
    public void display() {
        md.display();
        assertTrue(out.toString().toLowerCase().contains("hola soy un pato de exhibicion") );
    }
}