package H12;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht124 extends Applet {
    boolean gevonden;
    double[] salaris = { 100.0, 200.0, 500.0, 400.0, 300.0 };
    double gezocht;
    Button ok;
    TextField tekstvak;
    Label label;

    public void init() {
        tekstvak = new TextField("", 10);

        label = new Label("Type een Cijfer");

        ok = new Button("ok");
        ok.addActionListener(new OkListener());

        add(label);
        add(tekstvak);
        add(ok);


        gezocht = 400;
        gevonden = false;
        int teller = 0;
        while(teller < salaris.length && gevonden == false) {
            if(salaris[teller] == gezocht) {
                gevonden = true;
            }
            teller ++;
        }
    }
    public void paint(Graphics g) {
        if(gevonden == true) {
            g.drawString("De waarde is gevonden: "+ gevonden , 20, 50);
        }
        else {
            g.drawString("De waarde is niet gevonden.", 20, 50);
        }
    }
    class OkListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {

            repaint();
        }

    }
}