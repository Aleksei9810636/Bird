import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bird {
    double x;
    double y;
    BufferedImage image;

    public Bird(double x, double y) throws IOException {
        this.x = x;
        this.y = y;
        this.image = ImageIO.read(new File("data\\bird.png"));
    }
    void paint(Graphics g){
        g.fillOval((int)x, (int) y, 50, 50);
        g.drawImage(this.image, (int)(x- image.getWidth()/2),(int)(y- image.getHeight()/2), null);

    }
    void update(){
        this.y+=1;

    }
}
