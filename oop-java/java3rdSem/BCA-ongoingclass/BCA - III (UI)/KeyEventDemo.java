import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyEventDemo extends JFrame implements KeyListener {

    private JLabel label;

    public KeyEventDemo() {
        setTitle("Key Event Demo");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Press any key");
        add(label);

        addKeyListener(this);
    }

    public static void main(String[] args) {
        KeyEventDemo frame = new KeyEventDemo();
        frame.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        label.setText("Key typed: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        label.setText("Key pressed: " + e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        label.setText("Key released: " + e.getKeyCode());
    }
}
