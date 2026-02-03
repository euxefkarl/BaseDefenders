package main;
import components.Hitbox;
import components.Position;
import components.Sprite;
import entities.Entity;
import entities.EntityManager;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import systems.Renderer;

public class GamePanel extends JPanel{
    //SCREEN DIMENSIONS
    int SCREEN_HEIGHT = 576;
    int SCREEN_WIDTH = 1024;
    Graphics g;

    //entity manager
    public EntityManager em = new EntityManager();
    public Renderer renderer = new Renderer(this);
    

    public GamePanel() {
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(new Color(0, 0, 0));
        this.setDoubleBuffered(true);
        this.setFocusable(true);
    }

    public void demo(){
        Entity demo = em.createEntity();
        demo.addComponent(new Position(SCREEN_WIDTH/2, SCREEN_HEIGHT/2));
        demo.addComponent(new Hitbox(16, 16, 16, 16));
        demo.addComponent(new Sprite("/res/orc_down1"));
        renderer.paintComponent(g);
    }

    
}
