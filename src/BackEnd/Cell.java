package BackEnd;

import java.awt.*;

public class Cell {
    private int x;
    private int y;
    Color color;

    public Cell(int[] position, Color color) {
        x = position[0];
        y = position[1];
        this.color = color;
    }
}
