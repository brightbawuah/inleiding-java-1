package h05;

import java.awt.*;
import java.applet.*;

public class Opdracht52 extends Applet {
int lijn;
int Valerie;
int Jeroen;
int Hans;

    public void init() {
        lijn = 200;
        Valerie = 50;
        Jeroen = 100;
        Hans = 70;
    }

    public void paint(Graphics g) {
        g.drawLine(60, 200, 210, 200);
        g.drawLine(60, 200, 60, 50);;
        g.setColor(Color.yellow);
        g.fillRect(70, lijn - Valerie, 20, Valerie);
        g.setColor(Color.blue);
        g.fillRect(120, lijn - Jeroen, 20, Jeroen);
        g.setColor(Color.red);
        g.fillRect(170, lijn - Hans, 20, Hans);
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