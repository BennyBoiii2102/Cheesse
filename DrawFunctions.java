package gui;

import StateManagement.Game;

import java.awt.*;

public class DrawFunctions {
    Game game;

    public DrawFunctions(Game game) {
        this.game = game;
    }
    void drawGame(Graphics g) {
        drawKing(g, false, game.blackKing.getColumn(), game.blackKing.getRow());
        drawKing(g, true, game.whiteKing.getColumn(), game.whiteKing.getRow());
    }
    void drawBorder(Graphics g) {
        g.setColor(Color.BLACK);
        g.setFont(new Font("Serif", Font.BOLD, 40));
        g.drawString("H", 80, 35);
        g.drawString("G", 185, 35);
        g.drawString("F", 285, 35);
        g.drawString("E", 385, 35);
        g.drawString("D", 485, 35);
        g.drawString("C", 585, 35);
        g.drawString("B", 685, 35);
        g.drawString("A", 785, 35);

        g.drawString("1", 15, 110);
        g.drawString("2", 15, 210);
        g.drawString("3", 15, 310);
        g.drawString("4", 15, 410);
        g.drawString("5", 15, 510);
        g.drawString("6", 15, 610);
        g.drawString("7", 15, 710);
        g.drawString("8", 15, 810);

        g.fillRect(45, 45, 5, 805);
        g.fillRect(45, 45, 805, 5);
        g.fillRect(850, 45, 5, 805);
        g.fillRect(45, 850, 810, 5);
    }


    void drawBoard(Graphics g) {
        g.setColor(new Color(66, 61, 61));
        for (int row = 0; row < 8; row++) {
            for (int column = 0; column < 8; column++) {
                int x = 50 + column * 100;
                int y = 50 + row * 100;

                if ((row + column) % 2 != 0) {
                    g.fillRect(x, y, 100, 100);
                }
            }
        }
        g.setColor(new Color(255, 0, 0));
        for (int row = 0; row < 8; row++) {
            for (int column = 0; column < 8; column++) {
                int x = 50 + column * 100;
                int y = 50 + row * 100;

                if ((row + column) % 2 == 0) {
                    g.fillRect(x, y, 100, 100);
                }
            }
        }
    }

    void drawStart(Graphics g) {
        drawPawn(g, false, 0, 6);
        drawPawn(g, false, 1, 6);
        drawPawn(g, false, 2, 6);
        drawPawn(g, false, 3, 6);
        drawPawn(g, false, 4, 6);
        drawPawn(g, false, 5, 6);
        drawPawn(g, false, 7, 6);

        drawPawn(g, true, 0, 1);
        drawPawn(g, true, 1, 1);
        drawPawn(g, true, 2, 1);
        drawPawn(g, true, 3, 1);
        drawPawn(g, true, 4, 1);
        drawPawn(g, true, 5, 1);
        drawPawn(g, true, 7, 1);

        drawKing(g, false, 3, 7);
        drawKing(g, true, 3, 0);

        drawPedestal(g, false, 4, 7);
        drawPedestal(g, true, 4, 0);

        drawCup(g, true, 2, 0);
        drawCup(g, false, 2, 7);

        drawHorse(g, false, 7, 7);
        drawHorse(g, false, 0, 7);

        drawHorse(g, true, 0, 0);
        drawHorse(g, true, 7, 0);

        drawGoliath(g, false, 6, 6);
        drawGoliath(g, true, 6, 1);

        drawStartDuck(g);

        drawFawn(g, false, 1, 5);
        drawFawn(g, false, 6, 5);

        drawFawn(g, true, 1, 2);
        drawFawn(g, true, 6, 2);
    }


    void drawCup(Graphics g, boolean color, int column, int row) {
        row = row * 100;
        column = column * 100;

        if (color) {
            g.setColor(Color.WHITE);
            g.fillOval(85 + column, 70 + row, 25, 75);
            g.fillOval(73 + column, 120 + row, 50, 25);
            g.fillOval(70 + column, 65 + row, 55, 45);
            g.setColor(new Color(227, 193, 144));
            g.fillOval(77 + column, 65 + row, 40, 25);
        } else {
            g.setColor(Color.BLACK);
            g.fillOval(85 + column, 70 + row, 25, 75);
            g.fillOval(73 + column, 120 + row, 50, 25);
            g.fillOval(70 + column, 65 + row, 55, 45);
            g.setColor(new Color(100, 0, 28));
            g.fillOval(77 + column, 65 + row, 40, 25);
        }
    }

    void drawPawn(Graphics g, boolean color, int column, int row) {
        row = row * 100;
        column = column * 100;

        if (color) {
            g.setColor(Color.WHITE);
            g.fillOval(85 + column, 70 + row, 25, 75);
            g.fillOval(73 + column, 120 + row, 50, 25);
            g.fillOval(80 + column, 65 + row, 35, 35);
            g.fillRect(78 + column, 93 + row, 40, 7);
        } else {
            g.setColor(Color.BLACK);
            g.fillOval(85 + column, 70 + row, 25, 75);
            g.fillOval(73 + column, 120 + row, 50, 25);
            g.fillOval(80 + column, 65 + row, 35, 35);
            g.fillRect(78 + column, 93 + row, 40, 7);
        }
    }

    void drawKing(Graphics g, boolean color, int column, int row) {
        row = row * 100;
        column = column * 100;
        if (color) {
            g.setColor(Color.WHITE);
            g.fillOval(85 + column, 70 + row, 25, 75);
            g.fillOval(73 + column, 120 + row, 50, 25);
            g.fillOval(80 + column, 65 + row, 35, 35);
            g.fillRect(87 + column, 55 + row, 20, 7);
            g.fillRect(94 + column, 51 + row, 7, 25);
        }
        else {
            g.setColor(Color.BLACK);
            g.fillOval(85 + column, 70 + row, 25, 75);
            g.fillOval(73 + column, 120 + row, 50, 25);
            g.fillOval(80 + column, 65 + row, 35, 35);
            g.fillRect(87 + column, 55 + row, 20, 7);
            g.fillRect(94 + column, 51 + row, 7, 25);
        }
    }

    void drawPedestal(Graphics g, boolean color, int column, int row) {
        row = row * 100;
        column = column * 100;
        if (color) {
            g.setColor(Color.WHITE);
            g.fillRect(82 + column, 80 + row, 30, 55);
            g.fillRect(72 + column, 65 + row, 50, 15);
            g.fillOval(73 + column, 120 + row, 50, 25);
        }
        else {
            g.setColor(Color.BLACK);
            g.fillRect(82 + column, 80 + row, 30, 55);
            g.fillRect(72 + column, 65 + row, 50, 15);
            g.fillOval(73 + column, 120 + row, 50, 25);
        }
    }

    void drawHorse(Graphics g, boolean color, int column, int row) {
        row = row * 100;
        column = column * 100;

        if (color) {
            g.setColor(Color.WHITE);
            g.fillRect(82 + column, 80 + row, 30, 55);
            g.fillOval(75 + column, 55 + row, 45, 45);
            g.fillOval(65 + column, 75 + row, 25, 25);
            g.fillOval(70 + column, 115 + row, 55, 30);
            g.setColor(Color.BLACK);
            g.fillOval(85 + column, 65 + row, 10, 10);
        }
        else {
            g.setColor(Color.BLACK);
            g.fillRect(82 + column, 80 + row, 30, 55);
            g.fillOval(75 + column, 55 + row, 45, 45);
            g.fillOval(65 + column, 75 + row, 25, 25);
            g.fillOval(70 + column, 115 + row, 55, 30);
            g.setColor(Color.WHITE);
            g.fillOval(85 + column, 65 + row, 10, 10);
        }
    }

    void drawGoliath(Graphics g, boolean color, int column, int row) {
        row = row * 100;
        column = column * 100;

        if (color) {
            g.setColor(Color.WHITE);
            g.fillRect(82 + column, 80 + row, 30, 55);
            g.fillRect(72 + column, 65 + row, 50, 15);
            g.fillOval(73 + column, 120 + row, 50, 25);
            g.fillOval(89 + column,50 + row,15,15);
            g.fillRect(59 + column, 100 + row, 75, 7);
            g.fillRect(76 + column, 80 + row, 42, 7);
        }
        else {
            g.setColor(Color.BLACK);
            g.fillRect(82 + column, 80 + row, 30, 55);
            g.fillRect(72 + column, 65 + row, 50, 15);
            g.fillOval(73 + column, 120 + row, 50, 25);
            g.fillOval(89 + column,50 + row,15,15);
            g.fillRect(59 + column, 100 + row, 75, 7);
            g.fillRect(76 + column, 80 + row, 42, 7);
        }
    }

    void drawDuck(Graphics g, int column, int row) {
        row = row * 100;
        column = column * 100;
        g.setColor(new Color(255, 220, 0));
        g.fillOval(70 + column, 95 + row, 55, 40);

        g.setColor(new Color(255, 235, 50));
        g.fillOval(78 + column, 65 + row, 40, 40);

        g.setColor(new Color(255, 140, 0));
        g.fillOval(65 + column, 78 + row, 25, 12);

        g.setColor(Color.BLACK);
        g.fillOval(103 + column, 75 + row, 6, 6);

        g.setColor(new Color(255, 220, 0));
        g.fillOval(73 + column, 125 + row, 50, 20);
    }
    void drawStartDuck(Graphics g) {
        int row = 350;
        int column = 350;

        g.setColor(new Color(255, 220, 0));
        g.fillOval(70 + column, 95 + row, 55, 40);

        g.setColor(new Color(255, 235, 50));
        g.fillOval(78 + column, 65 + row, 40, 40);

        g.setColor(new Color(255, 140, 0));
        g.fillOval(65 + column, 78 + row, 25, 12);

        g.setColor(Color.BLACK);
        g.fillOval(103 + column, 75 + row, 6, 6);

        g.setColor(new Color(255, 220, 0));
        g.fillOval(73 + column, 125 + row, 50, 20);
    }

    void drawFawn(Graphics g, boolean color, int column, int row) {
        row = row * 100;
        column = column * 100;

        if (color) {
            g.setColor(Color.WHITE);
            g.fillOval(65 + column, 95 + row, 65, 35);
            g.fillOval(95 + column, 70 + row, 25, 50);
            g.fillOval(90 + column, 55 + row, 40, 35);
            g.fillOval(87 + column, 50 + row, 15, 25);
            g.fillOval(118 + column, 50 + row, 15, 25);
            g.fillRect(100 + column, 115 + row, 8, 25);
            g.fillRect(115 + column, 115 + row, 8, 25);
            g.fillRect(72 + column, 115 + row, 8, 25);
            g.fillRect(87 + column, 115 + row, 8, 25);
            g.fillOval(60 + column, 92 + row, 18, 18);
            g.fillOval(88 + column, 75 + row, 12, 10);
        }
        else {
            g.setColor(Color.BLACK);
            g.fillOval(65 + column, 95 + row, 65, 35);
            g.fillOval(95 + column, 70 + row, 25, 50);
            g.fillOval(90 + column, 55 + row, 40, 35);
            g.fillOval(87 + column, 50 + row, 15, 25);
            g.fillOval(118 + column, 50 + row, 15, 25);
            g.fillRect(100 + column, 115 + row, 8, 25);
            g.fillRect(115 + column, 115 + row, 8, 25);
            g.fillRect(72 + column, 115 + row, 8, 25);
            g.fillRect(87 + column, 115 + row, 8, 25);
            g.fillOval(60 + column, 92 + row, 18, 18);
            g.fillOval(88 + column, 75 + row, 12, 10);
        }
    }
}
