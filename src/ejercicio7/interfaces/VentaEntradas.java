package ejercicio7.interfaces;

import ejercicio7.excepciones.NotEnoughTickets;
import ejercicio7.excepciones.SoldOutException;

public interface VentaEntradas {
    public int getEntradasPorVender();
    public boolean vender(int n) throws NotEnoughTickets, SoldOutException;
}
