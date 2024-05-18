import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class BricksRequiredGUI extends JFrame implements ActionListener {
    private JLabel wallLengthLabel;
    private JLabel wallBreadthLabel;
    private JLabel brickLengthLabel;
    private JLabel brickBreadthLabel;
    private JLabel noOfTractorsLabel;
    private JLabel transportationFeeLabel;
    private JLabel distanceTraveledLabel;
    private JTextField wallLengthField;
    private JTextField wallBreadthField;
    private JTextField brickLengthField;
    private JTextField brickBreadthField;

    BricksRequiredGUI() {

        setTitle("Sales Management Software | Bricks Udhyog");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(2, 2));
        setLocation(null);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new BricksRequiredGUI();
    }

}
