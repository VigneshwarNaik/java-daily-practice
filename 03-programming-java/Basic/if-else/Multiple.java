/*
Question: Check whether a number is a multiple of 3, 5, and 7
using separate methods.
*/

import java.util.Scanner;

public class Multiple {
	
	public static boolean multipleOf3(int n){
		if(n % 3 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean multipleOf5(int n){
		if(n % 5 == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static boolean multipleOf7(int n){
		if(n % 7 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(multipleOf3(n)) {
			System.out.println("Multiple of 3");
		}

		if(multipleOf5(n)) {
			System.out.println("Multiple of 5");
		}

		if(multipleOf7(n)) {
			System.out.println("Multiple of 7");
		}
		sc.close();
	}
}