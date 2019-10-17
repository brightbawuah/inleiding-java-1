package h08;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkh08 extends Applet {
    Button vermenigvuldigknop;
    Button deelknop;
    Button minknop;
    Button plusknop;
    TextField tekstvakgetal1;
    TextField tekstvakgetal2;
    double getal1;
    double getal2;
    double uitkomst;
    String s1;
    String s2;

    public void init() {
        tekstvakgetal1 = new TextField("",10);
        add(tekstvakgetal1);
        tekstvakgetal2 = new TextField("",10);
        add(tekstvakgetal2);

        vermenigvuldigknop = new Button("*");
        vermenigvuldigknop.addActionListener(new VermenigvuldigknopListener());
        add(vermenigvuldigknop);
        deelknop = new Button("/");
        deelknop.addActionListener(new DeelknopListener() );
        add(deelknop);
        minknop = new Button("-");
        minknop.addActionListener(new MinknopListener() );
        add(minknop);
        plusknop = new Button("+");
        plusknop.addActionListener(new PlusknopListener() );
        add(plusknop);

        getal1 = 0;
        getal2 = 0;
        uitkomst = getal1 + getal2;

        s1 = "";
        s2 = "";
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("",50,60);
    }

    class VermenigvuldigknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s1 = tekstvakgetal1.getText();
            getal1 = Double.parseDouble(s1);
            s2 = tekstvakgetal2.getText();
            getal2 = Double.parseDouble(s2);
            uitkomst = getal1 * getal2;
            tekstvakgetal1.setText("" + uitkomst);
            tekstvakgetal2.setText("");
            repaint();
        }
    }

    class DeelknopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s1 = tekstvakgetal1.getText();
            getal1 = Double.parseDouble(s1);
            s2 = tekstvakgetal2.getText();
            getal2 = Double.parseDouble(s2);
            uitkomst = getal1 / getal2;
            tekstvakgetal1.setText("" + uitkomst);
            tekstvakgetal2.setText("");
            repaint();
        }
    }
    class MinknopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s1 = tekstvakgetal1.getText();
            getal1 = Double.parseDouble(s1);
            s2 = tekstvakgetal2.getText();
            getal2 = Double.parseDouble(s2);
            uitkomst = getal1 - getal2;
            tekstvakgetal1.setText("" + uitkomst);
            tekstvakgetal2.setText("");
            repaint();
        }
    }
    class PlusknopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s1 = tekstvakgetal1.getText();
            getal1 = Double.parseDouble(s1);
            s2 = tekstvakgetal2.getText();
            getal2 = Double.parseDouble(s2);
            uitkomst = getal1 + getal2;
            tekstvakgetal1.setText("" + uitkomst);
            tekstvakgetal2.setText("");
            repaint();
        }
    }
}
