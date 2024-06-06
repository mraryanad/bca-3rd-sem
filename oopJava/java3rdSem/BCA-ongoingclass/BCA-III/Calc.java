import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calc {
  // Create a panel for the buttons
  private JPanel buttonPanel = new JPanel();

  // Create the buttons
  private JButton addButton = new JButton("+");
  private JButton subtractButton = new JButton("-");
  private JButton multiplyButton = new JButton("*");
  private JButton divideButton = new JButton("/");
  private JButton equalButton = new JButton("=");
  private JButton clearButton = new JButton("C");

  // Create the text field
  private JTextField textField = new JTextField(10);

  // Create the calculator
  public Calc() {
    // Add the buttons to the panel
    buttonPanel.add(addButton);
    buttonPanel.add(subtractButton);
    buttonPanel.add(multiplyButton);
    buttonPanel.add(divideButton);
    buttonPanel.add(equalButton);
    buttonPanel.add(clearButton);

    // Create the main frame
    JFrame frame = new JFrame("Calculator");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 100);

    // Add the components to the frame
    frame.add(textField, BorderLayout.NORTH);
    frame.add(buttonPanel, BorderLayout.SOUTH);

    // Display the frame
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    // Create the calculator
    Calc calculator = new Calc();
  }
}
