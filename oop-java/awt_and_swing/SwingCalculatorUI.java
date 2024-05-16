import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SwingCalculatorUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Java Calculator");
        JPanel panel = new JPanel(new GridLayout(4, 4));
        JTextField textField = new JTextField(20);

        // Create an array 'String' to hold the button labels
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        // Iterate through every button in buttons, create a new button and add it to
        // the panel
        for (String button : buttons) {
            JButton btn = new JButton(button);
            btn.addActionListener(new ButtonListener(textField));
            panel.add(btn);
        }

        // Set the configuration for the panel
        frame.setLayout(new BorderLayout());
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the positioning of the elements
        frame.add(textField, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        // Make the frame visible
        frame.setVisible(true);
    }

    static class ButtonListener implements ActionListener {
        private JTextField inputField;
        private double firstNumber;
        private String operation;

        public ButtonListener(JTextField inputField) {
            this.inputField = inputField;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String buttonText = e.getActionCommand();

            if (Character.isDigit(buttonText.charAt(0))) {
                inputField.setText(inputField.getText() + buttonText);

            } else if (isOperation(buttonText)) {
                firstNumber = Double.parseDouble(inputField.getText());
                operation = buttonText;
                inputField.setText("");

            } else if (buttonText.equals("=")) {
                double secondNumber = Double.parseDouble(inputField.getText());
                double result = performOperation(firstNumber, secondNumber, operation);
                inputField.setText(Double.toString(result));

            } else if (buttonText.equals(".")) {
                if (!inputField.getText().contains(".")) {
                    inputField.setText(inputField.getText() + ".");
                }
            }
        }

        private boolean isOperation(String text) {
            return text.equals("+") || text.equals("-") || text.equals("*") ||
                    text.equals("/");
        }

        private double performOperation(double num1, double num2, String op) {
            switch (op) {
                case "+":
                    return num1 + num2;

                case "-":
                    return num1 - num2;

                case "*":
                    return num1 * num2;

                case "/":
                    return num1 / num2;

                default:
                    return 0;
            }
        }

    }
}
