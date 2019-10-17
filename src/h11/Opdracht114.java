package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht114 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        int a = 0;
        int b = 3;
        int c;
        for (teller = 0; teller <10; teller++){
            y += 20;
            c = a + b;
            g.drawString("" + c, 150, y);
            a+= b;
        }
    }
}
