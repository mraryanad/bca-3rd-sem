import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyEventDemo extends JFrame implements KeyListener {

    final private JLabel label;

    public KeyEventDemo() {
        setTitle("Key Event Demo");
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Press any Key");
        add(label);

        addKeyListener(this);
        setLocationRelativeTo(null);
        // pack();
    }

    public static void main(String[] args) {
        KeyEventDemo demo = new KeyEventDemo();
        demo.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        label.setText("Key Typed: " + e.getKeyCode());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed: " + e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        label.setText("Key Released: " + e.getKeyCode());
    }
}