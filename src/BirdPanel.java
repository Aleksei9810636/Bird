import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class BirdPanel extends JPanel implements KeyEventDispatcher { // наследуемся от базовой панели
    Bird bird=new Bird(1,1);


    public BirdPanel(Bird bird) throws IOException {
        this.bird=bird;

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        bird.paint(g);
        bird.update();
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent e) {
        System.out.println("EVENT HAPPEND!");
        if (e.getID() == KeyEvent.KEY_RELEASED) {
            bird.y-=70;
        }
        return false;
    }
}// 32, 10
