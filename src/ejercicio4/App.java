package ejercicio4;

import ejercicio4.Fracciones.Fraccion;

public class App {
    public static void main(String[] args) {
        Fraccion fr = new Fraccion(10,8);        
        fr.simplifica();

        Fraccion fr2 = new Fraccion(5,4);
        Fraccion resultado = fr.suma(fr2);
        
        System.out.print(new Fraccion(10, 3).multiplica(3).divide(new Fraccion(20,3).potencia(2)).simplifica());
    }
}
