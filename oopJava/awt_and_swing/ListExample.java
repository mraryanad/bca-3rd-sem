import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListExample extends JFrame implements ListSelectionListener {

    // frame
    static JFrame frame;

    // lists
    static JList b, b1, b2;

    // labels
    static JLabel label1;

    // main label

    public static void main(String[] args) {

        // create a new frame
        frame = new JFrame("FRAME");

        // create an object
        ListExample example = new ListExample();

        // create a panel
        JPanel panel = new JPanel();

        // create a new Label
        JLabel label = new JLabel("Select Your Birthday");
        label1 = new JLabel();

        // String array to store weekdays
        String month[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };

        // create arrays for months and year
        String date[] = new String[31];
        String year[] = new String[31];

        // add month number and year in list
        for (int i = 0; i < 31; i++) {
            date[i] = "" + (int) (i + 1); // date[0] = 1;
            year[i] = "" + (int) (2024 - i); // year[0] = 2024
        }

        // create lists
        b = new JList(date);
        b1 = new JList(month);
        b2 = new JList(year);

        // set a selected index
        b.setSelectedIndex(2);
        b1.setSelectedIndex(1);
        b2.setSelectedIndex(3);

        // add item listener
        b.addListSelectionListener(example);
        b1.addListSelectionListener(example);
        b2.addListSelectionListener(example);

        // add to the frame
        panel.add(label);
        panel.add(b);
        panel.add(b1);
        panel.add(b2);
        panel.add(label1);

        frame.add(panel);

        // frame configuration
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        frame.setLocationRelativeTo(null);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        // set the text of the label to the selected value of lists
        label1.setText(b.getSelectedValue() + "" + b1.getSelectedValue() + "" + b2.getSelectedValue());
    }
}
