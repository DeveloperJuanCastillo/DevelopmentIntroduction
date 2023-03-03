public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Roberto", 23, "9876534", 1000000);
        cliente.getPresentacion();
        cliente.getDatos();

        Trabajador trabajador = new Trabajador("Sadra", 34, "4568723", 2450000);
        trabajador.getPresentacion();
        trabajador.getDatos();
    }
}