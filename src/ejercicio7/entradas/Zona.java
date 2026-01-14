package ejercicio7.entradas;

import java.net.SocketException;

import ejercicio7.excepciones.NotEnoughTickets;
import ejercicio7.excepciones.SoldOutException;
import ejercicio7.interfaces.VentaEntradas;

public class Zona implements VentaEntradas {
    private int entradasPorVender;

    public Zona(int n) {
        entradasPorVender = n;
    }

    @Override
    public int getEntradasPorVender() {
        return entradasPorVender;
    }

    /**
     * Vende un número de entradas.
     * Comprueba si quedan entradas libres antes de realizar la venta.
     *
     * @param n número de entradas a vender
     */
    @Override
    public boolean vender(int n) throws NotEnoughTickets, SoldOutException{
        if (this.entradasPorVender == 0) {
            throw new SoldOutException("Lo siento, las entradas para esa zona están agotadas.");
        } else if (this.entradasPorVender < n) {
            throw new NotEnoughTickets("No hay suficientes entradas disponibles", this.entradasPorVender);
        }
        if (this.entradasPorVender >= n) {
            entradasPorVender -= n;
            return true;
        }
        return false;
    }
}