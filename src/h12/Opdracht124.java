package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht124 extends Applet implements ActionListener {

    TextField tekstvak;
    Button knop;
    boolean Gevonden;
    int index;

    @Override
    public void init() {
        tekstvak = new TextField(10);
        add(tekstvak);

        knop = new Button("OK");
        knop.addActionListener(this);
        add(knop);

        Gevonden = false;
    }

    @Override
    public void paint(Graphics g) {
        if (Gevonden) {
            g.drawString("De waarde is gevonden op index " + index, 50, 80);
        } else {
            g.drawString("De waarde is niet gevonden", 50,80);
        }
    }

    public void actionPerformed(ActionEvent e) {

    }
}
