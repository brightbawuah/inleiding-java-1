package h08;


import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht81 extends Applet {
TextField tekstvak;
Button okéKnop;
Button resetKnop;
String message;
    @Override
    public void init() {
        setSize(400,400);
        tekstvak = new TextField(20);
        add(tekstvak);

        okéKnop = new Button("oké");
        okéKnop.addActionListener(new OkKnopListener());
        add(okéKnop);

        resetKnop = new Button("reset");
        resetKnop.addActionListener(new ResetKnopListener());
        add(resetKnop);

        message = "";

    }

    @Override
    public void paint(Graphics g) {
       g.drawString(message, 20 ,150);
    }
    class OkKnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            message = tekstvak.getText();
            repaint();
        }
    }
    class ResetKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            tekstvak.setText("");
        }

    }

}

