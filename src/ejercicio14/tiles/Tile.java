package ejercicio14.tiles;

public interface Tile {
    public Tile flip();
    public boolean simpleFit(Tile other);
    public boolean fit(Tile other);   
    public int getSideA();
    public int getSideB();
}
