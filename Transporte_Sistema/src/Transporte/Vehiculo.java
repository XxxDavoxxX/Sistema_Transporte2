package Transporte;
import java.util.Scanner;

    public class Vehiculo {
        private String id;
        private int capacidadPasajeros;
        private float velocidadMaxima;
        private String estado;

        public Vehiculo(String id, int capacidadPasajeros, float velocidadMaxima, String estado) {
            this.id = id;
            setCapacidadPasajeros(capacidadPasajeros);
            setVelocidadMaxima(velocidadMaxima);
            setEstado(estado);
        }

        // Getters y Setters con validaciones
        public String getId() { return id; }

        public int getCapacidadPasajeros() { return capacidadPasajeros; }
        public void setCapacidadPasajeros(int capacidadPasajeros) {
            if (capacidadPasajeros > 0) {
                this.capacidadPasajeros = capacidadPasajeros;
            }
        }

        public float getVelocidadMaxima() { return velocidadMaxima; }
        public void setVelocidadMaxima(float velocidadMaxima) {
            if (velocidadMaxima >= 0) {
                this.velocidadMaxima = velocidadMaxima;
            }
        }

        public String getEstado() { return estado; }
        public void setEstado(String estado) {
            if (estado.equals("en servicio") || estado.equals("fuera de servicio")) {
                this.estado = estado;
            }
        }

        public void mostrarInfo() {
            System.out.println("ID: " + id);
            System.out.println("Capacidad: " + capacidadPasajeros);
            System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
            System.out.println("Estado: " + estado);
        }
    }

