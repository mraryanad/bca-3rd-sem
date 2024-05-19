import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DynamicButton {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DynamicButtonUI());
    }
}

class DynamicButtonUI {
    final private JFrame frame;
    final private JTextField textField;
    final private JPanel buttonPanel;

    DynamicButtonUI() {
        // Create the frame
        frame = new JFrame("Dynamic Buttons");
        frame.setLayout(new BorderLayout());

        // Create panel for label and text field
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());

        // Create and configure the label
        JLabel label = new JLabel("Enter number of buttons to create: ");
        inputPanel.add(label, BorderLayout.NORTH);

        // Create and configure the text field
        textField = new JTextField();
        inputPanel.add(textField, BorderLayout.CENTER);

        // Add input panel to the frame
        frame.add(inputPanel, BorderLayout.NORTH);

        // Create and configure the button panel
        buttonPanel = new JPanel(new GridLayout(0, 3));
        frame.add(buttonPanel, BorderLayout.CENTER);

        // Create and configure the submit button
        JButton submitButton = new JButton("Create Buttons");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createButtons();
            }
        });
        frame.add(submitButton, BorderLayout.SOUTH);

        // Configure the frame
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void createButtons() {
        // Clear existing buttons
        buttonPanel.removeAll();

        // Get the number of buttons from the text field
        int noOfButtons = 0;
        try {
            noOfButtons = Integer.parseInt(textField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter a valid number.");
            return;
        }

        // Create new buttons
        for (int i = 1; i <= noOfButtons; i++) {
            JButton button = new JButton("Button " + i);
            buttonPanel.add(button);
        }

        // Refresh the panel
        buttonPanel.revalidate(); // calculate the changes to ui
        buttonPanel.repaint(); // update ui
    }
}
