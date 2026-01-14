package ejercicio7.excepciones;

public class SoldOutException extends Exception {  
      
    public SoldOutException(String message){
        super(message); 
    }

    @Override
    public String toString() {
        return String.format("%s", super.getMessage());
    }
}
