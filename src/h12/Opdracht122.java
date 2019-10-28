package H12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht122 extends Applet {
    Button[] knop = new Button[25];


    public void init() {

        for (int i = 0; i < knop.length; i++) {
            knop[i] = new Button("knop " + (i + 1));
            add(knop[i]);
        }
    }
}
