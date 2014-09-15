package domein;

public class Player {
    private String playerName;
    private Tile[][] playingField;
    private Tile[][] shootingField;
    
    public Player(){
        setPlayerName("defaultPlayer");
        initFieldPlayer();
        initShootingField();
    }
        
    public Player(String name){
        setPlayerName(name);
        initFieldPlayer();
        initShootingField();
    }
    
    private void initFieldPlayer(){
        playingField = new Tile[PublicGameSettings.getGameFieldHeight()][PublicGameSettings.getGameFieldHeight()];
        for(int x = 0; x < PublicGameSettings.getGameFieldHeight(); x++){
            for(int y = 0; y < PublicGameSettings.getGameFieldHeight(); y++){
                playingField[x][y] = new Tile(x, y);
            }
        }
    }
    
    private void initShootingField(){
        shootingField = new Tile[PublicGameSettings.getGameFieldHeight()][PublicGameSettings.getGameFieldHeight()];
        for(int x = 0; x < PublicGameSettings.getGameFieldHeight(); x++){
            for(int y = 0; y < PublicGameSettings.getGameFieldHeight(); y++){
                shootingField[x][y] = new Tile(x, y);
            }
        }
    }
    
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        
        builder.append(playerName + "\n");
        builder.append("player's field: \n");
        for(int i = 0; i < playingField.length; i++){
            for(int j = 0; j < playingField[i].length; j++){
                builder.append(playingField[i][j].toString());
            }
            builder.append("\n");
        }
        
        builder.append("shootingField: \n");
        for(int i = 0; i < shootingField.length; i++){
            for(int j = 0; j < shootingField[i].length; j++){
                builder.append(shootingField[i][j].toString());
            }
            builder.append("\n");
        }
        
        return builder.toString();
    }
    
    private void setPlayerName(String value){
        this.playerName = value;
    }
}
