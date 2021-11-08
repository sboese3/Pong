import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Ball {

    public static final int RADIUS = 10;

    Ball() {

    }

    public void draw(Graphics2D g) {
        g.setColor(Color.white);
        g.fillOval((Panel.WINDOW_WIDTH / 2) - RADIUS, (Panel.WINDOW_HEIGHT / 2) - RADIUS, RADIUS * 2, RADIUS * 2);
    }

}