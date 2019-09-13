package h04;

import java.awt.*;
import java.applet.*;

public class Dobbelsteen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRoundRect(20,100,80,80,10, 10);
        g.fillOval(30, 115, 20,20);
        g.fillOval(70,115,20,20);
        g.fillOval(30,150,20,20);
        g.fillOval(70,150,20,20);
    }}