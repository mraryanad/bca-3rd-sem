import java.sql.*;

class CRUD {

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public static void main(String args[]) {
        String query;

        // creating the connection
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            stmt = con.createStatement();

            // insert data
            query = "INSERT INTO student (id, name, age) VALUES (4, 'jasmin', 19);";
            stmt.executeUpdate(query);

            // select data
            query = "SELECT * FROM student";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }

            // update data
            query = "UPDATE student SET id = '3' WHERE name = 'jasmin'";
            stmt.executeUpdate(query);

            // delete data
            query = "DELETE FROM student WHERE id = '1'";
            stmt.executeUpdate(query);

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
        }
    }
}
