package components;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public final class Sprite extends Components {
    public String imagePath;
    public BufferedImage sprite;
    protected int scale = 4;
    protected int originalTileSize = 16; 
    protected int tileSize = scale * originalTileSize;
    
    public Sprite(String imagePath) {
        this.imagePath = imagePath;
        this.sprite = loadSprite(imagePath);
    }

    public BufferedImage loadSprite(String path) {
        try {
            sprite = ImageIO.read(getClass().getResourceAsStream(path+".png"));
            sprite = scaleSprite(sprite, tileSize, tileSize);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sprite;
    }

    public BufferedImage scaleSprite(BufferedImage sprite, int width, int height){
        if(sprite != null){
            BufferedImage scaledSprite = new BufferedImage(width, height, sprite.getType());
            Graphics2D g2 = scaledSprite.createGraphics();
            g2.drawImage(sprite, 0, 0, width, height,  null);
            g2.dispose();

            return scaledSprite;
        }
        
        throw new IllegalArgumentException("Sprite is null");
    }

    public BufferedImage getSprite() {
        return sprite;
    }
    public boolean isLoaded() {
        return sprite != null;
    }

    

}
