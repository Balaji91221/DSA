package LinkedList;
import java.util.Scanner;

public class loopdetection {
    static class Node {
        int data;
        Node next;

        Node(int n) {
            data = n;
            next = null;
        }
    }

    static Node createLinkedList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        Node head = null;
        Node tail = null;
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        scanner.close();
        return head;
    }

    static void createLoop(Node head) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index where you want the loop to start (0-based index):");
        int loopIndex = scanner.nextInt();
        Node loopNode = head;
        while (loopIndex > 0 && loopNode != null) {
            loopNode = loopNode.next;
            loopIndex--;
        }
        if (loopNode == null) {
            System.out.println("Invalid index. Loop cannot be created.");
            return;
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = loopNode;
        System.out.println("Loop created successfully at index " + loopIndex);
    }

    static boolean detectLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Creating a linked list
        Node head = createLinkedList();

        // Creating a loop
        createLoop(head);

        // Detecting loop
        boolean loopExists = detectLoop(head);
        if (loopExists)
            System.out.println("Loop detected in the linked list.");
        else
            System.out.println("No loop detected in the linked list.");
    }
}
