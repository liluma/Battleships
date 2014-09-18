package domein;

import java.util.ArrayList;
import java.util.List;

public class Ship implements Entity{
    private Tile currentTile;
    private List<Tile> path;
    
    public Ship(){
        path = new ArrayList<Tile>();
    }
    
    public Ship(Tile currentTile){
        path = new ArrayList<Tile>();
    }
    
    public Ship(Tile currentTile, List<Tile> path){
        this.path = path;
    }
    
    @Override
    public String toString(){
        return "s";
    }

    @Override
    public void addTileToPath(Tile tile) {
        path.add(tile);
    }

    @Override
    public void removeLastAddedTile() {
        path.remove(path.size() - 1);
    }

    @Override
    public void emptyPath() {
        path.clear();
    }

    @Override
    public void moveEntity() {
        if(movesPlanned()){
            currentTile.setEntity(null);
        
            //get first element
            currentTile = path.get(0);
            currentTile.setEntity(this);
            path.remove(0);
        }
    }
    
    public boolean movesPlanned(){
        if(path.size() > 0 )
            return true;
        
        return false;
    }
    
    public void setCurrentTile(Tile tile){
        this.currentTile = tile;
    }
}
