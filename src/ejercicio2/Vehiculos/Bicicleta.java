package ejercicio2.Vehiculos;

public class Bicicleta extends Vehiculo{    
    public Bicicleta(){
        super();
    }

    @Override
    public void recorre(int kms) {
        super.recorre(kms); 
        kilometrosRecorridos+=kms;        
        System.out.println("La bicicleta ha recorrido " + kms + " kms");
    }
}
