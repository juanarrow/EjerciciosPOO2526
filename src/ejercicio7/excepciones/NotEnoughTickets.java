package ejercicio7.excepciones;

public class NotEnoughTickets extends Exception {
    int availableTickets = 0;
    public NotEnoughTickets(String message, int availableTickets) {
        super(message);
        this.availableTickets = availableTickets;
    }

    @Override
    public String toString() {
        return String.format("%s", super.getMessage());
    }
}
