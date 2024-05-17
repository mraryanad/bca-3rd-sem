import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.BoxLayout;

public class squareCalculator extends JFrame {
    private JTextField inputField, outputField;
    private JButton calculateButton;

    public squareCalculator() {
        setTitle("Square Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        

        JLabel inputLabel = new JLabel("Enter a number: ");
        inputLabel.setBounds(10,10,80,25);
        JTextField inputField = new JTextField(10);
        inputField.setBounds(100,10,160,25);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(100,50,80,25);

        JLabel outputLabel = new JLabel("Square: ");
        outputLabel.setBounds(10,100,80,25);

        JTextField outputField = new JTextField(10);
        outputField.setBounds(100,100,160,25);
        outputField.setEditable(false);

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num = Double.parseDouble(inputField.getText());
                double square = num * num;
                outputField.setText(Double.toString(square));
            }
        });

        add(inputLabel);
        add(inputField);
        add(calculateButton);
        add(outputLabel);
        add(outputField);
        
    }

    public static void main(String[] args) {
        squareCalculator calculator = new squareCalculator();
        calculator.setVisible(true);
    }
}