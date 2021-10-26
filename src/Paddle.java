import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Paddle {

    int height = 150;
    int width = 20;
    int x;

    Paddle(int x) {
        this.x = x;
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(x, 340, width, height);
    }


}