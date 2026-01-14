package ejercicio2;

import ejercicio2.Vehiculos.Bicicleta;
import ejercicio2.Vehiculos.Coche;
import ejercicio2.Vehiculos.Vehiculo;

public class App {
    public static void main(String[] args) {
        
        Vehiculo[] vehiculo = new Vehiculo[2];
        vehiculo[0] = new Coche();
        vehiculo[1] = new Bicicleta();
        for(Vehiculo v: vehiculo ) {
            v.recorre(30);            
        }
        
        
        Bicicleta bici1 = new Bicicleta();
        Bicicleta bici2 = new Bicicleta();
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        System.out.println("Vehículos creados: " + Vehiculo.getVehiculosCreados());        

        coche1.recorre(50);
        coche2.recorre(70);
        bici1.recorre(15);
        bici1.recorre(15);
        bici1.recorre(15);
        bici1.recorre(15);
        bici1.recorre(15);
        bici2.recorre(25);

        System.out.println("Kilómetros totales recorridos por todos los vehículos: " + Vehiculo.getKilometrosTotales());
        System.out.println("Kilómetros recorridos por el coche 1: " + coche1.getKilometrosRecorridos());
        System.out.println("Kilómetros recorridos por el coche 2: " + coche2.getKilometrosRecorridos());
        System.out.println("Kilómetros recorridos por la bicicleta 1: " + bici1.getKilometrosRecorridos());
        System.out.println("Kilómetros recorridos por la bicicleta 2: " + bici2.getKilometrosRecorridos());


        

    }

    
}
