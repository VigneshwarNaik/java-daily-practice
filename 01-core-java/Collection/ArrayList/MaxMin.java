/*
 * Question:
 * Write a Java program to find the maximum and minimum elements 
 * in an ArrayList of integers.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class MaxMin {
	
	public static void checkEle(ArrayList<Integer> list){
		int max=list.get(0);
		int min=list.get(0);
		
		for(int num:list) {
			if(num>max) {
				max=num;
			}
			if(num<min) {
				min=num;
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		
		checkEle(list);
		
	}

}
