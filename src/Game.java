import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Game extends JPanel implements ActionListener {

    // Game updates 60 times per second, can change if needed
    Timer timer = new Timer(1000 / 60, this);

    private Ball ball;
    private Paddle leftPaddle;
    private Paddle rightPaddle;

    public Game() {
        timer.start();

        ball = new Ball();
        leftPaddle = new Paddle(0);
        rightPaddle = new Paddle(Window.WINDOW_WIDTH - Paddle.WIDTH);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D)g;
        try {
            Image background = ImageIO.read(new File("images/game_background.png"));
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
