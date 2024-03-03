package LinkedList;

class Node {
    int data;
    Node next;

    Node(int n) {
        data = n;
        next = null;
    }
}

public class SimpleLL {
    public static void main(String[] args) {

        Node head = new Node(10);
        Node temp = new Node(20); // Assigning different values to nodes
        Node temp1 = new Node(30); // Assigning different values to nodes
        head.next = temp;
        temp.next = temp1;
        
        // Traversing and printing the linked list
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
