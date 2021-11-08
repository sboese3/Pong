import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Panel extends JPanel implements ActionListener {

    // 4:3 aspect ratio that should fit on most screens, can change if needed
    public static final int WINDOW_WIDTH = 1024;
    public static final int WINDOW_HEIGHT = 768;

    // Game updates 60 times per second, can change if needed
    Timer timer = new Timer(1000 / 60, this);

    private Ball ball;
    private Paddle leftPaddle;
    private Paddle rightPaddle;

    public Panel() {
        setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));

        timer.start();

        ball = new Ball();
        leftPaddle = new Paddle(0);
        rightPaddle = new Paddle(WINDOW_WIDTH - Paddle.WIDTH);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D)g;
        try {
            Image background = ImageIO.read(new File("images/background.png"));
            g2d.drawImage(background, 0, 0, this);
        } catch (IOException e) {
            System.out.println("Could not load background!");
        }
        draw(g2d);
    }

    public void draw(Graphics2D g) {
        ball.draw(g);
        leftPaddle.draw(g);
        rightPaddle.draw(g);
    }

    // This method is called every time the game updates
    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
