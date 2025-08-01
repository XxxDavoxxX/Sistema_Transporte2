package Transporte;

public class BicicletaPublica extends Vehiculo {
    private boolean tieneCesta;
    private int nivelBateria; // 0-100 si es eléctrica

    public BicicletaPublica(String id, int capacidadPasajeros, float velocidadMaxima, String estado,
                            boolean tieneCesta, int nivelBateria) {
        super(id, capacidadPasajeros, velocidadMaxima, estado);
        this.tieneCesta = tieneCesta;
        setNivelBateria(nivelBateria);
    }

    public void setNivelBateria(int nivelBateria) {
        if (nivelBateria >= 0 && nivelBateria <= 100) {
            this.nivelBateria = nivelBateria;
        } else {
            this.nivelBateria = 0;
        }
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tiene Cesta: " + (tieneCesta ? "Sí" : "No"));
        System.out.println("Nivel de Batería: " + nivelBateria + "%");
    }
}
