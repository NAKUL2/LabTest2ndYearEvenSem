import java.applet.*;
import java.awt.Color;
import java.awt.Canvas;
import java.awt.Graphics;

public class SmileFace extends Applet {

    public SmileFace() {

        setBackground(Color.LIGHT_GRAY);
    }

    public void paint(Graphics w) {

        w.setColor(Color.YELLOW);
        w.fillOval(250, 150, 350, 320);

        w.setColor(Color.blue);
        w.fillOval(300, 220, 90, 100);
        w.fillOval(450, 220, 90, 100);

        w.setColor(Color.BLACK);
        w.drawArc(345, 340, 150, 80, 0, -180);
        w.drawLine(420, 260, 420, 360);

        w.setColor(Color.GREEN);

    }
}