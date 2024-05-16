import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SwingMouseListener extends JFrame implements MouseListener {
    JLabel label1, label2, label3;

    public SwingMouseListener() {
        setTitle("Mouse Listener");
        setSize(600, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        label1 = new JLabel("no events");
        label2 = new JLabel("no events");
        label3 = new JLabel("no events");
        p.add(label1);
        p.add(label2);
        p.add(label3);
        addMouseListener(this);
        add(p);
        setVisible(true);
    }

    public void mousePressed(MouseEvent e) {
        label1.setText("mouse pressed at point " + e.getX() + ", " + e.getY());
    }

    public void mouseReleased(MouseEvent e) {
        label1.setText("mouse released at point " + e.getX() + ", " + e.getY());
    }

    public void mouseExited(MouseEvent e) {
        label2.setText("mouse exited through point " + e.getX() + ", " + e.getY());
    }

    public void mouseEntered(MouseEvent e) {
        label2.setText("mouse entered at point " + e.getX() + ", " + e.getY());
    }

    public void mouseClicked(MouseEvent e) {
        label3.setText(
                "mouse clicked at point " + e.getX() + ", " + e.getY() + ", mouse clicked: "
                        + e.getClickCount());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingMouseListener::new);
    }
}
