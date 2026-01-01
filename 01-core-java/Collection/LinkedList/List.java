// Package declaration (used for grouping classes)
package collection;

import java.util.LinkedList; // Importing LinkedList class from Java Collections

// Class name (avoid naming it 'List' as it can confuse with java.util.List interface)
public class List {

    public static void main(String[] args) {
        // Creating a new LinkedList (raw type - can store any object type)
        LinkedList list = new LinkedList();

        // Adding different types of elements to the LinkedList
        list.add(12);         // Integer
        list.add("Tap");      // String
        list.add(null);       // null value
        list.add(null);       // another null
        list.add(false);      // Boolean
        list.add(12.4f);      // Float

        // peek() returns the first element without removing it
        System.out.println(list.peek());       // Output: 12

        // peekLast() returns the last element without removing it
        System.out.println(list.peekLast());   // Output: 12.4

        // Printing the full list
        System.out.println(list);              // Output: [12, Tap, null, null, false, 12.4]

        System.out.println("\n");              // Just prints a blank line

        // poll() removes and returns the first element
        System.out.println(list.poll());       // Removes 12

        // pollLast() removes and returns the last element
        System.out.println(list.pollLast());   // Removes 12.4

        // offer() adds an element to the end of the list and returns true if successful
        System.out.println("offer: "+list.offer(20));    // Adds 20 at the end, returns true

        // Printing the updated list after poll and offer
        System.out.println(list);              // Output: [Tap, null, null, false, 20]
    }
}
