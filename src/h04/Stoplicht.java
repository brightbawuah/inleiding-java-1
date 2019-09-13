package h04;

import java.awt.*;
import java.applet.*;

public class Stoplicht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
      g.fillRect(147,150, 5, 150);
      g.setColor(Color.black);
        g.fillRect(130, 90, 40, 60);
        g.setColor(Color.red);
        g.fillOval(140, 90, 20, 20);
        g.setColor(Color.orange);
        g.fillOval(140, 110, 20, 20);
        g.setColor(Color.green);
        g.fillOval(140, 130, 20,20);
    }}
