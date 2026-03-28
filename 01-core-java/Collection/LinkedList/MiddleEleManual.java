package dsa.linkedlist;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class Middle {

    public static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;        // 1 step
            fast = fast.next.next;   // 2 steps
        }
        return slow;
    }
}

public class MiddleEleManual {

    public static void main(String[] args) {

        // Create LinkedList: 10 → 20 → 30 → 40 → 50
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        // Call function
        Node middle = Middle.findMiddle(head);

        // Print result
        System.out.println("Middle element: " + middle.data);
    }
}