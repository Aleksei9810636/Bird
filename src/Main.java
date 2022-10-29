import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Bird bird=new Bird(637,357);
        BirdPanel panel = new BirdPanel(bird);

        // Создаем окно
        JFrame frame = new JFrame();
        frame.add(panel);        // добавляем в окно панель
        frame.setSize(1280, 720);
        frame.setVisible(true);

        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();   // менеджер по трудоустройству слушателей клавиатуры
        manager.addKeyEventDispatcher(panel);    // подключаем нашу панель к прослушиванию клавиатуры

        while (true) {
            frame.repaint();
        }
    }
}