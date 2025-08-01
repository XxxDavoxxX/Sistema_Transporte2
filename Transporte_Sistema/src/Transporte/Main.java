package Transporte;

import java.util.ArrayList;

public class Main{
        public static void main(String[] args) {
            ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

            listaVehiculos.add(new AutoBus("A01", 60, 80, "en servicio", "Ruta 7", 2));
            listaVehiculos.add(new Tren("T01", 200, 120, "en servicio", 10, "eléctrico"));
            listaVehiculos.add(new BicicletaPublica("B01", 1, 25, "fuera de servicio", true, 85));

            mostrarEstadoFlotilla(listaVehiculos);
        }

        public static void mostrarEstadoFlotilla(ArrayList<Vehiculo> listaVehiculos) {
            for (Vehiculo v : listaVehiculos) {
                System.out.println("----------");
                v.mostrarInfo();
            }
        }
}
