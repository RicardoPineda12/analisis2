public class Controlador {
    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void setDato(String dato) {
        modelo.setDato(dato);
    }

    public void actualizarVista() {
        vista.mostrarDato(modelo.getDato());
    }

    public String getDato() {
        return modelo.getDato();
    }
}
