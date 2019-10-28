package H12;

import java.applet.Applet;
import java.awt.*;
import java.util.*;

public class Opdracht121 extends Applet {
    int[] getallen = { 1, 33, 94, 4838, 93938, 12, 800, 24, 34020, 10};
    int gemiddelde;

    public void init() {
        setBackground(Color.GREEN);
    }

    public void paint(Graphics g) {
        for(int i = 0; i < getallen.length; i++) {
            g.setFont(new Font("default", Font.BOLD, 14));
            g.drawString("" + getallen[i], 10, 30+(i*15));
            gemiddelde += getallen[i];
        }
        gemiddelde /= getallen.length;
        g.drawString("Gemiddelde is " + gemiddelde, 50, 40);
    }
}