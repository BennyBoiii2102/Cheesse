package gui;

import javax.swing.JFrame;

public class Menu extends JFrame
{
    private GamePanel panel;

    public Menu()
    {
        setTitle("CHEESSE");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new GamePanel();
        add(panel);

        setVisible(true);
    }
}