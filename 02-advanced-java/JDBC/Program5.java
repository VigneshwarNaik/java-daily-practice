// Write a JDBC program using PreparedStatement that takes user input 
// from the console and inserts a new record into the 'customer' table.


package com.vignesh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Program5 {

    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement pstmt = null;
        Scanner sc = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/jdbc_naik";
        String username = "root";
        String password = "root";

        try {
            // 1. Load the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver successfully Loaded");

            // 2. Establish Connection
            con = DriverManager.getConnection(url, username, password);
            System.out.println("MySQL Connected Successfully!");

            // 3. Write SQL Query
            String query = "INSERT INTO customer (id, name, email,salary,payment) VALUES (?, ?, ?, ?, ?)";

            // 4. Create PreparedStatement
            pstmt = con.prepareStatement(query);
            System.out.println("PreparedStatement Created");

            // -------- Taking Input from User --------
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            System.out.print("Enter Salary: ");
            int salary = sc.nextInt();
            
            System.out.println("enter the payment: ");
            int pay=sc.nextInt();

            // -------- Set Values to PreparedStatement --------
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, email);
            pstmt.setInt	(4, salary);
            pstmt.setInt(5, pay);

            // 5. Execute SQL
            int rows = pstmt.executeUpdate();
            System.out.println("Rows Inserted = " + rows);

        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database operation failed!");
            e.printStackTrace();
        } finally {

            try {
                if (pstmt != null) pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            sc.close();
        }
    }
}
