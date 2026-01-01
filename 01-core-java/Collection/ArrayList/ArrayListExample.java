package collection;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        // Creating list and adding mixed elements
        ArrayList<Object> list = new ArrayList<>();
        list.add(10);                  // Integer
        list.add("Naik");              // String
        list.add(false);               // Boolean
        list.add (22.2f);               // Float
        list.add(null);                // Null value
        list.add(10000.7777);          // Double
        list.add(0, "Vignesh");        // Insert at index 0

        // Copy all elements of list to list2
        ArrayList<Object> list2 = new ArrayList<>();
        list2.addAll(list);

        // Print list and list2
        System.out.println("List: " + list);
        System.out.println("List2: " + list2);

        // Create list3 and add some elements
        ArrayList<Object> list3 = new ArrayList<>();
        list3.add("jai");
        list3.add("Ram");

        // Add list2 elements at index 1 of list3
        list3.addAll(1, list2);

        // Add list elements again at index 1 of list3
        list3.addAll(1, list);

        // Print list3 after addAll
        System.out.println("List3 after addAll: " + list3);

        // Retain only elements that are common with list
        list3.retainAll(list);
        System.out.println("List3 after retainAll(list): " + list3);

        // Remove all elements that are present in list from list3
        list3.removeAll(list);
        System.out.println("List3 after removeAll(list): " + list3);

        // Remove the 4th index element from list
        list.remove(3);
        System.out.println("List after remove(3): " + list);
    }
}
