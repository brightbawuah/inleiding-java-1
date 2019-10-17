package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht105 extends Applet {
    TextField tekstvak;
    Button OKknop;
    Label label;
    String gemiddelde;
    String vo;
    String s;
    int aantal;
    double totaal;
    double uitslag;
    double cijfer;

    public void init() {
        tekstvak = new TextField(20);
        tekstvak.addActionListener(new OKknopListener());
        label = new Label("Typ je cijfer");
        add(label);
        add(tekstvak);
        OKknop = new Button("OK");
        OKknop.addActionListener(new OKknopListener());
        add(OKknop);
        gemiddelde = "";
        vo = "";
        s = "";
        cijfer = 0.0;

    }

    public void paint(Graphics g) {
        g.drawString("Dit is je uitslag " + uitslag, 20, 100);
        g.drawString("Je hebt een " + vo, 20, 115);
    }
    class OKknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            cijfer = Double.parseDouble(s);
            tekstvak.setText("");
            aantal++;
            totaal += cijfer;
            uitslag = totaal / aantal;
            if (uitslag < 5.5){
                vo = "onvoldoende";
            }
            else if (uitslag >= 5.5){
                vo = "voldoende";
            }
            repaint();
        }
    }
}
