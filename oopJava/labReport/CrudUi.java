package labReport;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class CrudUi extends JFrame implements ActionListener {
    private JTextField staffIdField, staffNameField, staffContactField, staffSalaryField, staffAddressField,
            dateOfEntryField, authorField;
    private JTextArea resultTextArea;
    private JButton insertButton, updateButton, deleteButton, readButton;

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public CrudUi() {
        setTitle("CRUD UI App");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Initialize fields
        staffIdField = new JTextField(20);
        staffNameField = new JTextField(20);
        staffContactField = new JTextField(20);
        staffSalaryField = new JTextField(20);
        staffAddressField = new JTextField(20);
        dateOfEntryField = new JTextField(20);
        authorField = new JTextField(20);

        // Initialize buttons
        insertButton = new JButton("Insert");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");
        readButton = new JButton("Read");

        // Initialize result text area
        resultTextArea = new JTextArea(10, 50);
        resultTextArea.setEditable(false);

        // Create panel for form input
        JPanel inputPanel = new JPanel(new GridLayout(8, 2));
        inputPanel.add(new JLabel("Staff ID:"));
        inputPanel.add(staffIdField);
        inputPanel.add(new JLabel("Staff Name:"));
        inputPanel.add(staffNameField);
        inputPanel.add(new JLabel("Staff Contact:"));
        inputPanel.add(staffContactField);
        inputPanel.add(new JLabel("Staff Salary:"));
        inputPanel.add(staffSalaryField);
        inputPanel.add(new JLabel("Staff Address:"));
        inputPanel.add(staffAddressField);
        inputPanel.add(new JLabel("Date of Entry (YYYY-MM-DD):"));
        inputPanel.add(dateOfEntryField);
        inputPanel.add(new JLabel("Author:"));
        inputPanel.add(authorField);

        // Create panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(insertButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(readButton);

        // Add components to frame
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(new JScrollPane(resultTextArea), BorderLayout.SOUTH);

        // Add action listeners
        insertButton.addActionListener(this);
        updateButton.addActionListener(this);
        deleteButton.addActionListener(this);
        readButton.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "password");
            stmt = con.createStatement();

            if (e.getSource() == insertButton) {
                String staffName = staffNameField.getText();
                String staffContact = staffContactField.getText();
                double staffSalary = Double.parseDouble(staffSalaryField.getText());
                String staffAddress = staffAddressField.getText();
                String dateOfEntry = dateOfEntryField.getText();
                String author = authorField.getText();

                String query = "INSERT INTO staff (staffName, staffContact, staffSalary, staffAddress, dateOfEntry, author) "
                        +
                        "VALUES ('" + staffName + "', '" + staffContact + "', " + staffSalary + ", '" + staffAddress
                        + "', '" + dateOfEntry + "', '" + author + "')";
                stmt.executeUpdate(query);

                JOptionPane.showMessageDialog(this, "Data Successfully Added!");

            } else if (e.getSource() == updateButton) {
                int staffId = Integer.parseInt(staffIdField.getText());
                String staffName = staffNameField.getText();
                String staffContact = staffContactField.getText();
                double staffSalary = Double.parseDouble(staffSalaryField.getText());
                String staffAddress = staffAddressField.getText();
                String dateOfEntry = dateOfEntryField.getText();
                String author = authorField.getText();

                String query = "UPDATE staff SET staffName = '" + staffName + "', staffContact = '" + staffContact
                        + "', staffSalary = " + staffSalary +
                        ", staffAddress = '" + staffAddress + "', dateOfEntry = '" + dateOfEntry + "', author = '"
                        + author + "' WHERE staffId = " + staffId;
                stmt.executeUpdate(query);

                JOptionPane.showMessageDialog(this, "Data Successfully Updated!");

            } else if (e.getSource() == deleteButton) {
                int staffId = Integer.parseInt(staffIdField.getText());

                String query = "DELETE FROM staff WHERE staffId = " + staffId;
                stmt.executeUpdate(query);

                JOptionPane.showMessageDialog(this, "Data Successfully Deleted!");

            } else if (e.getSource() == readButton) {
                String query = "SELECT * FROM staff";
                rs = stmt.executeQuery(query);

                resultTextArea.setText("");
                while (rs.next()) {
                    resultTextArea.append("ID: " + rs.getInt("staffId") + ", Name: " + rs.getString("staffName")
                            + ", Contact: " + rs.getString("staffContact") +
                            ", Salary: " + rs.getDouble("staffSalary") + ", Address: " + rs.getString("staffAddress")
                            + ", Date of Entry: " + rs.getDate("dateOfEntry") +
                            ", Author: " + rs.getString("author") + "\n");
                }
            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error interacting with DB!");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid Input!");
        }
    }

    public static void main(String[] args) {
        new CrudUi();
    }
}
