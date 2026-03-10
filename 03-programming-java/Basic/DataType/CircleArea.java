/*
Question: Area of a Circle

Write a Java program to calculate the area of a circle.
The program should read the radius of the circle from the user
and print the area up to 4 decimal places.

Formula:
Area = pi * r * r
Where pi = 3.142
*/

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float pi=3.142f;
		int r = sc.nextInt();
		double area=pi*r*r;
		
		System.out.printf("%.4f",area);
		sc.close();
	}

}
