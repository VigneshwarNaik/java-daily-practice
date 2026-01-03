/* Write a JDBC program to call a MySQL stored procedure using CallableStatement.
 The stored procedure 'customer' should insert a new record into the customer table
using 5 input parameters: id, name, email, dept, and salary.
*/


/*DELIMITER $$

CREATE PROCEDURE customer(
    IN p_id INT,
    IN p_name VARCHAR(100),
    IN p_email VARCHAR(100),
    IN p_dept VARCHAR(50),
    IN p_salary INT
)
BEGIN
    START TRANSACTION;

    -- Insert into customer table
    INSERT INTO customer VALUES (p_id, p_name, p_email, p_dept, p_salary);

    -- If everything successful → commit
    COMMIT;

END $$

DELIMITER ;
*/


package com.vignesh;

import java.sql.*;
import java.util.Scanner;

public class Program8{

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/jdbc_naik";
        String user = "root";
        String pass = "root";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);

        // Stored procedure call
        CallableStatement cstmt = con.prepareCall("{ call customer(?, ?, ?, ?, ?) }");

        Scanner sc = new Scanner(System.in);

        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("NAME: ");
        String name = sc.nextLine();

        System.out.print("EMAIL: ");
        String email = sc.nextLine();

        System.out.print("DEPT: ");
        String dept = sc.nextLine();

        System.out.print("SALARY: ");
        int salary = sc.nextInt();

        // Set procedure parameters
        cstmt.setInt(1, id);
        cstmt.setString(2, name);
        cstmt.setString(3, email);
        cstmt.setString(4, dept);
        cstmt.setInt(5, salary);

        try {
            cstmt.execute();
            System.out.println("✔ Stored Procedure executed successfully.");

        } catch (SQLException e) {
            System.out.println("✘ Error while executing stored procedure.");
            e.printStackTrace();
        } finally {
            cstmt.close();
            con.close();
            sc.close();
        }
    }
}
