package ejercicio7;

import ejercicio7.entradas.Zona;
import ejercicio7.interfaces.VentaEntradas;
import ejercicio7.utils.Lectura;

public class App {
    public static final int AVAILABLE_ZONES = 3;
    public static VentaEntradas[] zonas = new VentaEntradas[AVAILABLE_ZONES];
    public static String[] nombresZonas = {"Zona Principal", "Zona Compra-Venta", "Zona Vip"};

    public static void inicializarZonas(){
        zonas[0] = new Zona(1000);
        zonas[1] = new Zona(200);
        zonas[2] = new Zona(25);
    }

    public static String submenu(int opcion) throws IllegalArgumentException{
        String menu = "";
        switch(opcion){
            case 2:
                menu = """
                        1. Zona Principal
                        2. Zona Compra-Venta
                        3. Zona Vip
                        """;
                break;
            default: throw new IllegalArgumentException("Valor de opción no válido");
        }
        return menu;
    }

    public static String menu(){
        String menu = """
                1. Mostrar número de entradas libres.
                2. Vender entradas.
                3. Salir.
                """;
        return menu;
    }

    
    public static void main(String[] args) {
        int opcion = -1;
        inicializarZonas();
        do{
            System.out.println(menu());
            opcion = Lectura.leerEntero("Seleccione una opción: ", 1, 3);
            switch(opcion){
                case 1:
                    for(int i = 0; i < AVAILABLE_ZONES; i++)
                        System.out.printf("En %s hay %d%n", nombresZonas[i], zonas[i].getEntradasPorVender());
                    
                    break;
                case 2:
                    try {
                        System.out.println(submenu(opcion));
                        int zona = Lectura.leerEntero("Elige la zona para la que quieres comprar las entradas: ", 1, 3);
                        int numEntradas = Lectura.leerEntero("¿Cuántas entradas quieres ?: ", 1, Integer.MAX_VALUE);
                        if(zonas[zona-1] != null){
                            try {
                                zonas[zona-1].vender(numEntradas);
                                System.out.println("Aquí tiene sus " + numEntradas + " entradas, gracias.");
                            } catch (Exception e){
                                System.out.println(e.getMessage());
                            }
                        } else {
                            System.out.println("La zona seleccionada no existe.");
                        }

                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }                    

                    break;
                default:
            }
        }while(opcion!=3);
    }
}
