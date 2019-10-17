package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht101en2 extends Applet {
    TextField tekstvak;
    Label label;
    double userinput;
    double maximum;
    double minimum;
    String s;
    boolean firstinput;

    public void init() {

        label = new Label("typ een getal");
        add(label);
        tekstvak = new TextField("",20);
        tekstvak.addActionListener(new GetalListener() );
        add(tekstvak);
        s = "";
        maximum = 0;
        minimum = 0;
        firstinput = true;
    }

    public void paint(Graphics g) {
        g.drawString("Het maximum getal is: " + maximum, 50, 50);
        g.drawString("Het minimum getal is: " + minimum, 50, 70);
    }
    class GetalListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            userinput = Double.parseDouble(s);
            if (firstinput) {
                firstinput = false;
                maximum = userinput;
                minimum = userinput;
            }
            else if (userinput > maximum) {
                maximum = userinput;
            }
            else if (userinput < minimum) {
                minimum = userinput;
            }
            repaint();
        }
    }
}
