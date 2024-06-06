// Java program to demonstrate the
// event handling within the class

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ActionAct extends JFrame implements ActionListener {

	TextField textField;

	ActionAct()
	{
		// Component Creation
		textField = new TextField();

		// setBounds method is used to provide
		// position and size of the component
		textField.setBounds(60, 50, 180, 55);
		JButton button = new JButton("click Here");
		button.setBounds(100, 120, 80, 30);

		// Registering component with listener
		// this refers to current instance
		button.addActionListener(this);

		// add Components
		add(textField);
		add(button);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		// set visibility
		setVisible(true);
	}

	// implementing method of actionListener
	public void actionPerformed(ActionEvent e)
	{
		// Setting text to field
		textField.setText("ActionAct!");
	}

	public static void main(String[] args)
	{
	new ActionAct();
	}
}
