package domein;

public interface Entity {
    public void setCurrentTile(Tile tile);
    public void addTileToPath(Tile tile);
    public void removeLastAddedTile();
    public void emptyPath();
    public void moveEntity();
    public boolean movesPlanned();
}
