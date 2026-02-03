package main;
import javax.swing.JFrame;

public class Game {
    public void start() {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Tower Defense Game");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);
        window.pack();
        gamePanel.demo();
        window.setLocationRelativeTo(null);
        window.setVisible(true);

    }
}
