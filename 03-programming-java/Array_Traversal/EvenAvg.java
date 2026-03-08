/*
Question:
Given an array of integers of size N, print the average of all the even elements present in the array.
Print the result rounded to two decimal places.
*/


import java.util.Scanner;

public class EvenAvg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0,count=0;
		int size=sc.nextInt();
		int[] arr=new int[size];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			if(arr[i]%2==0) {
				sum=sum+arr[i];
				count++;
			}
		}
		
		double avg = sum/count;

		System.out.printf("%.2f",avg);
	}
}
