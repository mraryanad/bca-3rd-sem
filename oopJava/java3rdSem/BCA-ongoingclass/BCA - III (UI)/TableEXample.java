import javax.swing.*;
import java.awt.*;

public class TableEXample {
    public static void main(String args[]) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Tabek test Program");
        frame.setSize(400, 400);

        //Table
        String colName[] = {"Name", "Roll No", "Class"};
        String data[][] = {
            {"Ram Kumar Tharu", "10", "BCA-I"},
            {"Jit Bahaudur Chauhan ", "10", "BCA-I"}
        };

        JTable table = new JTable(data, colName);
        JScrollPane sp =  new JScrollPane(table);
        frame.add(sp);
        frame.setVisible(true);
    }
}
