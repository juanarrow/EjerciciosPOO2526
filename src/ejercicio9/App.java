package ejercicio9;

import ejercicio9.terminales.Movil;
import ejercicio9.terminales.Tariffs;

public class App {
    public static void main(String[] args) {

        Tariffs.addTariff("RATA", 0.06);        
        Tariffs.addTariff("MONO", 0.12);        
        Tariffs.addTariff("BISONTE", 0.30);        
        Movil m1 = new Movil("678 11 22 33", "rata");
        Movil m2 = new Movil("644 74 44 69", "mono");
        Movil m3 = new Movil("622 32 89 09", "bisonte");
        System.out.println(m1);
        System.out.println(m2);
        m1.llama(m2, 320);
        m1.llama(m3, 200);
        m2.llama(m3, 550);
        System.out.println(m1);
        System.out.println(m2); 
        System.out.println(m3);        
    }   
}
