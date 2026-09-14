package Movement;

import Pieces.CheckSquare;
import Pieces.Piece;

public class KingMovement {
    public static boolean moveLikeKing(Piece[][] board, Piece piece, int startColumn, int startRow, int endColumn, int endRow) {
        int columnDifference = Math.abs(endColumn - startColumn);
        int rowDifference = Math.abs(endRow - startRow);
        Piece occupied = CheckSquare.checkSquare(board, endColumn, endRow);
        boolean squareFull = occupied != null;

        if ((columnDifference <= 1 && rowDifference <= 1) &&
                (columnDifference != 0 || rowDifference != 0) && (!squareFull)) {
            piece.setColumn(endColumn);
            piece.setRow(endRow);
            return true;
        }
        else {
            return false;
        }
    }
}
