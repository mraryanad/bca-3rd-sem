import java.sql.*;

public class CRUD {

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public static void main(String args[]) {
        String query;

        // creating the connection
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "");
            stmt = con.createStatement();

            // insert data
            query = "INSERT INTO students (name, age) VALUES ('Passion Fruit', 89);";
            stmt.executeUpdate(query);

            // select data
            query = "SELECT * FROM students";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }

            // update data
            query = "UPDATE students SET id = '5' WHERE name = 'Passion Fruit'";
            stmt.executeUpdate(query);

            // delete data
            query = "DELETE FROM students WHERE id = '1'";
            stmt.executeUpdate(query);

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            // close connection ,stmt and resultset here
        }
    }
}
