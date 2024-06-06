import java.applet.*;
import java.awt.*;

public class AppletJava extends Applet {
    int x = 0;
    int y = 0;

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, 50, 50);
    }

    public void start() {
        while (true) {
            x += 1;
            y += 1;
            repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
