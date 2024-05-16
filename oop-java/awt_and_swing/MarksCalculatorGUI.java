// /*
//  Input name, subject, marks and calculate and print percent and fail/pass from GUI
//  */

// import javax.swing.*;
// import java.awt.*;

// public class MarksCalculatorGUI extends JFrame {

//     private JTextField textField;
//     private JButton submitButton;

//     MarksCalculatorGUI() {
//         setTitle("Result Calculator");
//         textField = new JTextField("");
//         submitButton = new JButton("Enter");

//         // Add Panels to the Frame and make them visible
//         add(textField);
//         add(submitButton);
//         pack();
//         setLocationRelativeTo(null);
//         setVisible(true);
//     }

//     public static void main(String[] args) {
//         new MarksCalculatorGUI();
//     }
// }

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarksCalculatorGUI extends JFrame implements ActionListener {

    private JTextField nameField, subjectField, marksField;
    private JButton submitButton;
    private JLabel resultLabel;

    MarksCalculatorGUI() {
        setTitle("Result Calculator");

        // Create text fields for name, subject, and marks
        nameField = new JTextField(20);
        subjectField = new JTextField(20);
        marksField = new JTextField(20);

        // Create button and result label
        submitButton = new JButton("Calculate");
        submitButton.addActionListener(this);
        resultLabel = new JLabel("");

        // Create a panel for input fields
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2));
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Subject:"));
        inputPanel.add(subjectField);
        inputPanel.add(new JLabel("Marks:"));
        inputPanel.add(marksField);
        inputPanel.add(new JLabel(""));
        inputPanel.add(submitButton);

        // Create a panel for the result
        JPanel resultPanel = new JPanel();
        resultPanel.add(resultLabel);

        // Add panels to the frame
        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.CENTER);
        add(resultPanel, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MarksCalculatorGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            // Calculate percentage and pass/fail status
            String name = nameField.getText();
            String subject = subjectField.getText();
            int marks = Integer.parseInt(marksField.getText());

            double percentage = (marks / 100.0) * 100; // Assuming total marks is 100
            String result = percentage >= 40 ? "Pass" : "Fail";

            // Display result
            resultLabel.setText(name + " in " + subject + ": " + percentage + "% - " + result);
        }
    }
}
