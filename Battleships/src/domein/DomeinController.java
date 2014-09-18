package domein;

public class DomeinController {
    private Game game;
    
    public DomeinController(){
        game = new Game();
    }
    
    public boolean gameRunning(){
        return game.getPlaying();
    }
    
    public boolean movesPlanned(){
        return game.movesPlanned();
    }
    
    public void moveEntities(){
        game.moveEntities();
    }
    
    public String getOverview(){
        return game.getStringRep();
    }
}
