package ejercicio9.terminales;

import ejercicio9.interfaces.Tarificacion;

public class Movil extends Terminal implements Tarificacion{

    public int duracionLlamadaRealizada;
    Tariff tariff; 

    public Movil(String telephone, String tariff) {
        super(telephone);
        this.tariff = Tariffs.getTariff(tariff);
    }

    @Override
    public void llama(Terminal t, int duracion){
        super.llama(t, duracion);
        this.duracionLlamadaRealizada += duracion;
    }


    @Override
    public String toString() {
        return String.format(super.toString()+"- tarificados: %.2f euros", duracionLlamadaRealizada/60.0*tariff.getPrice());
    }
    
}
