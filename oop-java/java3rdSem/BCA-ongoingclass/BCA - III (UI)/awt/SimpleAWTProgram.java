package awt;

import java.awt.*;
import java.awt.event.*;

public class SimpleAWTProgram {
    public static void main(String[] args) {
        // Create a frame (window)
        Frame frame = new Frame("Hello BCA");

        // // Create a label
        Label label = new Label("Hello, AWT!");

        // // Create a button
        Button button = new Button("Click Me");

        // // Create a text field
        TextField textField = new TextField("Type something here");

        // // Create a text area
        TextArea textArea = new TextArea("This is a text area", 5, 20);

        // // Create a checkbox
        Checkbox checkbox = new Checkbox("Check me");

        // // Create a choice (drop-down list)
        Choice choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");

        // // Create a list
        List list = new List(10, false);
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");

        // // Create a panel to group components
        Panel panel = new Panel();
        panel.add(textField);
        panel.add(button);

        // // Set layout to FlowLayout (default layout)
        frame.setLayout(new FlowLayout());

        // // Add components to the frame
        frame.add(label);
        frame.add(panel);
        frame.add(textArea);
        frame.add(checkbox);
        frame.add(choice);
        frame.add(list);

        // // Set the size of the frame
        frame.setSize(600, 600);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // // Make the frame visible
        frame.setVisible(true);
    }
}

