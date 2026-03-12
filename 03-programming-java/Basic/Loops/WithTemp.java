/*
Question:
Write a Java program to swap two numbers using a temporary variable.
The program should take two integers as input from the user and
display the values before swapping and after swapping.
*/

import java.util.Scanner;

public class WithTemp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("Before Swapping a is " + a);
		System.out.println("Before Swapping b is " + b);

		// Swapping using temporary variable
		int temp = a;
		a = b;
		b = temp;

		System.out.println("After Swapping a is " + a);
		System.out.println("After Swapping b is " + b);

		sc.close();
	}
}