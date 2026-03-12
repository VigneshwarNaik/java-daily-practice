/*
Question:
Write a Java program that reads two integers from the user and prints
the larger number using the Ternary Operator.

Input:
Two integer numbers.

Output:
The greater number among the two inputs.
*/

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		// Using ternary operator to find the larger number
		System.out.println((a > b) ? a : b);

		sc.close();
	}
}

