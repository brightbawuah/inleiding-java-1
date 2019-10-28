package H12;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Opdracht123 extends Applet {
    TextField[] tekstvak = new TextField[5];
    Button knop = new Button("ok");

    public void init() {
        for (int i = 0; i < tekstvak.length; i++) {
            tekstvak[i] = new TextField("", 20);
            add(tekstvak[i]);
        }
        knop.addActionListener(new KnopListener());
        add(knop);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int[] getallen = new int[tekstvak.length];
            for (int i = 0; i < tekstvak.length; i++) {
                getallen[i] = Integer.parseInt(tekstvak[i].getText());
            }
            Arrays.sort(getallen);
            for (int i = 0; i < tekstvak.length; i++) {
                tekstvak[i].setText(""+getallen[i]);
            }

        }
    }

    public void paint(Graphics g) {

    }

}