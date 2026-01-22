package ejercicio14.tiles;

public class Tiles {
    private final int MAX_TILES = 28;    
    private Tile[] tiles;
    private int tilesLength;
    
    
    public Tiles(boolean empty){
        if(empty){
            this.tiles = new Tile[0];
            this.tilesLength = 0;
        }
        else{            
            int position = 0;
            this.tiles = new Tile[MAX_TILES];
            for(int i = 0; i <= 6; i++){
                for(int j = i; j <= 6; j++){
                    tiles[position++] = new DominoTile(i, j);
                }
            }
            this.tilesLength = MAX_TILES;
        }
        
    }

    public Tiles(Tiles other, int start, int end){
       this.tiles = this.extractTiles(start, end);
       this.tilesLength = this.tiles.length;
    }

    public Tiles(Tile[] tiles){
        this.tiles = new Tile[tiles.length];
        for(int i=0; i < tiles.length; i++){
            this.tiles[i] = tiles[i];
        }
        this.tilesLength = tiles.length;
    }

    public Tile[] getTiles(){
        Tile[] copy = new Tile[this.tilesLength];
        for(int i=0; i < this.tilesLength; i++){
            copy[i] = this.tiles[i];
        }
        return copy;
    }

    public Tile[] extractTiles(int start, int end){        
        if(start > end || start < 0 || start > this.tilesLength - 1 || end < 0 || end > this.tilesLength - 1){
            throw new IllegalArgumentException("Invalid start or end indices");
        }
        Tile[] newTiles = new Tile[end - start + 1];        
        int position = 0;
        for(int i = start; i <= end; i++){
            newTiles[position++] = this.tiles[i];
        }        
        return newTiles;
    }

    public Tile popTile(){
        if(this.tilesLength == 0 || this.tiles == null){
            return null;
        }
        Tile firstTile = this.tiles[0];
        this.tiles = new Tiles(this,1, this.tilesLength - 1).tiles; 

        return firstTile;
    }

    public Tile extractTile(int position){
        if(position < 0 || position >= this.tilesLength){
            throw new IllegalArgumentException("Invalid position");
        }
        Tile tile = null;
        tile = this.tiles[position];
        for(int i = position; i < this.tilesLength-1; i++){
            this.tiles[i] = this.tiles[i+1];
        }
        tilesLength--;
        return tile;
    }

    public void addTile(Tile tile){
        if(tile == null || tilesLength == MAX_TILES){
            throw new IllegalArgumentException("Tile cannot be null");
        }
        Tile[] newTiles = new Tile[this.tilesLength + 1];
        for(int i = 0; i < this.tilesLength; i++){
            newTiles[i] = this.tiles[i];
        }
        newTiles[this.tilesLength] = tile;
        this.tiles = newTiles;
    }


    public int getTilesLength() {
        return tilesLength;
    }

    
    public Tiles shuffle(){        
        for(int i = 0; i < this.tilesLength; i++){
            int index = (int)(Math.random() * this.tilesLength);
            Tile temp = this.tiles[i];
            this.tiles[i] = this.tiles[index];
            this.tiles[index] = temp;
        }
        return this;
    }
}
