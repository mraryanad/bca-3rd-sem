import javax.swing.*;
import java.awt.*;

class TableNew {
    public static void main(String args[]){
        JFrame frame = new JFrame();

        frame.setSize(400, 400);
        frame.setTitle("tabel Eg");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        String data[][] = {
            {"Sagar", "12", "10"},
            {"Binod", "11", "13"}
        };
        String col[] = {"Name", "Class", "Roll No"};

        JTable table = new JTable(data, col);
        JScrollPane sp = new JScrollPane(table);
        panel.add(sp);
        frame.add(panel);

        frame.setVisible(true);
    }
}
