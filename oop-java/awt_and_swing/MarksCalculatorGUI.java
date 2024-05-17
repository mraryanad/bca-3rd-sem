// /*
//  Input name, subject, marks and calculate and print percent and fail/pass from GUI
//  */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarksCalculatorGUI extends JFrame implements ActionListener {

    private JTextField nameField, mathMarksField, dsaMarksField, sadMarksField, oopMarksField, webMarksField;
    private JButton submitButton;
    private JLabel resultLabel;

    MarksCalculatorGUI() {
        setTitle("Result Calculator");

        // Create text fields for name, subject, and marks
        nameField = new JTextField(20);
        mathMarksField = new JTextField(20);
        dsaMarksField = new JTextField(20);
        sadMarksField = new JTextField(20);
        oopMarksField = new JTextField(20);
        webMarksField = new JTextField(20);

        // Create button and result label
        submitButton = new JButton("Calculate");
        submitButton.addActionListener(this);
        resultLabel = new JLabel("");

        // Create a panel for input fields
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2));
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Math:"));
        inputPanel.add(mathMarksField);
        inputPanel.add(new JLabel("DSA:"));
        inputPanel.add(dsaMarksField);
        inputPanel.add(new JLabel("SAD:"));
        inputPanel.add(sadMarksField);
        inputPanel.add(new JLabel("OOP:"));
        inputPanel.add(oopMarksField);
        inputPanel.add(new JLabel("WEBTECH:"));
        inputPanel.add(webMarksField);
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
        // Should not be allowed to enter more than 100 marks, Should display result in
        // a modal/dialogue, Should not be allowed to enter anything other than number
        if (e.getSource() == submitButton) {
            // Calculate percentage and pass/fail status
            String name = nameField.getText();
            // String subject = subjectField.getText();
            int mathMarks = Integer.parseInt(mathMarksField.getText());
            int dsaMarks = Integer.parseInt(dsaMarksField.getText());
            int sadMarks = Integer.parseInt(sadMarksField.getText());
            int oopMarks = Integer.parseInt(oopMarksField.getText());
            int webMarks = Integer.parseInt(webMarksField.getText());

            if (mathMarks < 40 || dsaMarks < 40 || sadMarks < 40 || oopMarks < 40 || webMarks < 40) {
                resultLabel.setForeground(Color.RED);
                resultLabel.setText(name + " failed!");
                return;
            } else {
                double obtainedMarks = (mathMarks + dsaMarks + sadMarks + oopMarks + webMarks);
                double percentage = (obtainedMarks / 500.0) * 100;

                String result = percentage >= 40 ? "Pass" : "Fail";

                // Display result
                if (result.equals("Pass")) {
                    resultLabel.setForeground(Color.GREEN);
                    resultLabel.setText(name + " passed!" + " ( " + percentage + "% - " + result + " )");
                } else {
                    resultLabel.setForeground(Color.RED);
                    resultLabel.setText(name + " failed!" + " ( " + percentage + "% - " + result + " )");
                }
            }

        }
    }
}
