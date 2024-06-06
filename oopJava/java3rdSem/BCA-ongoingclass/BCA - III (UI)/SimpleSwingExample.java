import javax.swing.*;

public class SimpleSwingExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Simple Swing Example");

        // Create components
        JLabel label = new JLabel("Hello, Swing!");
        JTextField textField = new JTextField(10);
        JButton button = new JButton("Click Me!");
        JCheckBox checkBox = new JCheckBox("Check Me!");
        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"BCA I", "BCA II", "MCA I"});
        JTextArea textArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);

        // // Create a panel to hold components
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.add(checkBox);
        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(comboBox);
        panel.add(scrollPane);

        // // Add the panel to the frame
        frame.add(panel);

        // // Set frame size
        frame.setSize(400, 300);

        // // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // // Make the frame visible
        frame.setVisible(true);
    }
}
