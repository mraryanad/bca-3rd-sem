import java.awt.*;
import javax.swing.*;

class Chat {
    public static void main(String args[]){
        JFrame frame = new JFrame();
        frame.setSize(400, 500);
        frame.setTitle("Lets Chat");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar =  new JMenuBar();
        JMenu menu1 = new JMenu("FILE");
        JMenu menu2 = new JMenu("HELP");
        menuBar.add(menu1);
        menuBar.add(menu2);
        JMenuItem menuItem1 = new JMenuItem("Recent File");
        JMenuItem menuItem2 = new JMenuItem("Save as");
        menu1.add(menuItem1);
        menu1.add(menuItem2);


        JPanel panel = new JPanel();
        JTextField textField = new JTextField(10);
        JLabel label = new JLabel("Enter your Message");
        JButton btn1 = new JButton("Send");
        JButton btn2 = new JButton("Reset");
        panel.add(label);
        panel.add(textField);
        panel.add(btn1);
        panel.add(btn2);

        String data[][] = {
            {"Hemanta Jung Karki", "25", "Male"},
            {"Manushri Basnet", "10", "Female"}
        };
        String col[] = {"Name", "Age", "Gender"};
        JTable table = new JTable(data, col);
        JScrollPane sp = new JScrollPane(table);

        frame.add(BorderLayout.SOUTH, panel);
        frame.add(BorderLayout.NORTH, menuBar);
        frame.add(BorderLayout.CENTER, sp);
        frame.setVisible(true); 


    }
}
