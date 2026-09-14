package Pieces;

import Movement.KingCapture;
import Movement.KingMovement;

public class King extends Piece{
    public King(boolean color, int column, int row) {
        super(color, column, row);
    }
    /*
     * Assume starting position KE2
     * First Tokenize the Position : Column 3, Row 1
     * Then take input
     * If the input is Tokenized into Original_Column +/- 1 and or Original_Row +/- 1
     * Then the move is legal Change State of King
     * Redraw Board
     *
     * King Object (boolean color, int column, int row)
     */
    public boolean moveKing(Piece[][] board, Piece piece, int startColumn, int startRow, int endColumn, int endRow) {
        Piece occupied = CheckSquare.checkSquare(board, endColumn, endRow);
        if (occupied != null) {
            KingCapture.captureLikeKing(board, piece, startColumn, startRow, endColumn, endRow);
        }

        return KingMovement.moveLikeKing(board, piece, startColumn, startRow, endColumn, endRow);
    }
}