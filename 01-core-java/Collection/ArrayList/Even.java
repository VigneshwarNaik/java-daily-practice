/*
Question:
Write a Java program to read 'n' integers into an ArrayList
and remove all odd numbers from the list,
so that only even numbers remain.
Print the final ArrayList.
*/

package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Even {
	
	public static void checkEven(ArrayList<Integer> list){
		
		Iterator<Integer> li = list.iterator();
		while(li.hasNext()) {
			int n = li.next();
			if(n % 2 != 0) {   // remove odd numbers
				li.remove();
			}
		}
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int n = sc.nextInt();   // number of elements
		
		for(int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		
		checkEven(list);   // call method
	}
}
