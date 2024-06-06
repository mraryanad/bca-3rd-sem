import javax.swing.*;
import java.awt.*;
public class Complete {
    Complete() {
        JFrame frame = new JFrame();
        JPanel panel =  new JPanel();
        frame.add(panel);
        frame.setTitle("Complete Program");
        frame.setSize(500, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        JLabel label = new JLabel();
        label.setText("Lets look at the table");
        panel.add(label);

        JTextField input = new JTextField(20);
        panel.add(input);

        JButton btn = new JButton();
        btn.setText("Add Data");
        panel.add(btn);

        String data[][] = {
            {"Hari", "10", "BCA III"},
            {"Ram", "10", "BCA III"}
        };
        String col[] = {"Name", "Roll No", "Dept"};

        JTable table = new JTable(data, col);
        // table.setBounds(50, 50, 200, 200);
        JScrollPane sp = new JScrollPane(table);
        panel.add(sp);

        JCheckBox box = new JCheckBox("Please make sure You accept the terms and condition");
        panel.add(box);

        frame.setVisible(true);

    }
    public static void main (String[] args){
        new Complete();
    }
    
}

