package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht112 extends Applet {
    @Override
    public void init() {
    }

    @Override
    public void paint(Graphics g) {
        int y = 0;

        for (int teller = 10; teller <= 20; teller++) {
            y += 20;
            g.drawString(""+ teller, 50,y);
        }
    }
}
