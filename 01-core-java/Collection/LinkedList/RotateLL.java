package dsa.linkedlist;

import java.util.LinkedList;

public class RotateLL {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int k = 2;

        for (int i = 0; i < k; i++) {
            list.addFirst(list.removeLast());
        }

        System.out.println(list);
    }
}