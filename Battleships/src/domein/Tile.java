package domein;

public class Tile {
    private int x, y;
    private Entity entity;
    
    public Tile(int x, int y){
        setX(x);
        setY(y);
    }
    
    public void setEntity(Entity ent){
        this.entity = ent;
        System.out.println("adding ship");
    }
    
    private void setX(int x){
        this.x = x;
    }
    
    private void setY(int y){
        this.y = y;
    }
    
    @Override
    public String toString(){
        if(entity == null)
            return "~";
        else 
            return entity.toString();
    }
}
