package gui;

import javax.swing.*;
import java.awt.Graphics;
import Pieces.*;
import StateManagement.Game;

public class GamePanel extends JPanel {
    Game game;

    public GamePanel(Game game) {
        this.game = game;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        DrawFunctions draw = new DrawFunctions(game);

        draw.drawBorder(g);
        draw.drawBoard(g);
        // draw.drawStart(g);
        draw.drawGame(g);
    }
}