import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ControladorTest {
    private Modelo modelo;
    private Vista vista;
    private Controlador controlador;

    @Before
    public void setUp() {
        modelo = new Modelo();
        vista = new Vista();
        controlador = new Controlador(modelo, vista);
    }

    @Test
    public void testSetDato() {
        controlador.setDato("Dato de prueba");
        assertEquals("Dato de prueba", modelo.getDato());
    }

    @Test
    public void testGetDato() {
        modelo.setDato("Otro dato de prueba");
        assertEquals("Otro dato de prueba", controlador.getDato());
    }
}
