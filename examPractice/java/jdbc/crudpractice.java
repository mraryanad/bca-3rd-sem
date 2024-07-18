package jdbc;

import java.sql.*;

public class crudpractice {
    public static Connection con;
    public static Statement stmt;
    public static ResultSet rs;

    public static void main(String[] args) {
        String query;

        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/name", "root", "");
            stmt = con.createStatement();

            query = "SELECT * FROM LIST";
            stmt = executeQuery(query);

        } catch (SQLException sqle) {
            System.out.println("Error occurred: " + sqle.getMessage());
        }
    }
}
