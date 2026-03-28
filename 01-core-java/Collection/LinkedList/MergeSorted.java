package dsa.linkedlist;

import java.util.LinkedList;

public class MergeSorted {
    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(3);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(2);
        list2.add(4);

        LinkedList<Integer> result = new LinkedList<>();

        while (!list1.isEmpty() && !list2.isEmpty()) {

            // Compare first elements
            if (list1.peek() < list2.peek()) {
                result.add(list1.poll()); // take from list1
            } else {
                result.add(list2.poll()); // take from list2
            }
        }

        // Step 5: Add remaining elements
        result.addAll(list1);
        result.addAll(list2);

        System.out.println("Merged Sorted List: " + result);
    }
}