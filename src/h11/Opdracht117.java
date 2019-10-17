package h11;

import java.applet.*;
import java.awt.*;

public class Opdracht117 extends Applet{
    public void init() {

        }
        public void paint(Graphics g) {
            int x = 500;
            int y = 500;
            int grootte = 2;
            for(int teller = 0; teller < 50; teller++) {
                x -= 5;
                y -= 5;
                grootte += 10;
                g.drawOval(x,y,grootte, grootte);
            }
    }
}
