package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht116 extends Applet {
    @Override
    public void init() {
    }

    @Override
    public void paint(Graphics g) {
        int x = 100;
        int y = 100;
        int grootte = 2;
        for(int teller = 0; teller < 5; teller++) {
            x -= 5;
            y -= 5;
            grootte += 10;
            g.drawOval(x,y,grootte, grootte);
        }
    }
}
