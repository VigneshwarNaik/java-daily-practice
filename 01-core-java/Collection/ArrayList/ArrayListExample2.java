package collection;

import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) {

		// Creating an ArrayList of Integer type
		ArrayList<Integer> list = new ArrayList<>();

		// Adding elements to the list
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		// Replacing the element at index 0 with 100
		list.set(0, 100);  // Now the list is [100, 20, 30, 40, 50]

		// Printing the entire list
		System.out.println(list);  // Output: [100, 20, 30, 40, 50]

		// Accessing the element at index 0
		System.out.println(list.get(0));  // Output: 100

		// Getting the size of the list
		System.out.println(list.size());  // Output: 5

		// Checking if the list is empty
		System.out.println(list.isEmpty());  // Output: false

		// Trimming the capacity of the list to match its current size
		list.trimToSize();  // Optional: improves memory efficiency
	}
}
