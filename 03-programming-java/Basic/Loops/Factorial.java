/*
Question: Factorial

Description:
Given a non-negative integer N, find its factorial.

Input Format:
- An integer N (0 <= N <= 100)

Output Format:
- Print the factorial of N

Example:
Input:
5
Output:
120

Input:
0
Output:
1
*/

import java.util.Scanner;

public class Factorial {
	
	public static int checkFactor(int N){
		int fact = 1;
		for(int i = 1; i <= N; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int res = checkFactor(N);
		System.out.println(res);
		sc.close();
	}
}