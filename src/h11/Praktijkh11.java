package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkh11 extends Applet {
    Button OKknop;
    Label label;
    TextField tekstvak;
    String s;
    int cijfers;

    @Override
    public void init() {
        OKknop = new Button("OK");
        label = new Label("Typ een getal: ");
        tekstvak = new TextField("",20);
        add(label);
        add(tekstvak);
        add(OKknop);

        OKknop.addActionListener(new OKknopListener());
        tekstvak.addActionListener(new OKknopListener());

        s = "";
        cijfers = 0;
    }

    @Override
    public void paint(Graphics g) {
        int teller;
        int x = 60;
        int y = 70;

        for (teller = 1; teller <=10; teller++) {

            g.drawString(teller + "x" + cijfers + "=" + teller * cijfers, x, y);
            y += 20;
        }
    }
    class OKknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            s = tekstvak.getText();
            cijfers = Integer.parseInt(s);
            tekstvak.setText("");
            repaint();
        }
    }
}
