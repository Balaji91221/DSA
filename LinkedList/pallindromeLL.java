package LinkedList;
public class pallindromeLL {
    static Node head = null;
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    void insertion(int n) {
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
    static boolean pallindrome(){
        Node slow=head;
        Node fast=head;
        Node temp=null;
        Node curr =head;
        while(temp!=null){
            if(curr.data!=temp.data){
                return false;
            }

        }
    }


    public static void main(String[] args) {

        
    }
}
