// Write a JDBC program using PreparedStatement and Batch Processing 
// to insert multiple employee records into the 'customer' table. 
// The program should repeatedly take input from the user and execute 
// all inserts together as a batch operation.


package com.vignesh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;

public class Program6 {

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        Scanner scan = new Scanner(System.in);

        // SQL with placeholders (5 columns in customer table)
        final String QUERY = "INSERT INTO customer VALUES (?, ?, ?, ?, ?)";

        String url = "jdbc:mysql://localhost:3306/jdbc_naik";
        String username = "root";
        String password = "root";

        try {
            // 1. Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver successfully loaded.");

            // 2. Get connection
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to MySQL.");

            // 3. Prepare statement once
            pstmt = con.prepareStatement(QUERY);
            String choice;

            // 4. Take user input and add to batch
            do {
                System.out.print("ID: ");
                int id = scan.nextInt();
                scan.nextLine(); // consume newline

                System.out.print("NAME: ");
                String name = scan.nextLine();

                System.out.print("EMAIL: ");
                String email = scan.nextLine();

                System.out.print("DEPT: ");
                String dept = scan.nextLine();

                System.out.print("SALARY: ");
                int salary = scan.nextInt();
                scan.nextLine(); // consume newline

                // set params (index starts at 1)
                pstmt.setInt(1, id);
                pstmt.setString(2, name);
                pstmt.setString(3, email);
                pstmt.setString(4, dept);
                pstmt.setInt(5, salary);

                // add this row to batch
                pstmt.addBatch();

                System.out.print("Want to add Employee (Yes/No): ");
                choice = scan.nextLine();

            } while (choice.equalsIgnoreCase("yes"));

            // 5. Execute the batch and print result
            int[] arr = pstmt.executeBatch(); // returns array of update counts
            System.out.println("Batch executed. Result counts: " + Arrays.toString(arr));

        } catch (ClassNotFoundException e) {
            System.err.println("Driver not found! Add MySQL Connector JAR to classpath.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Database error:");
            e.printStackTrace();
        } finally {
            // close resources
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
            scan.close();
        }
    }
}
