package systems;
import components.Sprite;
import entities.Entity;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import main.GamePanel;

public class Renderer extends GameSystem {
    GamePanel gp;

    public Renderer(GamePanel gp) {
        this.gp = gp;
    }

  
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        for (Entity e: gp.em.getEntities().values()) {
            if(e.hasComponent(Sprite.class)){
                drawEntity(g2, e);
            }
        }
    }


    public void drawEntity(Graphics2D g2, Entity e){
        BufferedImage sprite = e.getComponent(Sprite.class).getSprite();
        int pos_x = e.getComponent(components.Position.class).x;
        int pos_y = e.getComponent(components.Position.class).y;
        
        g2.drawImage(sprite, pos_x, pos_y, null);
    }

}
