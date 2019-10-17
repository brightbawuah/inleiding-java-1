package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht83 extends Applet {
    Button OKknop;
    Label label;
    TextField tekstvak;
    double prijs;
    double btw;
    String s;


    @Override
    public void init() {
        OKknop = new Button("OK");
        OKknop.addActionListener(new BTWListener() );
        add(OKknop);
        tekstvak = new TextField("",20);
        tekstvak.addActionListener(new BTWListener() );
        add(tekstvak);
        label = new Label("Prijs inclusief BTW");
        btw = 1.21;

    }

    @Override
    public void paint(Graphics g) {
        g.drawString(" " + prijs*btw, 50, 60);
    }
    class BTWListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            prijs = Double.parseDouble(s);
            repaint();
        }
    }

}
