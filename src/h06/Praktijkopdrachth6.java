package h06;

import java.awt.*;
import java.applet.*;

public class Praktijkopdrachth6 extends Applet {
    double a;
    double b;
    double c;

    double uitkomst;


    public void init(){
        a = 5.9;
        b = 6.3;
        c = 6.9;
        uitkomst = (a+b+c) / 3;
        uitkomst *= 10;
        uitkomst = (int) uitkomst;
        uitkomst = uitkomst / 10;
    }
    public void paint(Graphics g){
        g.drawString("Het gemiddelde is " +  uitkomst,50, 60 );
    }
}