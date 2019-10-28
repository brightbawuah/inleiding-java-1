package H12;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

public class Opdracht125 extends Applet {

    double[] getal = {0, 1, 2, 3, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6, 6, 7, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10};
    boolean gevonden;
    int index = -1;
    String tekst = "Type iets";
    TextField tekstvak = new TextField("", 20);

    public void init() {
        setSize(500, 500);
        setBackground(Color.magenta);
        gevonden = false;
        tekstvak.addActionListener(new OkListener());
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("" + tekst, 20, 50);
    }

    class OkListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            int tempgetal = Integer.parseInt(tekstvak.getText());
            for(int i = 0; i < getal.length && gevonden == false; i++) {
                index++;
                if(tempgetal == getal[i]) {
                    gevonden = true;
                }
            }
            if(gevonden == true) {
                tekst = "Waarde " + tempgetal + " is gevonden " + index;
            }
            else {
                tekst = "Waarde is niet gevonden";
            }
            repaint();
            gevonden = false ;
            index = -1;

        }
    }
}