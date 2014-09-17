package domein;

import java.util.List;

public class Ship implements Entity{
    private Tile currentTile;
    private List<Tile> path;
    
    public Ship(){
        
    }
    
    public Ship(Tile currentTile){
        
    }
    
    public Ship(Tile currentTile, List<Tile> path){
        
    }
    
    @Override
    public String toString(){
        return "s";
    }
}
