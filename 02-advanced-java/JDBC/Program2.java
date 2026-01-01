// Write a Program to insert a row into employee table

package com.vignesh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Program2 {

    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;

        // INSERT QUERY
        String Query = "INSERT INTO customer VALUES (3, 'lali', 'dar2@gmail.com',10,7)";

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

            // 4. Execute INSERT using executeUpdate()
            stmt.executeUpdate(Query);

        } 
        catch (ClassNotFoundException e) {
            System.out.println("Driver not found! Add MySQL Connector JAR.");
            e.printStackTrace();
        } 
        catch (SQLException e) {
            System.out.println("Database operation failed!");
            e.printStackTrace();
        } 
        finally {
            close(con, stmt);
        }
    }

    private static void close(Connection con, Statement stmt) {

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
