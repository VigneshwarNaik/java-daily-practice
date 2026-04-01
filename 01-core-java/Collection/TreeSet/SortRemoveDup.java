/*
 * Given an array of integers, remove duplicates and return the elements in sorted order.
*/
package dsa.treeset;

import java.util.TreeSet;
import java.util.Arrays;

public class SortRemoveDup {

    public static void main(String[] args) {

        int[] arr1 = {5, 2, 8, 2, 1};

        TreeSet<Integer> set = new TreeSet<>();

        // Add elements (TreeSet removes duplicates and sorts automatically)
        for (int num : arr1) {
            set.add(num);
        }

        System.out.println("TreeSet: " + set);

        // Convert set to array
        int[] arr2 = new int[set.size()];
        int i = 0;

        for (int num : set) {
            arr2[i++] = num;
        }

        // Print final result
        System.out.println("Sorted unique array: " + Arrays.toString(arr2));
    }
}