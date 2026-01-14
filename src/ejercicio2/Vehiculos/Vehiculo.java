package ejercicio2.Vehiculos;

public abstract class Vehiculo implements Movimiento {

    //Propiedades
    private static int vehiculosCreados = 0;
    private static int kilometrosTotales = 0;    
    protected int kilometrosRecorridos = 0;

    //Constructores
    Vehiculo(){
        vehiculosCreados++;
    }

    //Getters
    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }

    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }    
    
    //Métodos privados
    private static void acumulaKms(int kms){
        kilometrosTotales+=kms;
    }

    //Métodos públicos



    //Overrides
    @Override
    public void recorre(int kms) {
        acumulaKms(kms);
    }

    
}
