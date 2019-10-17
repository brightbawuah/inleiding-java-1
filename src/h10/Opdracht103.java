package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht103 extends Applet {
    TextField tekstvakmaand;
    Label labelmaand;
    String s, tekstmaand;
    String tekstdagen;
    int maand;

    public void init() {
        tekstvakmaand = new TextField("", 20);
        labelmaand = new Label("Type het maandnummer en druk op enter");
        tekstvakmaand.addActionListener(new MaandListener());
        tekstmaand = "";
        tekstdagen = "";
        add(labelmaand);
        add(tekstvakmaand);
    }

    public void paint(Graphics g) {
        g.drawString(tekstmaand, 50, 75);
        g.drawString(tekstdagen, 50, 90);
    }

    class MaandListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvakmaand.getText();
            maand = Integer.parseInt(s);
            switch (maand) {
                case 1:
                    tekstmaand = "Januari";
                    tekstdagen = "31 dagen";

                    break;
                case 2:
                    tekstmaand = "Februari";
                    tekstdagen = "28 dagen";
                    break;
                case 3:
                    tekstmaand = "Maart";
                    tekstdagen = "31 dagen";
                    break;
                case 4:
                    tekstmaand = "April";
                    tekstdagen = "30 dagen";
                    break;
                case 5:
                    tekstmaand = "Mei";
                    tekstdagen = "31 dagen";
                    break;
                case 6:
                    tekstmaand = "Juni";
                    tekstdagen = "30 dagen";
                    break;
                case 7:
                    tekstmaand = "Juli";
                    tekstdagen = "31 dagen";
                    break;
                case 8:
                    tekstmaand = "Augustus";
                    tekstdagen = "31 dagen";
                    break;
                case 9:
                    tekstmaand = "September";
                    tekstdagen = "30 dagen";
                    break;
                case 10:
                    tekstmaand = "Oktober";
                    tekstdagen = "31 dagen";
                    break;
                case 11:
                    tekstmaand = "November";
                    tekstdagen = "30 dagen";
                    break;
                case 12:
                    tekstmaand = "December";
                    tekstdagen = "31 Dagen";
                    break;
                default:
                    tekstmaand = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }
}
