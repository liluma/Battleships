package domein;

public class Tile {
    private int x, y;
    private Obstacle obstacle;
    
    public Tile(int x, int y){
        setX(x);
        setY(y);
    }
    
    private void setX(int x){
        this.x = x;
    }
    
    private void setY(int y){
        this.y = y;
    }
    
    @Override
    public String toString(){
        if(obstacle == null)
            return "~";
        
        else return obstacle.toString();
    }
}
