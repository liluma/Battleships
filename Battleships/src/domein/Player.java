package domein;

import java.util.ArrayList;

public class Player {
    private String playerName;
    private Ship ship;
    private Tile[][] playingField;
    private Tile[][] shootingField;
    private final int STARTX = 5;
    private final int STARTY = 5;
    
    public Player(){
        setPlayerName("defaultPlayer");
        ArrayList<Tile> path = new ArrayList<Tile>();
        initFieldPlayer();
        path.add(playingField[4][4]);
        path.add(playingField[3][4]);
        path.add(playingField[2][3]);
        ship = new Ship(playingField[STARTX][STARTY], path);
        placeShipOnField();
        initShootingField();
    }
        
    public Player(String name){
        setPlayerName(name);
        initFieldPlayer();
        ship = new Ship();
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
    
    private void placeShipOnField(){
        playingField[STARTX][STARTY].setEntity(ship);
        ship.setCurrentTile(playingField[STARTX][STARTY]);
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
    
    public boolean movesPlanned(){
        return ship.movesPlanned();
    }
    
    public void moveEntity(){
        ship.moveEntity();
    }
}
