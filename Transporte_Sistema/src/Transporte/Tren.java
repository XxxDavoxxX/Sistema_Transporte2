package Transporte;

public class Tren extends Vehiculo {
    private int numeroVagones;
    private String tipo; // "eléctrico" o "diésel"

    public Tren(String id, int capacidadPasajeros, float velocidadMaxima, String estado,
                int numeroVagones, String tipo) {
        super(id, capacidadPasajeros, velocidadMaxima, estado);
        this.numeroVagones = numeroVagones;
        this.tipo = tipo;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de vagones: " + numeroVagones);
        System.out.println("Tipo: " + tipo);
        System.out.println("------------------------------");
    }
}