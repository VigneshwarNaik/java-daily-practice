/*
Question:
Given an array of n integers, write a program to print the resultant array 
such that each element of the resultant array contains the product of n-1 
elements of the given array (excluding itself).

Example:
Input:
4
1 2 3 4

Output:
24 12 8 6
*/


import java.util.Scanner;

public class ResultantArray {
	
	public static void calculateProd(int[] arr){
		int prod=1;
		for(int number:arr) {
			prod*=number;
		}
		int[] res=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			res[i]=prod/arr[i];
			System.out.println(res[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)) {
			int n = sc.nextInt();
			
			if(n<=0) {
				System.out.println("Invalid array size");
				return;
			}
			
			int[] arr=new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			calculateProd(arr);
		}
	}

}
