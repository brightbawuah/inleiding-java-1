package h04;

import java.awt.*;
import java.applet.*;

public class NederlandseVlag extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
g.drawLine(90, 200, 90, 100);
g.drawRect(90, 100, 50, 30);
g.setColor(Color.red);
g.fillRect(90, 100, 50, 10);
g.setColor(Color.blue);
g.fillRect(90, 120, 50, 10);
    }
    }