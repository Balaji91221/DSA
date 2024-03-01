package LinkedList;

class Node{
    int data;
    Node next;
    Node(int n){
        data=n;
        next=null;
    }
}
public class SimpleLL {
    public static void main(String[] args){
        
        Node head=new Node(10);
        Node temp=new Node(10);
        Node temp1=new Node(10);
        head.next=temp;
        temp.next=temp1;
        System.out.println();
    }
}
