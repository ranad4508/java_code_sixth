package JDBC;
import java.sql.*;

public class SelectStatement {
    public static void main(String[] args) throws ClassNotFoundException {
        String db_conn = "jdbc:mysql://localhost:3306/db_java";
        String uname = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(db_conn, uname, password);

            String query = "SELECT * FROM users";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("Users are:");
            while (rs.next()) {
                int id = rs.getInt("Roll_no");
                String name = rs.getString("Name");
                String age = rs.getString("Age");
                String Password = rs.getString("Password");

                System.out.println("Roll_no: " + id + ", Name: " + name + ", Age: " + age+", Password: "+Password);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
