/*
Question:
Write a Java program to read 'n' integers into an ArrayList
and remove all duplicate elements
*/


package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class dupArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		
		ArrayList<Integer> res=new ArrayList<Integer>();
		
		for(int num:list) {
			if(!res.contains(num)) {
				res.add(num);
			}
		}
		System.out.println(res);
	}

}
