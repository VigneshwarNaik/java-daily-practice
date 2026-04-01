package collection;

/* headSet → left side (<)
tailSet → right side (≥)
ceiling → just ≥
floor → just ≤
higher → strict >
lower → strict < */

import java.util.TreeSet;

public class Tree {

    public static void main(String[] args) {

        // Create TreeSet (sorted automatically)
        TreeSet<Integer> tree = new TreeSet<>();

        // Add elements
        tree.add(10);
        tree.add(20);
        tree.add(30);
        tree.add(40);

        // Print sorted elements
        System.out.println(tree);  // [10, 20, 30, 40]

        // First (smallest)
        // System.out.println(tree.first());  // 10

        // Last (largest)
        // System.out.println(tree.last());   // 40

        // Elements < 30
        // System.out.println(tree.headSet(30));  // [10, 20]

        // Elements ≤ 30
        // System.out.println(tree.headSet(30, true));  // [10, 20, 30]

        // Elements ≥ 20
        // System.out.println(tree.tailSet(20));  // [20, 30, 40]

        // Elements > 20
        // System.out.println(tree.tailSet(20, false));  // [30, 40]

        // Range [20, 40)
        System.out.println(tree.subSet(20, 40));  // [20, 30]

        // Range [20, 40]
        System.out.println(tree.subSet(20, true, 40, true));  // [20, 30, 40]

        // Smallest ≥ 13
        System.out.println(tree.ceiling(13));  // 20

        // Largest ≤ 13
        System.out.println(tree.floor(13));  // 10

        // Smallest > 34
        System.out.println(tree.higher(34));  // 40

        // Largest < 34
        System.out.println(tree.lower(34));  // 30
    }
}