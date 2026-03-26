import java.util.Scanner;

/*
Question:
Given an array of n integers, write a program to print the 
maximum and minimum sum of (n-1) elements present in the array.

Example:
Input:
5
1 3 2 5 4

Output:
14   // maximum sum (exclude minimum element → 1)
10   // minimum sum (exclude maximum element → 5)
*/


public class MinMaxSum {
	
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)) {
			int sum=0;
			int n = sc.nextInt();
			
			if(n<=0) {
				System.out.println("Invalid array size");
				return;
			}
			
			int[] arr=new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			
			
			int max=arr[0],min=arr[0];
			for(int number:arr) {
				sum+=number;
				
				if(number>max) max=number;
				
				if(number<min) min=number;
			}
			
			System.out.println(sum-min);
			System.out.println(sum-max);
		}
	}

}
