import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame implements ActionListener {
    private JTextField numField1, numField2;
    private JComboBox<String> operationComboBox;
    private JButton calculateButton;
    private JLabel resultLabel;

    public SimpleCalculator() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        numField1 = new JTextField();
        numField2 = new JTextField();
        operationComboBox = new JComboBox<>(new String[] { "+", "-", "*", "/" });
        calculateButton = new JButton("Calculate");
        resultLabel = new JLabel("Result: ");

        add(new JLabel("Number 1: "));
        add(numField1);
        add(new JLabel("Number 2: "));
        add(numField2);
        add(new JLabel("Operation: "));
        add(operationComboBox);
        add(calculateButton);
        add(resultLabel);

        calculateButton.addActionListener(this);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            try {
                double num1 = Double.parseDouble(numField1.getText());
                double num2 = Double.parseDouble(numField2.getText());
                String operation = (String) operationComboBox.getSelectedItem();

                double result = 0.0; // Initialize result to a default value

                switch (operation) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 == 0) {
                            resultLabel.setText("Result: Error (Divided By Zero)");
                            return;
                        } else {
                            result = num1 / num2;
                        }
                        break;
                    default:
                        resultLabel.setText("Result: Invalid operation");
                        return; // Return here to avoid setting resultLabel again
                }

                resultLabel.setText("Result: " + result);

            } catch (NumberFormatException ex) {
                resultLabel.setText("Result: " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
        // SwingUtilities.invokeLater(SimpleCalculator::new);
        // SwingUtilities.invokeLater(() -> new SimpleCalculator());

    }
}
