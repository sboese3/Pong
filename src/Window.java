import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Window extends JFrame {

    public Window() {
        Panel panel = new Panel();
        this.add(panel);
        this.setTitle("Pong");
        this.setResizable(false);
        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.pack();
    }
}
