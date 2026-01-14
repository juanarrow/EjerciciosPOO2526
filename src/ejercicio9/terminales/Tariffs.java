package ejercicio9.terminales;

public class Tariffs {
    public static final int AVAILABLE_TARIFFS = 3;
    public static Tariff[] tariffs = new Tariff[AVAILABLE_TARIFFS];

    public static int savedTariffs = 0;
    public Tariffs(){        
    }

    public static void addTariff(String nombre, double precio){
        for (int i = 0; savedTariffs != tariffs.length && i < tariffs.length; i++) {
            if(tariffs[i] == null){
                tariffs[i] = new Tariff(nombre, precio);
                savedTariffs++;
                return;
            }
        }
    }    

    public static Tariff getTariff(String name){
        for (int i = 0; i < tariffs.length; i++) {
            if(tariffs[i] != null && tariffs[i].getName().toLowerCase().equals(name.toLowerCase())){
                return tariffs[i];
            }
        }
        return null;
    
    } 

}
