package ejercicio5.pizzeria;

public class Pizza {
    private static int totalPedidas = 0;
    private static int totalServidas = 0;

    private String tipo;
    private String tamaño;
    private boolean servida;

    public Pizza(String tipo, String tamaño) {
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.servida = false;
        totalPedidas++;
    }
    //Getters
    public static int getTotalPedidas() {
        return totalPedidas;
    }

    public static int getTotalServidas() {
        return totalServidas;
    }


    public boolean sirve(){
        if(!servida){
            servida = true;
            totalServidas++;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("pizza %s %s, %s", tipo, tamaño, (servida?"servida":"pedida"));
    }
}
