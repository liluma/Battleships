package domein;

public class Game {
    private boolean playing;
    private Player player1;
    private Player player2;
    
    public Game(){
        player1 = new Player();
        player2 = new Player();
        
        setPlaying(true);
    }
    
    public Game(String playerName1, String playerName2){
        player1 = new Player(playerName1);
        player2 = new Player(playerName2);
        
        setPlaying(true);
    }
    
    private void setPlaying(boolean value){
        this.playing = value;
    }
    
    public String getStringRep(){
        StringBuilder builder = new StringBuilder();
        
        builder.append(player1.toString());
        builder.append(player2.toString());
        setPlaying(false);
        
        return builder.toString();
    }
    
    public boolean movesPlanned(){
        return player1.movesPlanned();
    }
    
    public void moveEntities(){
        if(player1.movesPlanned())
            player1.moveEntity();
        
        if(player2.movesPlanned())
            player2.moveEntity();
    }
    
    public boolean getPlaying(){
        return playing;
    }
}
