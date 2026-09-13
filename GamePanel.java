package gui;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;

public class GamePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        DrawFunctions draw = new DrawFunctions();

        draw.drawBorder(g);
        draw.drawBoard(g);
        draw.drawStart(g);
    }
}