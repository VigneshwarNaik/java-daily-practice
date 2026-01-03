// Insert a new customer record into the database using PreparedStatement in JDBC.

package com.vignesh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program4 {

    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement pstmt = null;

        String url = "jdbc:mysql://localhost:3306/jdbc_naik";
        String username = "root";
        String password = "root";

        try {
            // 1. Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver successfully Loaded");

            // 2. Establish the Connection
            con = DriverManager.getConnection(url, username, password);
            System.out.println("MySQL Connected Successfully!");

            // 3. Create PreparedStatement
            String query = "INSERT INTO customer (id, name, email, salary,payment) VALUES (?, ?, ?, ?, ?)";

            pstmt = con.prepareStatement(query);
            System.out.println("PreparedStatement Created");

            // 4. Set the values ( ? ? ? ? ? )
            // This is the main difference between Statement and PreparedStatement
            pstmt.setInt(1, 10);
            pstmt.setString(2, "Ramesh");
            pstmt.setString(3, "ramesh@gmail.com");
            pstmt.setInt(4, 450);
            pstmt.setInt(5, 36);
            

            // 5. Execute the SQL Statement
            int rows = pstmt.executeUpdate();   // use executeUpdate for INSERT, UPDATE, DELETE
            System.out.println("Rows Inserted = " + rows);

        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database operation failed!");
            e.printStackTrace();
        } finally {

            try {
                 pstmt.close();
            } catch (SQLException e) { 
            	e.printStackTrace(); 
            	}

            try {
                con.close();
            } catch (SQLException e) { 
            	e.printStackTrace(); 
            	}
        }
    }
}
