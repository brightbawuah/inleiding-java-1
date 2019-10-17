package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht111 extends Applet {
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int y = 0;
        for (int teller = 0; teller <= 10; teller++) {
            y += 20;
            g.drawLine(20, y, 200, y);
        }
    }
}
