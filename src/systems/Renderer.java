package systems;
import components.Sprite;
import entities.Entity;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import main.GamePanel;

public class Renderer extends GameSystem {
    
    GamePanel gp;
    public Renderer(GamePanel gp) {
        this.gp = gp;
    }

   
    
    public void drawEntity(Graphics2D g2, Entity e){
        BufferedImage sprite = e.getComponent(Sprite.class).getSprite();
        int pos_x = e.getComponent(components.Position.class).x;
        int pos_y = e.getComponent(components.Position.class).y;
        sprite = scaleImage(sprite);
        g2.drawImage(sprite, pos_x, pos_y, null);
    }
    public BufferedImage scaleImage(BufferedImage sprite){
        int scale = 1;
        int width = sprite.getWidth() * scale;
        int height = sprite.getHeight() * scale;
        BufferedImage scaledImage = new BufferedImage(width, height, sprite.getType());
        return scaledImage;
    }
    
    // Render all entities onto the provided Graphics2D context
    public void render(Graphics2D g2) {
        for (Entity e: gp.em.getEntities().values()) {
            if(e.hasComponent(Sprite.class)){
                drawEntity(g2, e);
            }
        }
    }

}
