package LinkedList;
import java.util.Scanner;

public class SingleLinkedList {
    static Node head; // head of the list

    // Node class
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Print the linked list
    static void print(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        }
        System.out.println("null");
    }


    //insertion at the given position
    static void insertAtPosition(int data, int pos) {
        Node temp = new Node(data);
        if (pos == 1) {//pos 2 : false
            temp.next = head;//
            head = temp;// new head
        }
        Node prev = head;//
        int count =1;
        while (count < pos - 1) {
            prev = prev.next;
            count++;
        }
        Node curr = prev.next;
        temp.next = curr.next;
        curr.next = temp;
    }

    // Find the length of the linked list
    static int length(Node head) {
        Node curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    // Insertion at the end
    static void insertion(int n) {
        Node temp = new Node(n);
        if (head == null) {// if the list is empty
            head = temp;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
    }


    // Deletion at the given position
    static void deleteAtPosition(int pos) {
        if (pos == 1) {
            head = head.next;
        }
        Node prev = head;
        int count = 1;
        while (count < pos - 1) {
            prev = prev.next;
            count++;
        }
        Node curr = prev.next;
        prev.next = curr.next;
    }


    public static void main(String[] args) {
        System.out.println("Enter the number of elements in the linked list");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Enter the elements of the linked list");
        
        for (int i = 0; i < n; i++) {
            insertion(s.nextInt());
        }
       
        print(head);

        int data = s.nextInt();
        System.out.println("Enter the position:");
        int position = s.nextInt();
        insertAtPosition(data, position);
        print(head);
        System.out.println("The length of the linked list is: " + length(head));
        int data1 = s.nextInt();
        deleteAtPosition(data1);
    }
}
