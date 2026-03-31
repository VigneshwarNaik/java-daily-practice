 package collection;

import java.util.Iterator;
import java.util.ArrayDeque;

public class Arraydeue {
	public static void main(String[] args) {
		// Creating an ArrayDeque object
		ArrayDeque<Object> d = new ArrayDeque<>();

		// Adding elements of different types to the deque
		d.add(10);        // Integer
		d.add("Naik");    // String
		d.add(21.3f);     // Float
		d.add(false);     // Boolean

		// --- Different ways to traverse the deque ---

		// 1. For loop using index is not possible here because ArrayDeque doesn't support random access using get(i)
		// (Hence the below code is commented out)
		/*
		for(int i=0;i<d.size();i++) {
			System.out.println(d.get(i)); // get(i) is not available in ArrayDeque
		}
		*/

		// 2. Enhanced for-loop (for-each)
		/*
		for(Object x : d) {
			System.out.println(x);
		}
		*/

		// 3. Using Iterator (forward direction)
		/*
		Iterator cursor = d.iterator();
		while(cursor.hasNext()) {
			System.out.println(cursor.next());
		}
		*/

		// 4. Using descendingIterator (reverse direction)
		Iterator cursor = d.descendingIterator();
		while(cursor.hasNext()) {
			System.out.println(cursor.next()); // Prints elements in reverse order
		}
	}
}
