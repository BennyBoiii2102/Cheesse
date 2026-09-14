package Pieces;

public class CheckSquare {
    public static Piece checkSquare(Piece[][] board, int columnChecked, int rowChecked) {
        Piece square = board[columnChecked][rowChecked];
        if (square == null) {
            return null;
        }
        else {
            return square;
        }
    }
}
