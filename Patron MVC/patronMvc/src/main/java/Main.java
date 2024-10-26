public class Main {
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);

        controlador.setDato("Ejemplo de MVC");
        controlador.actualizarVista();

        controlador.setDato("Nuevo dato para MVC");
        controlador.actualizarVista();
    }
}
