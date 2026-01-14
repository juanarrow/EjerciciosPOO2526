package ejercicio6;

import ejercicio6.tiempo.Tiempo;

public class App {
    public static void main(String[] args) {
        Tiempo t1 = new Tiempo(3601);
        Tiempo t2 = new Tiempo(1);
        System.out.println(t1+" - " + t2 + " = " + t1.resta(t2));        
    }
}
