package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht113 extends Applet {
    @Override
    public void init() {
    }

    @Override
    public void paint(Graphics g) {
       int teller;
       int y = 0;
       int a = 1;
       int b = 0;
       int c;

       for (teller = 0; teller < 10; teller++) {
           y += 20;
           c = a + b;
           g.drawString("" + c, 50, y);
           a = b;
           b = c;

       }
    }
}