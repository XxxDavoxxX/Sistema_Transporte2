package Transporte;

public class AutoBus extends Vehiculo {
    private String rutaAsignada;
    private int numeroPisos;

    public AutoBus(String id, int capacidadPasajeros, float velocidadMaxima, String estado,
                   String rutaAsignada, int numeroPisos) {
        super(id, capacidadPasajeros, velocidadMaxima, estado);
        this.rutaAsignada = rutaAsignada;
        this.numeroPisos = numeroPisos;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Ruta asignada: " + rutaAsignada);
        System.out.println("Número de pisos: " + numeroPisos);
        System.out.println("------------------------------");
    }
}
