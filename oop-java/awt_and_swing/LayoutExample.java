import javax.swing.*;
import java.awt.*;

public class LayoutExample extends JFrame {
    public LayoutExample() {
        setTitle("Layouts in Java");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // BorderLayout
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.setBorder(BorderFactory.createTitledBorder("Border Layout"));
        borderPanel.add(new JButton("North"), BorderLayout.NORTH);
        borderPanel.add(new JButton("South"), BorderLayout.SOUTH);
        borderPanel.add(new JButton("East"), BorderLayout.EAST);
        borderPanel.add(new JButton("West"), BorderLayout.WEST);
        borderPanel.add(new JButton("Center"), BorderLayout.CENTER);

        // FlowLayout
        JPanel flowPanel = new JPanel(new FlowLayout());
        flowPanel.setBorder(BorderFactory.createTitledBorder("Flow Layout"));
        flowPanel.add(new JButton("Button 1"));
        flowPanel.add(new JButton("Button 2"));
        flowPanel.add(new JButton("Button 3"));

        // GridLayout
        JPanel gridPanel = new JPanel(new GridLayout(3, 3));
        gridPanel.setBorder(BorderFactory.createTitledBorder("Grid Layout"));
        for (int i = 1; i <= 9; i++) {
            gridPanel.add(new JButton("Button " + i));
        }

        // BoxLayout
        JPanel boxPanel = new JPanel();
        boxPanel.setBorder(BorderFactory.createTitledBorder("Box Layout"));
        boxPanel.setLayout(new BoxLayout(boxPanel, BoxLayout.Y_AXIS));
        boxPanel.add(new JButton("Button 1"));
        boxPanel.add(new JButton("Button 2"));
        boxPanel.add(new JButton("Button 3"));

        // Add panels to the frame
        setLayout(new GridLayout(2, 2));
        add(borderPanel);
        add(flowPanel);
        add(gridPanel);
        add(boxPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LayoutExample();
    }
}