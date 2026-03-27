package dsa.linkedlist;

// Node class represents one element in LinkedList
class Node {
    int data;     // stores value
    Node next;    // stores reference to next node

    Node(int data) {
        this.data = data;
        next = null; 
    }
}

public class ReveseManual {

    // Method to reverse the linked list
    static Node reverse(Node head) {
        
        Node prev = null;   
        Node curr = head;   

        // loop until we reach end of list
        while (curr != null) {
            
            Node next = curr.next; // 1. SAVE next node
            
            curr.next = prev;      // 2. REVERSE link
            // now current node points backward
            
            prev = curr;           // 3. MOVE prev forward
            // prev becomes current node
            
            curr = next;           // 4. MOVE curr forward
            // go to next node in original list
        }

        // prev will be new head of reversed list
        return prev;
    }

    // Method to print linked list
    static void printList(Node head) {
        Node temp = head; // start from head
        
        while (temp != null) {
            System.out.print(temp.data + " "); // print data
            temp = temp.next; // move to next node
        }
        
        System.out.println(); // new line after printing
    }

    public static void main(String[] args) {

        // Create linked list manually: 10 → 20 → 30
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        // Print original list
        System.out.print("Original: ");
        printList(head);

        // Reverse the list
        head = reverse(head);

        // Print reversed list
        System.out.print("Reversed: ");
        printList(head);
    }
}