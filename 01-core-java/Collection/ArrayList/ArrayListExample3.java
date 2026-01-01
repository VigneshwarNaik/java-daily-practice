package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample3 {

	public static void main(String[] args) {
		
		// Creating an ArrayList of Integer type
		ArrayList<Integer> list = new ArrayList<>();
		// We use ArrayList when we want a resizable array that maintains insertion order

		// Adding elements to the list
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		// 1. Using traditional for loop to access elements by index
		// Useful when you need the index or want to access elements in a controlled manner
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println();
		System.out.println();
		
		// 2. Enhanced for loop (for-each)
		// Simpler and more readable when you just want to access all elements one by one
		for(int x : list) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println();
		
		// 3. Using Iterator to traverse the list in forward direction
		// Useful when you need to remove elements safely while iterating
		Iterator cursor = list.iterator();
		while(cursor.hasNext()) {
			System.out.println(cursor.next());
		}
		
		// 4. Using ListIterator to traverse the list in reverse order
		// We start from the end using list.size() to go backward
		// ListIterator allows both forward and backward traversal
		ListIterator cursorr = list.listIterator(list.size());
		while(cursorr.hasPrevious()) {
			System.out.println(cursorr.previous());
		}
	}

}
