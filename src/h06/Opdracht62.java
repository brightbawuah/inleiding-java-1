package h06;

import java.awt.*;
import java.applet.*;

public class Opdracht62 extends Applet {
    int a;
    int b;
    int c;
    int d;
    int e;
    int uitkomst1;
    int uitkomst2;
    int uitkomst3;

    public void init(){
        a = 60;
        b = 24;
        c = 3600;
        d = 86400;
        e = 365;
        uitkomst1 = a * a;
        uitkomst2 = b * c;
        uitkomst3 = d * e;
    }

    public void paint(Graphics g){
        g.drawString("Aantal seconden in een minuut is 60", 20, 20);
        g.drawString("Aantal seconden in een uur is aantal seconden in een minuut keer 60 =" + uitkomst1, 20, 40);
        g.drawString("Aantal seconden in een dag is aantal seconden in een uur keer 24 =" +uitkomst2, 20, 60);
        g.drawString("Aantal seconden in een jaar is aantal seconden in een dag keer 365 =" + uitkomst3, 20, 80);
    }
}