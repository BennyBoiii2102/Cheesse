import StateManagement.Game;
import gui.Menu;
import Pieces.*;

import java.util.concurrent.TimeUnit;
import static gui.Menu.panel;

public class Main {
    public static void main(String[] args){
        Game game = new Game();
        new Menu(game);
        while (true) {
            try {
                game.GameLoop();
                panel.repaint();
                TimeUnit.SECONDS.sleep(1);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}