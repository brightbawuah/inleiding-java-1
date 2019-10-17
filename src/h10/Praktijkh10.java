package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkh10 extends Applet {
    double input;
    String uitslag;
    TextField tekstvak;
    Label label;

    @Override
    public void init() {
        tekstvak = new TextField("",20);
        tekstvak.addActionListener(new TeksvakListener());
        label = new Label("Typ je cijfer in");
        add(label);
        add(tekstvak);
        uitslag = "";
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(""+ uitslag, 20, 80);
    }
    class TeksvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            uitslag = tekstvak.getText();
            input = Double.parseDouble(uitslag);
                    if (input < 4) {
                        uitslag = " slecht";
                    }
                    else if (input < 5) {
                        uitslag = "onvoldoende";
                    }
                    else if (input < 6) {
                        uitslag = "matig";
                    }
                    else if (input < 8) {
                        uitslag = "voldoende";
                    }
                    else if (input < 1) {
                            uitslag = "U heeft een verkeerd cijfer ingevoerd.";
                    }
                    else if (input <= 10) {
                        uitslag = "goed";
                    }

                    else if (input > 10) {
                        uitslag = "U heeft een verkeerd cijfer ingevoerd.";
                    }

            repaint();
        }
    }
}
