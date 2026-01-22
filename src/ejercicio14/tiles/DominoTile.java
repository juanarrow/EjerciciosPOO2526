package ejercicio14.tiles;

import javax.imageio.plugins.tiff.TIFFField;

public class DominoTile implements Tile{
    private int sideA;
    private int sideB;

    public DominoTile(int sideA, int sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }
    
    @Override
    public Tile flip() {
        return new DominoTile(sideB, sideA);
    }

    @Override
    public boolean simpleFit(Tile other) {
        return sideB == other.getSideA();
    }

    
    @Override
    public boolean fit(Tile other) {
        return this.simpleFit(other) || this.simpleFit(other.flip()) ||
               this.flip().simpleFit(other) || this.flip().simpleFit(other.flip());
    }


    @Override
    public int getSideA() {
        return sideA;
    }

    @Override
    public int getSideB() {
        return sideB;
    }

    @Override
    public String toString() {
        return String.format("[%s|%s]", sideA!=0?sideA:" ", sideB!=0?sideB:" ");
    }
}
