import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    Ball b;
    Paddle p1;
    Paddle p2;
    Image image;
    Graphics g1;
    public Panel() {
        Dimension size = new Dimension(1500, 830);
        this.setPreferredSize(size);
        this.setOpaque(false);
        this.setFocusable(true);
        this.setVisible(true);
        b = new Ball();
        p1 = new Paddle(0);
        p2 = new Paddle(1480);
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        image = createImage(getWidth(), getHeight());
        g1 = image.getGraphics();
        draw(g1);
        g2d.drawImage(image, 0, 0, this);
    }

    public void draw(Graphics g) {
        b.draw(g);
        p1.draw(g);
        p2.draw(g);
    }
}
