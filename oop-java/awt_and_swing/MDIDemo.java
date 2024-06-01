import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

public class MDIDemo extends JFrame {
    public MDIDemo() { // Multiple Documnet Interface(MDI) Applications:
        setTitle("MDI Demo");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JDesktopPane
        JDesktopPane desktop = new JDesktopPane();
        add(desktop);

        // Create a JInternalFrame
        JInternalFrame frame1 = new JInternalFrame("Frame 1", true, true, true, true);
        frame1.setSize(new Dimension(200, 200));
        frame1.setLocation(10, 10);
        frame1.setVisible(true);

        // Create second JInternalFrame
        JInternalFrame frame2 = new JInternalFrame("Frame 2", true, true, true, true);
        frame2.setSize(new Dimension(400, 400));
        frame2.setLocation(40, 40);
        frame2.setVisible(true);

        // Create third JInternalFrame
        JInternalFrame frame3 = new JInternalFrame("Frame 2", true, true, true, true);
        frame3.setSize(new Dimension(200, 200));
        frame3.setLocation(80, 80);
        frame3.setVisible(true);

        // Add JLabel to JInternLFrame
        JLabel label = new JLabel("Hello, world!");
        frame1.add(label);

        // Add the JInternalFrame to the JDesktopPane
        desktop.add(frame1);
        desktop.add(frame2);
        desktop.add(frame3);
    }

    public static void main(String[] args) {
        MDIDemo demo = new MDIDemo();
        demo.setVisible(true);
    }
}