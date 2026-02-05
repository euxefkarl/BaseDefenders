package components;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Sprite extends Components {
    public String imagePath;
    public BufferedImage sprite;
    public int scale = 4;
    
    public Sprite(String imagePath) {
        this.imagePath = imagePath;
        this.sprite = null;
    }

    public void loadSprite(String path) {
        try {
            sprite = ImageIO.read(getClass().getResourceAsStream(path+".png"));
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public BufferedImage getSprite() {
        return sprite;
    }
    public boolean isLoaded() {
        return sprite != null;
    }

    

}
