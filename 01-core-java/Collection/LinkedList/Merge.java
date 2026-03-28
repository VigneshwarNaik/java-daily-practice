package dsa.linkedlist;

import java.util.LinkedList;

public class Merge {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(3);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(2);
        list2.add(4);

        list1.addAll(list2);

        System.out.println(list1);
    }
}