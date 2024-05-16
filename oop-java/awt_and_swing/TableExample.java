import javax.swing.*;

public class TableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Table Example Program");
        frame.setSize(400, 600);

        // Table
        String colName[] = { "Name", "Roll No", "Class" };
        String data[][] = {
                { "Ram Thapa", "10", "BCA-II" },
                { "Krishna Tharu", "20", "BCA-III" },
                { "Suresh Dhakal", "13", "BCA-I" },
                { "Kabin Shrestha", "12", "BBS-2nd " }
        };

        JTable table = new JTable(data, colName);
        table.setBounds(30, 40, 200, 300);
        panel.add(table);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);
        frame.setVisible(true);
    }
}