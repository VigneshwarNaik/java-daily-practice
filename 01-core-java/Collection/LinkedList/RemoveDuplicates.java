package dsa.linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            LinkedList<Integer> list = new LinkedList<>();

            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }

            LinkedList<Integer> result = new LinkedList<>();

            for (int ele : list) {
                if (!result.contains(ele)) {
                    result.add(ele);
                }
            }

            System.out.println("After removing duplicates: " + result);
        }
    }
}