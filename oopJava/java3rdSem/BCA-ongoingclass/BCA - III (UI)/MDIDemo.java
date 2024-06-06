import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

public class MDIDemo extends JFrame {

    public MDIDemo() {
        setTitle("MDI Demo");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JDesktopPane
        JDesktopPane desktop = new JDesktopPane();
        add(desktop);

        // Create a JInternalFrame
        JInternalFrame frame = new JInternalFrame("Frame 1", true, true, true, true);
        frame.setSize(new Dimension(200, 100));
        frame.setLocation(10, 10);
        frame.setVisible(true);

        // Create a JInternalFrame
        JInternalFrame frame2 = new JInternalFrame("Frame 2", true, true, true, true);
        frame2.setSize(new Dimension(200, 100));
        frame2.setLocation(40, 40);
        frame2.setVisible(true);

        // Add a JLabel to the JInternalFrame
        JLabel label = new JLabel("Hello, World!");
        frame.add(label);

        // Add the JInternalFrame to the JDesktopPane
        desktop.add(frame);
        desktop.add(frame2);
    }

    public static void main(String[] args) {
        MDIDemo frame = new MDIDemo();
        frame.setVisible(true);
    }
}
