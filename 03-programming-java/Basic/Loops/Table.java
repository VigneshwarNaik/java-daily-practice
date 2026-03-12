/*
Question:
Write a Java program to print the multiplication table of a given number.
The program should take an integer as input from the user and print
its multiplication table from 1 to 10.
*/

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + num * i);
		}

		sc.close();
	}
}