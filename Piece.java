package Pieces;

public class Piece {
    boolean color;
    int column;
    int row;

    public Piece(boolean color, int column, int row) {
        this.color = color;
        this.column = column;
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public boolean getColor() {
        return color;
    }

    public void setColumn(int newColumn) {
        column = newColumn;
    }

    public void setRow(int newRow) {
        row = newRow;
    }
}
