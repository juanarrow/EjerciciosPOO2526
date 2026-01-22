package ejercicio14;

import ejercicio14.tiles.DominoTile;
import ejercicio14.tiles.Tile;
import ejercicio14.tiles.Tiles;

public class App {
    public static void main(String[] args) {
        
        DominoTile f1 = new DominoTile(6, 1);
        DominoTile f2 = new DominoTile(0, 4);
        DominoTile f3 = new DominoTile(3, 3);
        DominoTile f4 = new DominoTile(0, 1);
        
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f2.flip());
        System.out.println(f2.fit(f4));
        System.out.println(f1.fit(f4));
        System.out.println(f1.fit(f3));
        System.out.println(f1.fit(f2));

        Tiles game = new Tiles(false);
        game.shuffle();
        int randomPosition = (int)(Math.random() * game.getTilesLength());
        Tile currentTile = game.extractTile(randomPosition);        
        System.out.print(currentTile);
        int tiles = 1;
        while(tiles<8){
            randomPosition = (int)(Math.random() * game.getTilesLength());
            Tile newTile = game.extractTile(randomPosition);
            if(currentTile.simpleFit(newTile) || currentTile.simpleFit(newTile.flip())){
                if(newTile.getSideB() == currentTile.getSideB()){
                    newTile = newTile.flip();
                }
                System.out.print(newTile);
                currentTile = newTile;
                tiles++;
            }
            else{
                game.addTile(newTile);
            }

        }

        
    }   
}
