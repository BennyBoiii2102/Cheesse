import StateManagement.Game;
import StateManagement.Move;
import gui.Menu;
import Pieces.*;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import static gui.Menu.panel;

public class Main {
    public static void main(String[] args){
        Game game = new Game();
        Piece[][] board = new Piece[8][8];
        Move move = new Move();
        Scanner input = new Scanner(System.in);
        new Menu(game);
        while (true) {
            try {
                inputParse(move, input);
                game.GameLoop(move, board);
                panel.repaint();
                setBoardState(game, board);
                TimeUnit.SECONDS.sleep(1);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(
                            " | Start: (" + move.getStartColumn() + ", " + move.getStartRow() + ")" +
                            " | End: (" + move.getEndColumn() + ", " + move.getEndRow() + ")"
            );
        }
    }

    public static void inputParse(Move move, Scanner input) {
        System.out.print("Move: ");
        String playerMove = input.nextLine();

        if (playerMove.length() != 6) {
            System.out.println("You did not type in the correct amount of characters \n The correct amount is 6");
            return ;
        }

        // wke1e2
        move.setColor(playerMove.charAt(0));
        move.setPiece(playerMove.charAt(1));
        move.setStartColumn('h' - playerMove.charAt(2));
        move.setStartRow(playerMove.charAt(3) - '1');
        move.setEndColumn('h' - playerMove.charAt(4));
        move.setEndRow(playerMove.charAt(5) - '1');
    }

    public static void setBoardState(Game game, Piece[][] piece) {
        piece[game.whiteKing.getColumn()][game.whiteKing.getRow()] = game.whiteKing;
        piece[game.blackKing.getColumn()][game.blackKing.getRow()] = game.blackKing;
    }
}