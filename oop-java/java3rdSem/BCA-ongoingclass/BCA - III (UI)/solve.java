
// java Program to create a simple JList
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class solve extends JFrame {

    static JFrame f;

    static JList b;

    // main class
    public static void main(String[] args) {
        // create a new frame
        f = new JFrame("frame");
        // create a object
        solve s = new solve();
        // create a panel
        JPanel p = new JPanel();
        // create a new label
        JLabel l = new JLabel("select the day of the week");
        // String array to store weekdays
        String week[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        // create list
        b = new JList(week);
        // set a selected index
        b.setSelectedIndex(2);
        // add list to panel
        p.add(b);

        f.add(p);
        // set the size of frame
        f.setSize(400, 400);

        f.setVisible(true);
    }
}