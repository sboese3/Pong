import java.awt.*;
import javax.swing.*;

public class Window extends JFrame {

    // Doesn't add any functionality, just provides a nice way to reference each panel
    public enum Panels {
        MENU,
        GAME,
    }

    // 4:3 aspect ratio that should fit on most screens, can change if needed
    public static final int WINDOW_WIDTH = 1024;
    public static final int WINDOW_HEIGHT = 768;

    // Sets up the Window for the application
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

    // Used for switching between different panels
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
