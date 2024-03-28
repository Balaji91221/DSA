package LinkedList;

import java.util.Scanner;

public class SLL {
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
    static void reverse(){
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null){// 10 20 30 // 20 30 // 30 // null
            next=curr.next;// storing the next node 20 // 30 // null // null
            curr.next=prev;// reversing the link 10 // 20 // 30// null
            prev=curr;// moving the prev to 10// moving the prev to 20 // moving the prev to 30
            curr=next;// moving the curr to 20// moving the curr to 30// moving the curr to null
        }
        head=prev;
    }
    static void rotate(){
        Scanner sw = new Scanner(System.in);
        System.out.println("Enter the number of rotations: ");
        int n = sw.nextInt();
        for(int i=0;i<n;i++){
            Node curr=head;
            while(curr.next.next!=null){
                curr=curr.next;
            }
            curr.next.next=head;
            head=curr.next;
            curr.next=null;
        }


    }

    static void deletion(){
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
    }



    static void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }
        System.out.println("null");

        
    }

    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sw.nextInt();
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++){
            insertion(sw.nextInt());

        }

        
        rotate();
        display();
    }
}

//write the for k reverse code
