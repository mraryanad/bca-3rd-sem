// import javax.swing.event.*;
// import javax.swing.*;

// class SwingListDemo extends JFrame implements ListSelectionListener {
//     JFrame f;
//     JList b, b1, b2;
//     JLabel l1;

//     public SwingListDemo() {
//         f = new JFrame("frame");
//         solve s = new solve();
//         JPanel p = new JPanel();
//         JLabel l = new JLabel("select your birthday");
//         l1 = new JLabel();
//         String month[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
//         String date[] = new String[31], year[] = new String[31];
//         for (int i = 0; i < 31; i++) {
//             date[i] = "" + (int) (i + 1);
//             year[i] = "" + (int) (2018 - i);
//         }
//         b = new JList(date);
//         b1 = new JList(month);
//         b2 = new JList(year);
//         b.setSelectedIndex(2);
//         b1.setSelectedIndex(1);
//         b2.setSelectedIndex(2);
//         l1.setText(b.getSelectedValue() + "" + b1.getSelectedValue() + "" + b2.getSelectedValue());
//         b.addListSelectionListener(this);
//         b1.addListSelectionListener(this);
//         b2.addListSelectionListener(this);
//         p.add(l);
//         p.add(b);
//         p.add(b1);
//         p.add(b2);
//         p.add(l1);
//         f.add(p);
//         f.setSize(500, 600);
//         f.setVisible(true);
//     }

//     public static void main(String[] args) {

//         new SwingListDemo();
//     }

//     public void valueChanged(ListSelectionEvent e) {
//         l1.setText(b.getSelectedValue() + "" + b1.getSelectedValue() + "" + b2.getSelectedValue());
//     }
// }

import javax.swing.event.*;
import javax.swing.*;

public class SwingListDemo extends JFrame implements ListSelectionListener {
    JFrame f;
    JList<String> b, b1, b2;
    JLabel l1;

    public SwingListDemo() {
        f = new JFrame("Frame");
        JPanel p = new JPanel();
        JLabel l = new JLabel("Select your birthday");
        l1 = new JLabel();
        String month[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        String date[] = new String[31];
        String year[] = new String[31];
        for (int i = 0; i < 31; i++) {
            date[i] = "" + (int) (i + 1);
            year[i] = "" + (int) (2018 - i);
        }
        b = new JList<>(date);
        b1 = new JList<>(month);
        b2 = new JList<>(year);
        b.setSelectedIndex(2);
        b1.setSelectedIndex(1);
        b2.setSelectedIndex(2);
        l1.setText(b.getSelectedValue() + "" + b1.getSelectedValue() + "" + b2.getSelectedValue());
        b.addListSelectionListener(this);
        b1.addListSelectionListener(this);
        b2.addListSelectionListener(this);
        p.add(l);
        p.add(b);
        p.add(b1);
        p.add(b2);
        p.add(l1);
        f.add(p);
        f.setSize(500, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Added this line to close the window properly
        f.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SwingListDemo());
    }

    public void valueChanged(ListSelectionEvent e) {
        l1.setText(b.getSelectedValue() + "" + b1.getSelectedValue() + "" + b2.getSelectedValue());
    }
}

// Changes made:

// Added <String> to JList declarations to specify the type of elements.
// Used SwingUtilities.invokeLater() to ensure Swing components are created and
// updated on the Event Dispatch Thread (EDT).
// Added setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) to properly close the
// window when clicking the close button.
// Simplified the code structure for better readability.