package dsa.treeset;

import java.util.Arrays;
import java.util.TreeSet;

public class SecondLar {

    public static void main(String[] args) {

        int[] arr = {10, 3, 4, 5, 1};

        System.out.println("Array is: " + Arrays.toString(arr));

        TreeSet<Integer> set = new TreeSet<>();

        for (int num : arr) {
            set.add(num);
        }

        int largest = set.last();           // largest element
        int res = set.lower(largest);       // second largest

        System.out.println("Second largest: " + res);
    }
}