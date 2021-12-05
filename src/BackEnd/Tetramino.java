package BackEnd;

public abstract class Tetramino {
    private int x;
    private int y;
    
    //Get the Cells as part of the Tetramino
    public abstract Cell[] getCells();

    //Rotate the Tetramino
    public abstract void Rotate();
}
