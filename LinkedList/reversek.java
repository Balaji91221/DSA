package LinkedList;
import java.util.Scanner;

public class reversek {
    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    reversek() {
        this.head = null;
        this.tail = null;
    }

    void insert(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = tail.next;
        }
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void revByK(int k) {
        if (k <= 1 || head == null) {
            return;
        }

        Node minusHead = new Node(-1);
        minusHead.next = head;
        head = minusHead;
        Node dummyHead = head;
        
        while (true) {
            Node tempHead = dummyHead;
            for (int i = 0; i < k && tempHead != null; i++) {
                tempHead = tempHead.next;
            }
            if (tempHead == null) break;

            Node prev = null, curr = dummyHead.next, next = null;
            Node tail = curr;
            for (int i = 0; i < k; i++) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            
            dummyHead.next = prev;
            tail.next = curr;
            dummyHead = tail;
        }

        head = head.next; // Remove the initial minusHead node
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reversek list = new reversek();
        int n;
        int size = 0;

        while (true) {
            n = sc.nextInt();
            if (n == -1) {
                break;
            }
            list.insert(n);
            size++;
        }

        int k = sc.nextInt();
        list.revByK(k);
        list.print();
        sc.close();
    }
}

