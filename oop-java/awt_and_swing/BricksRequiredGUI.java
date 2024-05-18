// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import javax.swing.*;

// public class BricksRequiredGUI extends JFrame implements ActionListener {
//     private static BricksRequiredGUI instance;
//     final private JLabel wallLengthLabel;
//     final private JLabel wallBreadthLabel;
//     final private JLabel brickLengthLabel;
//     final private JLabel brickBreadthLabel;
//     final private JLabel distanceTraveledLabel;
//     final private JTextField wallLengthField;
//     final private JTextField wallBreadthField;
//     final private JTextField brickLengthField;
//     final private JTextField brickBreadthField;
//     final private JTextField distanceTraveledField;
//     final private JButton calculateButton;
//     final private JTextArea resultArea;

//     public BricksRequiredGUI() {
//         instance = this;
//         setTitle("Bricks Calculation | Bricks Udhyog");
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(new GridLayout(7, 2));

//         wallLengthLabel = new JLabel("Wall Length (ft): ");
//         wallLengthField = new JTextField();

//         wallBreadthLabel = new JLabel("Wall Breadth (ft): ");
//         wallBreadthField = new JTextField();

//         brickLengthLabel = new JLabel("Brick Length (cm): ");
//         brickLengthField = new JTextField();

//         brickBreadthLabel = new JLabel("Brick Breadth (cm): ");
//         brickBreadthField = new JTextField();

//         distanceTraveledLabel = new JLabel("Distance Traveled (km): ");
//         distanceTraveledField = new JTextField();

//         resultArea = new JTextArea(2, 2);
//         resultArea.setEditable(false);

//         calculateButton = new JButton("Calculate");
//         calculateButton.addActionListener(BricksRequiredGUI.instance);

//         add(wallLengthLabel);
//         add(wallLengthField);
//         add(wallBreadthLabel);
//         add(wallBreadthField);
//         add(brickLengthLabel);
//         add(brickLengthField);
//         add(brickBreadthLabel);
//         add(brickBreadthField);
//         add(distanceTraveledLabel);
//         add(distanceTraveledField);
//         add(calculateButton);
//         add(resultArea);

//         setLocationRelativeTo(null);
//         pack();
//         setVisible(true);
//     }

//     public static void main(String[] args) {
//         BricksRequiredGUI gui = new BricksRequiredGUI();
//         gui.setVisible(true);
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         try {
//             float wallLength = Float.parseFloat(wallLengthField.getText());
//             float wallBreadth = Float.parseFloat(wallBreadthField.getText());
//             float brickLength = Float.parseFloat(brickLengthField.getText());
//             float brickBreadth = Float.parseFloat(brickBreadthField.getText());
//             float distanceTraveled = Float.parseFloat(distanceTraveledField.getText());

//             float wallLengthCM = wallLength * 30.48f; // Convert ft to cm
//             float wallBreadthCM = wallBreadth * 30.48f; // Convert ft to cm

//             float noOfBricksRequired = (wallLengthCM * wallBreadthCM) / (brickLength * brickBreadth);
//             float noOfTractors = (float) Math.ceil(noOfBricksRequired / 500);

//             float transportationFee;
//             if (distanceTraveled <= 10) {
//                 transportationFee = 300;
//             } else if (distanceTraveled <= 20) {
//                 transportationFee = 350;
//             } else {
//                 transportationFee = 500;
//             }

//             float totalFee = noOfTractors * transportationFee;

//             resultArea.setText(
//                     "Number of Bricks Required: " + noOfBricksRequired +
//                             "\nNumber of Tractors Required: " + noOfTractors +
//                             "\nTransportation Fee per Tractor: Rs " + transportationFee +
//                             "\nTotal Transportation Fee: Rs " + totalFee);

//         } catch (NumberFormatException ex) {
//             JOptionPane.showMessageDialog(this, "Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
//         }
//     }
// }

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BricksRequiredGUI extends JFrame implements ActionListener {
    private static BricksRequiredGUI instance;
    final private JButton calculateButton;
    final private JTextField wall_length, wall_breadth, brick_length, brick_breadth, tractor_capacity, distance;
    final private JLabel output;

    public BricksRequiredGUI() {
        instance = this;
        setTitle("Bricks Calculation | Bricks Udhyog");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 800);
        setLayout(new GridLayout(8, 2));

        wall_length = new JTextField();
        wall_breadth = new JTextField();
        brick_length = new JTextField();
        brick_breadth = new JTextField();
        tractor_capacity = new JTextField();
        distance = new JTextField();
        calculateButton = new JButton("Calculate");
        output = new JLabel("                                       Result");

        add(new JLabel("Wall length (ft)"));
        add(wall_length);
        add(new JLabel("Wall breadth (ft)"));
        add(wall_breadth);
        add(new JLabel("Brick length (cm)"));
        add(brick_length);
        add(new JLabel("Brick breadth (cm)"));
        add(brick_breadth);
        add(new JLabel("Enter tractor capacity (units)"));
        add(tractor_capacity);
        add(new JLabel("Enter the distance (km)"));
        add(distance);
        add(calculateButton);
        add(output);

        calculateButton.addActionListener(BricksRequiredGUI.instance);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            try {
                double val1 = Double.parseDouble(wall_length.getText());
                double val2 = Double.parseDouble(wall_breadth.getText());
                double val3 = Double.parseDouble(brick_length.getText());
                double val4 = Double.parseDouble(brick_breadth.getText());
                double val5 = Double.parseDouble(tractor_capacity.getText());
                double val6 = Double.parseDouble(distance.getText());
                double no_of_bricks_required, cost_on_transportation, cost_on_bricks, no_of_tractors_required;

                no_of_bricks_required = (val1 * val2 * 144) / (val3 * val4);
                cost_on_bricks = no_of_bricks_required * 30;
                no_of_tractors_required = Math.ceil(no_of_bricks_required / val5);
                if (val6 <= 10) {
                    cost_on_transportation = 300 * no_of_tractors_required;

                } else if (val6 > 10 && val6 >= 20) {
                    cost_on_transportation = 350 * no_of_tractors_required;

                } else {
                    cost_on_transportation = 500 * no_of_tractors_required;
                }
                double totalCost = cost_on_bricks + cost_on_transportation;

                output.setText("<html>Total no of tractors required: " + String.format("%.0f", no_of_tractors_required)
                        + "<br>Total cost: Rs " + String.format("%.2f", totalCost) + "</html>");

            } catch (NumberFormatException ex) {
                if (brick_breadth.getText().isEmpty() || brick_length.getText().isEmpty()
                        || wall_breadth.getText().isEmpty() || wall_length.getText().isEmpty()
                        || tractor_capacity.getText().isEmpty() || distance.getText().isEmpty()) {
                    output.setText("Please enter all the information");
                } else {
                    output.setText("Invalid Input");
                }
            }
        }
    }

    public static void main(String[] args) {
        BricksRequiredGUI brGUI = new BricksRequiredGUI();
        brGUI.setVisible(true);
    }
}