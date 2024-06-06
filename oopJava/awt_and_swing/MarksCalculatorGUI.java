// // /*
// //  Input name, subject, marks and calculate and print percent and fail/pass from GUI
// //  */

// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import javax.swing.*;

// public class MarksCalculatorGUI extends JFrame implements ActionListener {

//     private JTextField nameField, mathMarksField, dsaMarksField, sadMarksField, oopMarksField, webMarksField;
//     private JButton submitButton;
//     private JLabel resultLabel;

//     MarksCalculatorGUI() {
//         setTitle("Result Calculator");

//         // Create text fields for name, subject, and marks
//         nameField = new JTextField(20);
//         mathMarksField = new JTextField(20);
//         dsaMarksField = new JTextField(20);
//         sadMarksField = new JTextField(20);
//         oopMarksField = new JTextField(20);
//         webMarksField = new JTextField(20);

//         // Create button and result label
//         submitButton = new JButton("Calculate");
//         submitButton.addActionListener(this);
//         resultLabel = new JLabel("");

//         // Create a panel for input fields
//         JPanel inputPanel = new JPanel();
//         inputPanel.setLayout(new GridLayout(4, 2));
//         inputPanel.add(new JLabel("Name:"));
//         inputPanel.add(nameField);
//         inputPanel.add(new JLabel("Math:"));
//         inputPanel.add(mathMarksField);
//         inputPanel.add(new JLabel("DSA:"));
//         inputPanel.add(dsaMarksField);
//         inputPanel.add(new JLabel("SAD:"));
//         inputPanel.add(sadMarksField);
//         inputPanel.add(new JLabel("OOP:"));
//         inputPanel.add(oopMarksField);
//         inputPanel.add(new JLabel("WEBTECH:"));
//         inputPanel.add(webMarksField);
//         inputPanel.add(new JLabel(""));
//         inputPanel.add(submitButton);

//         // Create a panel for the result
//         JPanel resultPanel = new JPanel();
//         resultPanel.add(resultLabel);

//         // Add panels to the frame
//         setLayout(new BorderLayout());
//         add(inputPanel, BorderLayout.CENTER);
//         add(resultPanel, BorderLayout.SOUTH);
//         pack();
//         setLocationRelativeTo(null);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setVisible(true);
//     }

//     public static void main(String[] args) {
//         new MarksCalculatorGUI();
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         // Should not be allowed to enter more than 100 marks, Should display result in
//         // a modal/dialogue, Should not be allowed to enter anything other than number
//         if (e.getSource() == submitButton) {
//             // Calculate percentage and pass/fail status
//             String name = nameField.getText();
//             // String subject = subjectField.getText();
//             int mathMarks = Integer.parseInt(mathMarksField.getText());
//             int dsaMarks = Integer.parseInt(dsaMarksField.getText());
//             int sadMarks = Integer.parseInt(sadMarksField.getText());
//             int oopMarks = Integer.parseInt(oopMarksField.getText());
//             int webMarks = Integer.parseInt(webMarksField.getText());

//             if (mathMarks < 40 || dsaMarks < 40 || sadMarks < 40 || oopMarks < 40 || webMarks < 40) {
//                 resultLabel.setForeground(Color.RED);
//                 resultLabel.setText(name + " failed!");
//                 return;
//             } else {
//                 double obtainedMarks = (mathMarks + dsaMarks + sadMarks + oopMarks + webMarks);
//                 double percentage = (obtainedMarks / 500.0) * 100;

//                 String result = percentage >= 40 ? "Pass" : "Fail";

//                 // Display result
//                 if (result.equals("Pass")) {
//                     resultLabel.setForeground(Color.GREEN);
//                     resultLabel.setText(name + " passed!" + " ( " + percentage + "% - " + result + " )");
//                 } else {
//                     resultLabel.setForeground(Color.RED);
//                     resultLabel.setText(name + " failed!" + " ( " + percentage + "% - " + result + " )");
//                 }
//             }

//         }
//     }
// }

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class MarksCalculatorGUI extends JFrame implements ActionListener {
    private static MarksCalculatorGUI instance;
    final private JTextField nameField, mathMarksField, dsaMarksField, sadMarksField, oopMarksField, webMarksField;
    final private JButton submitButton;
    final private JLabel resultLabel;

    MarksCalculatorGUI() {
        instance = this;
        setTitle("Result Calculator");

        // Create text fields for name, subject, and marks
        nameField = new JTextField(20);
        mathMarksField = createFloatField();
        dsaMarksField = createFloatField();
        sadMarksField = createFloatField();
        oopMarksField = createFloatField();
        webMarksField = createFloatField();

        // Create button and result label
        submitButton = new JButton("Calculate");
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
        inputPanel.add(new JLabel("WEB TECH:"));
        inputPanel.add(webMarksField);
        inputPanel.add(new JLabel(""));
        inputPanel.add(submitButton);

        submitButton.addActionListener(MarksCalculatorGUI.instance);

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

    private JTextField createFloatField() {
        JTextField textField = new JTextField(20);
        ((AbstractDocument) textField.getDocument()).setDocumentFilter(new FloatFilter());
        return textField;
    }

    private class FloatFilter extends DocumentFilter {
        @Override
        public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr)
                throws BadLocationException {
            if (isValidFloat(string)) {
                super.insertString(fb, offset, string, attr);
            }
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                throws BadLocationException {
            if (isValidFloat(text)) {
                super.replace(fb, offset, length, text, attrs);
            }
        }

        @Override
        public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
            super.remove(fb, offset, length);
        }

        private boolean isValidFloat(String text) {
            if (text.isEmpty()) {
                return true;
            }
            try {
                float value = Float.parseFloat(text);
                return value >= 0 && value <= 100;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        MarksCalculatorGUI mcGUI = new MarksCalculatorGUI();
        mcGUI.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            try {
                String name = nameField.getText();
                float mathMarks = Float.parseFloat(mathMarksField.getText());
                float dsaMarks = Float.parseFloat(dsaMarksField.getText());
                float sadMarks = Float.parseFloat(sadMarksField.getText());
                float oopMarks = Float.parseFloat(oopMarksField.getText());
                float webMarks = Float.parseFloat(webMarksField.getText());

                if (mathMarks < 0 || mathMarks > 100 ||
                        dsaMarks < 0 || dsaMarks > 100 ||
                        sadMarks < 0 || sadMarks > 100 ||
                        oopMarks < 0 || oopMarks > 100 ||
                        webMarks < 0 || webMarks > 100) {
                    JOptionPane.showMessageDialog(this, "Marks should be between 0 and 100.", "Input Error",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (mathMarks < 40 || dsaMarks < 40 || sadMarks < 40 || oopMarks < 40 || webMarks < 40) {
                    resultLabel.setForeground(Color.RED);
                    resultLabel.setText(name + " failed!");
                } else {
                    double obtainedMarks = (mathMarks + dsaMarks + sadMarks + oopMarks + webMarks);
                    double percentage = (obtainedMarks / 500.0) * 100;

                    String result = percentage >= 40 ? "Pass" : "Fail";

                    if (result.equals("Pass")) {
                        resultLabel.setForeground(Color.GREEN);
                        resultLabel.setText(name + " passed! ( " + percentage + "% - " + result + " )");
                    } else {
                        resultLabel.setForeground(Color.RED);
                        resultLabel.setText(name + " failed! ( " + percentage + "% - " + result + " )");
                    }
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid float values for marks.", "Input Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
