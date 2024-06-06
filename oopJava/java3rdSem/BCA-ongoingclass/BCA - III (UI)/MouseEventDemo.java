import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventDemo extends JFrame implements MouseListener {

    private JLabel label;

    public MouseEventDemo() {
        setTitle("Mouse Event Demo");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Click the mouse");
        add(label);

        addMouseListener(this);
    }

    public static void main(String[] args) {
        MouseEventDemo frame = new MouseEventDemo();
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exit at (" + e.getX() + ", " + e.getY() + ")");
    }
}
