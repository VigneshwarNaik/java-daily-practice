package dsa.linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class MiddleEle {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Invalid");
                return;
            }

            LinkedList<String> list = new LinkedList<>();

            for (int i = 0; i < n; i++) {
                list.add(sc.next());
            }

            if (list.isEmpty()) {
                System.out.println("List is empty");
                return;
            }

            int midIndex = list.size() / 2;

            System.out.println("Middle element: " + list.get(midIndex));
        }
    }
}