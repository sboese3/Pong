import java.awt.*;
import javax.swing.*;

public class Window extends JFrame {

    public enum Panels {
        MENU,
        GAME,
    }

    // 4:3 aspect ratio that should fit on most screens, can change if needed
    public static final int WINDOW_WIDTH = 1024;
    public static final int WINDOW_HEIGHT = 768;

    public Window() {
        setPanel(Panels.MENU);
        this.setTitle("Pong");
        this.setResizable(false);
        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.pack();
    }

    public void setPanel(Panels p) {
        JPanel panel = new JPanel();
        if(p == Panels.MENU) {
            panel = new Menu(this);
        } else if(p == Panels.GAME) {
            panel = new Game();
        }
        panel.setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
        this.add(panel);
    }
}
