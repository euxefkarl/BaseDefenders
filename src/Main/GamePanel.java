package Main;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
    //SCREEN DIMENSIONS
    int SCREEN_HEIGHT = 576;
    int SCREEN_WIDTH = 1024;
    int SCALE = 1;


    public GamePanel() {
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(new Color(0, 0, 0));
        this.setDoubleBuffered(true);
        this.setFocusable(true);
    }
}
