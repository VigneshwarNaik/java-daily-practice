/*
Question:
Write a Java program to find and print all the factors of a given number.

The program should take an integer as input from the user and
display all numbers that divide the given number exactly (without remainder).
*/

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}

}
