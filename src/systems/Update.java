package systems;


import main.GamePanel;

public class Update extends GameSystem implements Runnable {
    
    GamePanel gp;
    
    //Game Thread
    Thread gameThread;
    final int FPS = 60;
    
    public Update(GamePanel gp) {
        this.gp = gp;
    }



    @Override
    public void run() {
        double drawInterval = 1000000000.0 / FPS;
        double delta = 0;
        long lastTime = GameSystem.nanoTime();
        long timer = 0;
        int drawCount = 0;

        while (gameThread != null) {
            long currentTime = GameSystem.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            timer += (currentTime - lastTime);
            lastTime = currentTime;

            if (delta >= 1) {
                delta--;
                drawCount++;
            }

            if (timer >= 1000000000) {
                GameSystem.out.println("FPS: " + drawCount);
                drawCount = 0;
                timer = 0;
            }
        }
    }
}
