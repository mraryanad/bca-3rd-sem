import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DynamicButtonGenerator extends JFrame implements ActionListener {
    private JTextField inputField;
    private JPanel buttonPanel;

    public DynamicButtonGenerator() {
        setTitle("Dynamic Button Generator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        inputField = new JTextField(5);
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Number of buttons: "));
        inputPanel.add(inputField);
        inputPanel.add(submitButton);

        buttonPanel = new JPanel();

        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Submit")) {
            try {
                int numButtons = Integer.parseInt(inputField.getText());
                createButtons(numButtons);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter a valid number.");
            }
        }
    }

    private void createButtons(int numButtons) {
        buttonPanel.removeAll();
        for (int i = 1; i <= numButtons; i++) {
            buttonPanel.add(new JButton("Button " + i));
        }
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        new DynamicButtonGenerator();
    }
}
