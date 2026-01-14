package ejercicio2.Vehiculos;

public class Coche extends Vehiculo{
 
    public Coche(){
        super();
    }
 
    @Override
    public void recorre(int kms) {
        super.recorre(kms);
        kilometrosRecorridos+=kms;        
        System.out.println("El coche ha recorrido " + kms + " kms");
    }
}
