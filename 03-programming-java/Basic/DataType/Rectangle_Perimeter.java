/*
Question:
Write a Java program to calculate the perimeter of a rectangle.

Input:
The program should take the length and width of the rectangle from the user.

Output:
Display the perimeter of the rectangle.

Formula:
Perimeter = 2 × (length + width)
*/

import java.util.Scanner;

public class Rectangle_Perimeter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of a rectangle");
        int length = sc.nextInt();
        System.out.println("Enter the width of a rectangle");
        int width = sc.nextInt();

        // Calculate the perimeter using the formula
        int perimeter = 2 * (length + width);

        // Print the calculated perimeter
        System.out.println("Rectangle perimeter is " + perimeter);
    }
}