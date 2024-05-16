import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class DynamicButton {
    public static void main(String[] args) {
        // Accept the input from the user and create buttons
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of buttons to create: ");
        int noOfButtons = scan.nextInt();

        DynamicButtonUI buttonUI = new DynamicButtonUI(noOfButtons);

        // Close the scanner
        scan.close();
    }
}

class DynamicButtonUI {
    DynamicButtonUI(int noOfButtons) {
        // Create a frame
        JFrame frame = new JFrame("Dynamic Buttons");
        JTextField textField = new JTextField("How many buttons to create?");
        JPanel panel = new JPanel(new GridLayout(2, 3));

        for (int i = 1; i <= noOfButtons; i++) {
            String buttonText = "Button " + i;
            JButton button = new JButton(buttonText);
            panel.add(button);
        }

        // Set the positioning of the elements
        frame.setLayout(new BorderLayout());
        frame.add(textField, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        // Set the configuration for the frame
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack(); // Resize the frame to fit its components

        // Make the frame visible
        frame.setVisible(true);
    }
}
