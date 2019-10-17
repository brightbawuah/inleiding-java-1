package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht115 extends Applet {
    @Override
    public void init() {
    }

    @Override
    public void paint(Graphics g) {
        int y = 0;
        int x = 0;
        for (int teller = 0; teller < 5; teller++){
            y += 20;
            x += 20;
            g.drawRect(x, y,20,20);
        }
    }
}
