package com.vignesh;

import java.sql.*;
import java.util.Scanner;

public class Program7 {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/jdbc_naik";
        String user = "root";
        String pass = "root";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);

        // Turn OFF auto commit → Now transaction begins
        con.setAutoCommit(false);

        // Setting isolation level
        con.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);

        String sql = "INSERT INTO customer VALUES (?, ?, ?, ?, ?)";

        PreparedStatement pstmt = con.prepareStatement(sql);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            System.out.print("Enter Dept: ");
            String dept = sc.nextLine();

            System.out.print("Enter Salary: ");
            int salary = sc.nextInt();

            // Set values
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, email);
            pstmt.setString(4, dept);
            pstmt.setInt(5, salary);

            // Execute
            pstmt.executeUpdate();

            // If no error → commit
            con.commit();
            System.out.println("✔ Data inserted successfully (Committed).");

        } catch (Exception e) {
            // Any error → rollback
            con.rollback();
            System.out.println("✘ Error occurred → Transaction Rolled Back.");
            e.printStackTrace();
        } finally {
            pstmt.close();
            con.close();
            sc.close();
        }
    }
}

/*⭐ How to explain ACID to the interviewer (simple & perfect)
1️. A — Atomicity (All or Nothing)

What you say:
“In my program, I used con.setAutoCommit(false).
This means all operations become part of one single transaction.
If any error occurs while inserting, I call rollback().
So either the data is fully inserted, or nothing gets inserted.
This is Atomicity.”

Very simple example to say:
“Like sending money through UPI — either the full amount transfers or it fails completely.”

2️. C — Consistency (Valid Data Only)

What you say:
“My table has constraints like Primary Key, Unique Email, and Salary CHECK.
If I try to insert wrong/duplicate data, MySQL throws an error,
and I rollback the transaction.
So the database always remains in a correct state — that is Consistency.”

Simple example:
“You cannot insert negative salary or duplicate email — Consistency protects the rules.”

3️. I — Isolation (Transactions don’t disturb each other)

What you say:
“I set the isolation level using:
con.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
This means other users cannot see my uncommitted insert.
So even if multiple users insert data at the same time,
their transactions do not interfere.
That is Isolation.”

Simple example:
“Two people booking movie tickets — one person’s seat lock should not be visible to others until they confirm.”

4️. D — Durability (Data stays even after crash)

What you say:
“After successful insert, I call con.commit().
Once committed, MySQL writes the data to disk.
Even if system crashes, the committed data is safe.
This is Durability.”

Simple example:
“Once you save a file, even if the laptop crashes, your saved data remains.”
*/