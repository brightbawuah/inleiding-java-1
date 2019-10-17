package h08;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class Opdracht82 extends Applet{
  TextField tekstvak;
  Button knopman;
  Button knopvrouw;
  Button potmanknop;
  Button potvrouwknop;
  Label label;
  int mannen;
  int vrouwen;
  int potmannen;
  int potvrouwen;
  String S1 = "";
  String S2 = "";
  String S3 = "";
  String S4 = "";
  String totaal;


    public void init() {
        knopman = new Button("Man");
        knopvrouw = new Button("Vrouw");
        potmanknop = new Button("Potentiële man");
        potvrouwknop = new Button("Potentiële vrouw");
        label = new Label("Het totaal is");
        knopman.addActionListener(new ManListener() );
        knopvrouw.addActionListener(new VrouwListener() );
        potmanknop.addActionListener(new PotmanListener() );
        potvrouwknop.addActionListener(new PotvrouwListener() );
        add(knopman);
        add(knopvrouw);
        add(potmanknop);
        add(potvrouwknop);
        mannen = 0;
        vrouwen = 0;
        potmannen = 0;
        potvrouwen = 0;

    }

    public void paint(Graphics g) {
        g.drawString("Aantal mannen:  " + mannen, 80, 100);
        g.drawString("Aantal vrouwen:  " + vrouwen, 80, 120);
        g.drawString("Aantal potentiële mannen:  " + potmannen, 80, 140);
        g.drawString("Aantal potentiële vrouwen  " + potvrouwen, 80, 160);
        g.drawString("Het totaal is: " + (mannen + vrouwen + potmannen + potvrouwen), 80, 200);
    }

    class ManListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mannen++;
            repaint();
        }
    }
    class VrouwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouwen++;
            repaint();
        }
    }
    class PotmanListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            potmannen++;
            repaint();
        }
    }
    class PotvrouwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            potvrouwen++;
            repaint();
        }
    }
}
