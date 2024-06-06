import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutDemo {

    public static void main(String[] args) {
        // Create a JFrame and set its layout to BorderLayout
        JFrame frame = new JFrame("Layout Demo");
        frame.setLayout(new BorderLayout());

        // Create a JPanel and set its layout to FlowLayout
        JPanel flowPanel = new JPanel();
        flowPanel.setLayout(new FlowLayout());

        // Add some buttons to the flow panel
        flowPanel.add(new JButton("Button 1")  );
        flowPanel.add(new JButton("Button 2"));
        flowPanel.add(new JButton("Button 3"));

        // Create a JPanel and set its layout to GridLayout
        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(3, 2));

        // Add some buttons to the grid panel
        gridPanel.add(new JButton("Button 4"));
        gridPanel.add(new JButton("Button 5"));
        gridPanel.add(new JButton("Button 6"));
        gridPanel.add(new JButton("Button 7"));
        gridPanel.add(new JButton("Button 8"));
        gridPanel.add(new JButton("Button 9"));

        // Add the flow panel and grid panel to the frame
        frame.add(flowPanel, BorderLayout.NORTH);
        frame.add(gridPanel, BorderLayout.CENTER);

        // Set the size and location of the frame, and make it visible
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
