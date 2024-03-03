package LinkedList;

import java.util.Scanner;

public class RotateLL{
    static Node head = null;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static void insertion(int n) {
        Node s = new Node(n);
        if (head == null) {
            head = s;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = s;
        }
    }

    static void rotation(int rotations) {
        if (head == null || rotations == 0)
            return;

        Node current = head;
        int count = 1;
        while (count < rotations && current != null) {
            current = current.next;
            count++;
        }

        if (current == null)
            return;

        Node nthNode = current;

        while (current.next != null)
            current = current.next;

        current.next = head;
        head = nthNode.next;
        nthNode.next = null;
    }

    static void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "--> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);
        int input;
        System.out.println("Enter the elements: ");
        while ((input = sw.nextInt()) != -1) {
            insertion(input);
        }
        int rotations = sw.nextInt();

        System.out.println("Given linked list:");
        display();

        System.out.println("Rotated Linked list:");
        rotation(rotations);
        display();
    }
}

// Output
// Enter the elements:
// 1
// 2
// 3
// 4
// 5
// -1
// 2
// Given linked list:
// 1--> 2--> 3--> 4--> 5--> null
// Rotated Linked list:
// 3--> 4--> 5--> 1--> 2--> null


