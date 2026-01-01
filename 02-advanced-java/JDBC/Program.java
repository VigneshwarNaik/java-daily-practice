package com.vignesh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        ResultSet result = null;

        String url = "jdbc:mysql://localhost:3306/jdbc_naik";
        String username = "root";
        String password = "root";

        try {
            // 1. Load the driver (optional for modern JVMs but kept for compatibility)
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver successfully Loaded");

            // 2. Establish connection
            con = DriverManager.getConnection(url, username, password);
            System.out.println("MySQL Connected Successfully!");

            // 3. Create a SQL statement
            stmt = con.createStatement();
            System.out.println("Created Statement");

            // 4. Execute SQL statement (SELECT example)
            result = stmt.executeQuery("SELECT * FROM customer");
            System.out.println("Executed SQL Statement (SELECT)");

            // 5. Process the result
            printTable(result);

            
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found! Add MySQL Connector JAR.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database operation failed!");
            e.printStackTrace();
        } finally {
            close(con, stmt, result);
        }
    }

    private static void printTable(ResultSet result) throws SQLException {
        while (result.next()) {
            System.out.println("----------------------------------------------------------");
            System.out.printf("| %-7d | %-10s | %-20s | %-10s | %-7d |\n",
                    result.getInt("id"),
                    result.getString("name"),
                    result.getString("email"),
                    result.getInt("salary"),
                    result.getInt("payment"));
        }
    }

    private static void close(Connection con, Statement stmt, ResultSet rs) {
            try {
                rs.close();
            } catch (SQLException e) {
                System.err.println("Error while closing ResultSet:");
                e.printStackTrace();
            }
        

            try {
                stmt.close();
            } catch (SQLException e) {
                System.err.println("Error while closing Statement:");
                e.printStackTrace();
        }

            try {
                con.close();
            } catch (SQLException e) {
                System.err.println("Error while closing Connection:");
                e.printStackTrace();
            }
    }
}
