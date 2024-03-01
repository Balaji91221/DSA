package LinkedList;

public class traversySLL {
    class Node{
        int data;
        Node next;
        Node(int n){
            data=n;
            next=null;
        }
    }
    static void printlist(Node head){
        Node curr =head;
        while(curr!=null){
            System.out.println(curr.data+"-->");
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
        Node head =new Node(10);
        head.next =new Node(20);
        head.next.next=new Node(30);
        printlist(head);

    }
    
}
