package Movement;

import Pieces.CheckSquare;
import Pieces.Piece;

public class KingCapture {
    public static boolean captureLikeKing(Piece[][] board, Piece piece, int startColumn, int startRow, int endColumn, int endRow) {
        int columnDifference = Math.abs(endColumn - startColumn);
        int rowDifference = Math.abs(endRow - startRow);
        Piece occupied = CheckSquare.checkSquare(board, endColumn, endRow);
        boolean squareFull = occupied != null;

        if ((columnDifference <= 1 && rowDifference <= 1) &&
                (columnDifference != 0 || rowDifference != 0) && (squareFull)) {
            occupied.setRow(9);
            occupied.setColumn(9);
            return true;
        }
        else {
            return false;
        }
    }
}
