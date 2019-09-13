package h04;

import java.awt.*;
import java.applet.*;

public class Praktijkopdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
      g.drawLine(20,50,280,50);
      g.drawString("Lijn",130,65);
      g.drawRect(20,100,260, 100);
      g.drawString("Rechthoek",120,215);
      g.drawRoundRect(20,225,260,100,20,20);
      g.drawString("Afgeronde rechthoek", 80,340);
      g.setColor(Color.magenta);
      g.fillRect(300,100,260,100);
      g.setColor(Color.black);
      g.drawOval(300,100,260,100);
      g.drawString("Gevulde rechthoek met ovaal",340,215);
      g.setColor(Color.magenta);
      g.fillOval(300,225,260,100);
      g.setColor(Color.black);
      g.drawString("Gevulde ovaal",390,340);
      g.setColor(Color.magenta);
      g.fillArc(580, 100, 260, 100, 0, 45);
      g.setColor(Color.black);
      g.drawArc(580,100,260,100,0,360);
      g.drawString("Taartpunt met ovaal eromheen",620,215);
      g.drawOval(660,225,100,100);
      g.drawString("Cirkel",695,340);
    }}
