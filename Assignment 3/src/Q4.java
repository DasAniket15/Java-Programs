// Q4

import java.awt.*;
import java.applet.*;

public class Q4 extends Applet {
    public void paint(Graphics g) {
        int ovalX = 50;
        int ovalY = 50;
        int ovalWidth = 100;
        int ovalHeight = 200;

        g.setColor(Color.BLACK);
        g.drawOval(ovalX, ovalY, ovalWidth, ovalHeight);

        int halfWidth = ovalWidth / 2;
        int halfHeight = ovalHeight / 2;

        g.setColor(Color.RED);
        g.fillArc(ovalX, ovalY, halfWidth, halfHeight, 0, 90);

        g.setColor(Color.GREEN);
        g.fillArc(ovalX + halfWidth, ovalY, halfWidth, halfHeight, 90, 90);

        g.setColor(Color.BLUE);
        g.fillArc(ovalX, ovalY + halfHeight, halfWidth, halfHeight, 270, 90);

        g.setColor(Color.YELLOW);
        g.fillArc(ovalX + halfWidth, ovalY + halfHeight, halfWidth, halfHeight, 180, 90);
    }
}
