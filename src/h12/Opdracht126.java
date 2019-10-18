package h12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht126 extends Applet {
    TextField tekstvak;
    Button knop;
    String tekst;
    boolean gevonden;

    int[] getallen = {0,0,0,1,2,2,3,3,4,5,5,5,5,5,6,6,7,7,7,7,7,7,8,8,8,8,8,9,9,};

    public void init() {
        tekstvak = new TextField(15);
        add(tekstvak);

        tekst = "";

        gevonden = false;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Dit getal komt zo vaak voor " + tekst, 75, 75 );

    }
}
