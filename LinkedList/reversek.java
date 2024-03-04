package LinkedList;
import java.util.Scanner;

class LinkedList {
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

    LinkedList() {
        this.head = null;
        this.tail = null;
    }

    void insert(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
            tail=temp;
        } else {
            tail.next = temp;
            tail = tail.next;
        }
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    void revByK(int k, int size) {
    Node minusHead = new Node(-1);
    minusHead.next = head;
    head = minusHead;
    Node dummyHead = head;

    while (size >= k) {
        int i = k - 1;
        Node tempHead = dummyHead.next;
        Node prev = tempHead;
        Node curr = tempHead.next;
        while (i > 0) {
            Node next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
            i--;
        }
        tempHead.next = curr;
        dummyHead.next = prev;
        size -= k;
        dummyHead = tempHead;
    }
    head = minusHead.next;
}
}

class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    LinkedList list = new LinkedList();
    int n = -1;
    int size = 0;
    do {
    	n = sc.nextInt(); sc.nextLine();
        if (n != -1){
          list.insert(n);
          size++;
        }
    } while(n!=-1);
    
    int k = sc.nextInt();
    list.revByK(k, size);
    list.print();
  }
}