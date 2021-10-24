import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Ball {

    int radius = 20;

    Ball() {

    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(750, 375, radius, radius);
    }
}