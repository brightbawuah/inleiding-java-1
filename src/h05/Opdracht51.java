package h05;

import java.awt.*;
import java.applet.*;

public class Opdracht51 extends Applet {
    //declaratie
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        //initialisatie
        opvulkleur = Color.magenta;
        lijnkleur = Color.black;
        breedte = 260;
        hoogte = 100;
    }

    public void paint(Graphics g) {
        g.drawLine(20,50,280,50);
        g.drawString("Lijn",130,65);
        g.drawRect(20,100,breedte, hoogte);
        g.drawString("Rechthoek",120,215);
        g.drawRoundRect(20,225,breedte, hoogte,20,20);
        g.drawString("Afgeronde rechthoek", 80,340);
        g.setColor(opvulkleur);
        g.fillRect(300,100, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawOval(300,100,breedte,hoogte);
        g.drawString("Gevulde rechthoek met ovaal",340,215);
        g.setColor(opvulkleur);
        g.fillOval(300,225,breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawString("Gevulde ovaal",390,340);
        g.setColor(opvulkleur);
        g.fillArc(580, 100,breedte, hoogte, 0, 45);
        g.setColor(lijnkleur);
        g.drawArc(580,100, breedte, hoogte,0,360);
        g.drawString("Taartpunt met ovaal eromheen",620,215);
        g.drawOval(660,225,hoogte, hoogte);
        g.drawString("Cirkel",695,340);
    }}