package Pieces;

public class King {
    /*
     * Constructor
     * Movement Logic:
     * Assume starting position KE2
     * First Tokenize the Position : Column 3, Row 1
     * Then take input
     * If the input is Tokenized into Original_Column +/- 1 and or Original_Row +/- 1
     * Then the move is legal Change State of King
     * Redraw Board
     *
     * King Object (boolean color, int column, int row)
     */
    boolean color;
    int column;
    int row;

    public King(boolean color, int column, int row) {
        this.color = color;
        this.column = column;
        this.row = row;
    }

    public boolean moveKing(int startColumn, int startRow, int endColumn, int endRow) {
        int columnDifference = Math.abs(endColumn - startColumn);
        int rowDifference = Math.abs(endRow - startRow);

        if (columnDifference <= 1 && rowDifference <= 1 &&
                (columnDifference != 0 || rowDifference != 0)) {
            column = endColumn;
            row = endRow;
            return false;
        }
        else {
            return true;
        }
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
}