
//UPDATE salary by 5000 for employees of finance department


package com.vignesh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Program3 {

    public static void main(String[] args) {

        Connection con = null;
        Statement stmt = null;

        // UPDATE QUERY
        String query = "UPDATE customer SET salary = salary + 5000 WHERE name = 'lali'";

        String url = "jdbc:mysql://localhost:3306/jdbc_naik";
        String username = "root";
        String password = "root";

        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver successfully Loaded");

            // 2. Establish Connection
            con = DriverManager.getConnection(url, username, password);
            System.out.println("MySQL Connected Successfully!");

            // 3. Create Statement
            stmt = con.createStatement();
            System.out.println("Created Statement");

            // 4. Execute UPDATE
            int rows = stmt.executeUpdate(query);

            // 5. PROCESS THE RESULT → PRINT rows affected
            System.out.println("Number of employees updated = " + rows);

        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database operation failed!");
            e.printStackTrace();
        } finally {

            try { if (stmt != null) stmt.close(); } 
            catch (SQLException e) { e.printStackTrace(); }

            try { if (con != null) con.close(); } 
            catch (SQLException e) { e.printStackTrace(); }
        }
    }
}
