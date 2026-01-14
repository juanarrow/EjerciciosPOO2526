package ejercicio7.utils;

public class Lectura {
    public static int leerEntero(String mensaje, int min, int max) {
        boolean correcto = false;
        int valor = -1;
        while(!correcto){
            try{
                valor = Integer.parseInt(System.console().readLine(mensaje));
                if(valor>=min && valor<=max){
                    correcto = true;
                }
                else{
                    System.out.println("Error: el valor debe estar entre " + min + " y " + max);
                }
            }
            catch(NumberFormatException e){
                System.out.println("Error: debe introducir un número entero.");
            }
        }
        return valor;
    }
}
