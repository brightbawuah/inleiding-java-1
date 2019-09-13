package h06;

import java.awt.*;
import java.applet.*;

public class Opdracht61 extends Applet {
    int a;
    int b;
    int uitkomst;

    public void init(){
        a = 113;
        b = 4;
        uitkomst = a / b;
    }

    public void paint(Graphics g){
        g.drawString("De berekening 113/4 =" + uitkomst, 20,20);
        g.drawString("Jan:" + uitkomst, 20,40);
        g.drawString("Ali:" +uitkomst, 20, 60);
        g.drawString("Jeannette:" + uitkomst, 20, 80);
        g.drawString("Bright:" + uitkomst, 20, 100);
    }
}

