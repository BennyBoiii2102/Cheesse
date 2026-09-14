package StateManagement;

public class Move {
    char color;
    char piece;
    int startColumn;
    int startRow;
    int endColumn;
    int endRow;

    public char getColor() {
        return color;
    }
    public char getPiece() {
        return piece;
    }
    public int getStartColumn() {
        return startColumn;
    }
    public int getStartRow() {
        return startRow;
    }
    public int getEndColumn() {
        return endColumn;
    }
    public int getEndRow() {
        return endRow;
    }

    public void setColor(char newColor) {
        color = newColor;
    }
    public void setPiece(char newPiece) {
        piece = newPiece;
    }
    public void setStartColumn(int newStartColum) {
        startColumn = newStartColum;
    }
    public void setStartRow(int newStartRow) {
        startRow = newStartRow;
    }
    public void setEndColumn(int newEndColumn) {
        endColumn = newEndColumn;
    }
    public void setEndRow(int newEndRow) {
        endRow = newEndRow;
    }
}