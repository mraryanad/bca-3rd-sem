// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.sql.Statement;

// public class CrudUi extends JFrame implements ActionListener {

//     private static CrudUi instance;
//     private JLabel nameLabel, ageLabel, resultLabel;
//     private JTextField nameTextField, ageTextField;
//     private JButton submitButton;

//     // UI
//     private static Connection con;
//     private static Statement stmt;
//     private static ResultSet rs;
//     private static String query;

//     public CrudUi() {
//         instance = this;
//         setTitle("CRUD UI App");
//         setSize(600, 400);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         nameLabel = new JLabel("Enter Name: ");
//         nameTextField = new JTextField();

//         ageLabel = new JLabel("Enter Age: ");

//         submitButton = new JButton("Submit");

//         add(nameLabel);
//         add(nameTextField);
//         add(ageLabel);
//         add(ageTextField);
//         add(submitButton);
//         add(resultLabel);

//         submitButton.addActionListener(CrudUi.instance);

//         setLayout(new FlowLayout());
//         setLocationRelativeTo(null);

//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         if (e.getSource() == submitButton) {
//             try {

//                 String name = nameTextField.getText();
//                 String age = ageTextField.getText();

//                 resultLabel.setForeground(Color.GREEN);
//                 resultLabel.setText("Data Successfully Added to DB!");

//                 try {
//                     con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "");
//                     stmt = con.createStatement();

//                     // insert data
//                     query = "INSERT INTO students (name, age) VALUES ("name", "age")";
//                     stmt.executeUpdate(query);

//                 } catch (SQLException sqlEx) {
//                     sqlEx.printStackTrace();
//                 }
//             } catch (NumberFormatException ex) {

//             }
//         }
//     }

//     public static void main(String[] args) {
//         CrudUi ui = new CrudUi();
//         ui.setVisible(true);
//     }
// }

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudUi extends JFrame implements ActionListener {

    private static CrudUi instance;
    private JLabel nameLabel, ageLabel, idLabel, resultLabel;
    private JTextField nameTextField, ageTextField, idTextField;
    private JButton insertButton, updateButton, deleteButton, readButton;
    private JTextArea resultTextArea;

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    private static String query;

    public CrudUi() {
        instance = this;
        setTitle("CRUD UI App");
        // setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        nameLabel = new JLabel("Enter Name: ");
        nameTextField = new JTextField(20);

        ageLabel = new JLabel("Enter Age: ");
        ageTextField = new JTextField(20);

        idLabel = new JLabel("Enter ID: ");
        idTextField = new JTextField(20);

        resultLabel = new JLabel("");
        resultTextArea = new JTextArea(8, 50);
        resultTextArea.setEditable(false);

        insertButton = new JButton("Insert");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");
        readButton = new JButton("Read");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));
        panel.add(nameLabel);
        panel.add(nameTextField);
        panel.add(ageLabel);
        panel.add(ageTextField);
        panel.add(idLabel);
        panel.add(idTextField);
        panel.add(insertButton);
        panel.add(updateButton);
        panel.add(deleteButton);
        panel.add(readButton);
        panel.add(resultLabel);

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(resultTextArea), BorderLayout.CENTER);

        insertButton.addActionListener(CrudUi.instance);
        updateButton.addActionListener(CrudUi.instance);
        deleteButton.addActionListener(CrudUi.instance);
        readButton.addActionListener(CrudUi.instance);

        pack();
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "");
            stmt = con.createStatement();

            if (e.getSource() == insertButton) {
                String name = nameTextField.getText();
                String age = ageTextField.getText();

                query = "INSERT INTO students (name, age) VALUES ('" + name + "', " + age + ")";
                stmt.executeUpdate(query);

                resultLabel.setForeground(Color.GREEN);
                resultLabel.setText("Data Successfully Added to DB!");

            } else if (e.getSource() == updateButton) {
                String id = idTextField.getText();
                String name = nameTextField.getText();
                String age = ageTextField.getText();

                query = "UPDATE students SET name = '" + name + "', age = " + age + " WHERE id = " + id;
                stmt.executeUpdate(query);

                resultLabel.setForeground(Color.GREEN);
                resultLabel.setText("Data Successfully Updated in DB!");

            } else if (e.getSource() == deleteButton) {
                String id = idTextField.getText();

                query = "DELETE FROM students WHERE id = " + id;
                stmt.executeUpdate(query);

                resultLabel.setForeground(Color.GREEN);
                resultLabel.setText("Data Successfully Deleted from DB!");

            } else if (e.getSource() == readButton) {
                query = "SELECT * FROM students";
                rs = stmt.executeQuery(query);

                resultTextArea.setText("");
                while (rs.next()) {
                    resultTextArea.append(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + "\n");
                }

                resultLabel.setForeground(Color.GREEN);
                resultLabel.setText("Data Retrieved from DB!");
            }
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
            resultLabel.setForeground(Color.RED);
            resultLabel.setText("Error interacting with DB!");
        } catch (NumberFormatException ex) {
            resultLabel.setForeground(Color.RED);
            resultLabel.setText("Invalid Input!");
        }
    }

    public static void main(String[] args) {
        CrudUi ui = new CrudUi();
        ui.setVisible(true);
    }
}
