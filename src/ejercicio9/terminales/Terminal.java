package ejercicio9.terminales;

import ejercicio9.interfaces.Llamada;

public class Terminal implements Llamada{
    protected String telefono;
    protected int duracionLlamadas;

    public Terminal(String telefono){
        this.telefono = telefono;
        this.duracionLlamadas = 0;
    }
 
    @Override
    public void llama(Terminal t, int duracion) {        
        this.duracionLlamadas += duracion;
        t.duracionLlamadas += duracion;
    }


    @Override
    public String toString() {
        return String.format("%s - %ds de conversación", telefono, duracionLlamadas);
    }


}
