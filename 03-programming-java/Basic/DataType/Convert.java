/*
Question:
Write a program to convert Dollars to Rupees.
Assume that 1 Dollar = 82.73 INR.

Input:
A single integer representing the amount in dollars.

Output:
Print the converted amount in rupees with exactly four decimal places.
*/

import java.util.Scanner;

public class Convert {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Dollar");
        int doller = sc.nextInt();

        // Convert dollars to rupees using conversion rate
        float rupees = doller * 82.73f;

        // Print the result with 4 decimal places
        System.out.printf("%.4f", rupees);

    }
}