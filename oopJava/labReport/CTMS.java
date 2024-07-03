package labReport;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CTMS extends JFrame implements ActionListener {
    private static CTMS instance;
    private JButton calculateButton;
    private JTextField wallLength, wallBreadth, brickLength, brickBreadth, tractorCapacity, distance;
    private JLabel output;

    public CTMS() {
        instance = this;
        setTitle("Bricks Calculation | Bricks Udhyog");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 800);
        setLayout(new GridLayout(8, 2));

        wallLength = new JTextField();
        wallBreadth = new JTextField();
        brickLength = new JTextField();
        brickBreadth = new JTextField();
        tractorCapacity = new JTextField();
        distance = new JTextField();
        calculateButton = new JButton("Calculate");
        output = new JLabel("                                       Result");

        add(new JLabel("Wall length (ft)"));
        add(wallLength);
        add(new JLabel("Wall breadth (ft)"));
        add(wallBreadth);
        add(new JLabel("Brick length (cm)"));
        add(brickLength);
        add(new JLabel("Brick breadth (cm)"));
        add(brickBreadth);
        add(new JLabel("Enter tractor capacity (units)"));
        add(tractorCapacity);
        add(new JLabel("Enter the distance (km)"));
        add(distance);
        add(calculateButton);
        add(output);

        calculateButton.addActionListener(CTMS.instance);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            try {
                double wallLengthVal = Double.parseDouble(wallLength.getText());
                double wallBreadthVal = Double.parseDouble(wallBreadth.getText());
                double brickLengthVal = Double.parseDouble(brickLength.getText());
                double brickBreadthVal = Double.parseDouble(brickBreadth.getText());
                double tractorCapacityVal = Double.parseDouble(tractorCapacity.getText());
                double distanceVal = Double.parseDouble(distance.getText());
                double noOfBricksRequired, costOnTransportation, costOnBricks, noOfTractorsRequired;

                noOfBricksRequired = (wallLengthVal * wallBreadthVal * 144) / (brickLengthVal * brickBreadthVal);
                costOnBricks = noOfBricksRequired * 30;
                noOfTractorsRequired = Math.ceil(noOfBricksRequired / tractorCapacityVal);
                if (distanceVal <= 10) {
                    costOnTransportation = 300 * noOfTractorsRequired;
                } else if (distanceVal > 10 && distanceVal <= 20) {
                    costOnTransportation = 350 * noOfTractorsRequired;
                } else {
                    costOnTransportation = 500 * noOfTractorsRequired;
                }
                double totalCost = costOnBricks + costOnTransportation;

                output.setText("<html>Total no of tractors required: " + String.format("%.0f", noOfTractorsRequired)
                        + "<br>Total cost: Rs " + String.format("%.2f", totalCost) + "</html>");

            } catch (NumberFormatException ex) {
                if (brickBreadth.getText().isEmpty() || brickLength.getText().isEmpty()
                        || wallBreadth.getText().isEmpty() || wallLength.getText().isEmpty()
                        || tractorCapacity.getText().isEmpty() || distance.getText().isEmpty()) {
                    output.setText("Please enter all the information");
                } else {
                    output.setText("Invalid Input");
                }
            }
        }
    }

    public static void main(String[] args) {
        CTMS brGUI = new CTMS();
        brGUI.setVisible(true);
    }
}
