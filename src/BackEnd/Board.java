package BackEnd;

public class Board {
    private static final int columns = 10;
    private static final int maxHeight = 20;

    private Cell[][] tetrisBoard;
    private int[] colMax;

    public Board() {
        tetrisBoard = new Cell[maxHeight][columns];
        colMax = new int[columns];
    }

    public Cell[][] getTetrisBoard() {
        return tetrisBoard;
    }

    public int getMaxInCol(int column) {
        return colMax[column];
    }
}
