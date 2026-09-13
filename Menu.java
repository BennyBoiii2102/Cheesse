package gui;

import StateManagement.Game;

import javax.swing.JFrame;

public class Menu extends JFrame
{
    public static GamePanel panel;

    public Menu(Game game)
    {
        setTitle("CHEESSE");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new GamePanel(game);
        add(panel);

        setVisible(true);
    }
}