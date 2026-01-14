package ejercicio6.tiempo;

public class Tiempo {
    private int segundos;

    public Tiempo(){    
        this.segundos = 0;
    }

    public Tiempo(int segundos){
        this.segundos = segundos;
    }

    public Tiempo(int horas, int minutos, int segundos){
        this.segundos = horas*3600 + minutos*60 + segundos;
    }

    public int getHoras(){
        return segundos / 3600;
    }

    public int getMinutos(){
        return (segundos % 3600) / 60;
    }

    public int getSegundos() {     
        return segundos % 60;
    }

    public Tiempo suma(Tiempo t){
        return new Tiempo(segundos+t.segundos);
    }

    public Tiempo resta(Tiempo t){
        return new Tiempo(segundos-t.segundos);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", getHoras(), getMinutos(), getSegundos());
    }
}
