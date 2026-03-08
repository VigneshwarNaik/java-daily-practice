/*
Question:
Count Greater Than K

Given an array of integers of size N and an integer K,
count how many elements in the array are greater than K.

Input:
First line  -> integer N (size of array)
Second line -> N space-separated integers
Third line  -> integer K

Output:
Print the count of elements greater than K.
*/

import java.util.Scanner;

public class CountGreaterK {

	public static void main(String[] args) {
		int count=0;
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr=new int[size];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>k) {
				count++;
			}
		}
		System.out.println(count);
	}

}
