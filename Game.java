package StateManagement;

import Pieces.King;
import Pieces.Piece;
import gui.Menu;



public class Game {
    public King whiteKing;
    public King blackKing;

    public Game() {
        whiteKing = new King(true, 3, 0);
        blackKing = new King(false, 3, 7);
    }

    public void GameLoop(Move move, Piece[][] board) {
        if (move.color == 'w') {
            switch (move.piece) {
                case ('k'): {
                    boolean succeed = whiteKing.moveKing(board, whiteKing, move.startColumn, move.startRow, move.endColumn, move.endRow);
                    if (!succeed) {
                        System.out.println("Error in Moving");
                    }
                    else {
                        board[move.startColumn][move.startColumn] = null;
                        board[move.endColumn][move.endRow] = whiteKing;
                        Menu.panel.repaint();
                    }
                }
            }
        }
        else if (move.color == 'b') {
            switch (move.piece) {
                case ('k'): {
                    boolean succeed = blackKing.moveKing(board, blackKing, move.startColumn, move.startRow, move.endColumn, move.endRow);
                    if (!succeed) {
                        System.out.println("Error in Moving");
                    }
                    else {
                        board[move.startColumn][move.startColumn] = null;
                        board[move.endColumn][move.endRow] = whiteKing;
                        Menu.panel.repaint();
                    }
                }
            }
        }
    }
}