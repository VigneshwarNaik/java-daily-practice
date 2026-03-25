/*
 * Question:
 * Write a Java program to find the common elements (intersection)
 * between two ArrayLists of integers without duplicates.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class CommenEle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		for(int i=0;i<n1;i++) {
			list1.add(sc.nextInt());
		}
		
		int n2 = sc.nextInt();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		for(int i=0;i<n2;i++) {
			list2.add(sc.nextInt());
		}
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		for(int num:list1) {
			if(list2.contains(num) && !res.contains(num)) {
				res.add(num);
			}
		}
		sc.close();
		System.out.println(res);
	}

}
