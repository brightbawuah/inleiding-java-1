package h04;

import java.awt.*;
import java.applet.*;

public class Staafdiagram extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(60, 200, 210, 200);
        g.drawLine(60, 200, 60, 50);;
        g.setColor(Color.yellow);
        g.fillRect(70, 160, 20, 40);
        g.setColor(Color.blue);
        g.fillRect(120, 100, 20, 100);
        g.setColor(Color.red);
        g.fillRect(170, 120, 20, 80);
        g.setColor(Color.black);
        g.drawString("Valerie", 70, 215);
        g.drawString("Jeroen", 120, 215);
        g.drawString("Hans", 170, 215);
        g.drawString("0", 30, 200);
        g.drawString("20",30, 180);
        g.drawString("40",30, 160);
        g.drawString("60",30, 140);
        g.drawString("80", 30, 120);
        g.drawString("100", 30, 100);
        g.drawString("120", 30, 80);
    }}
