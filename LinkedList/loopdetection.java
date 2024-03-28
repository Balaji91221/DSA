package LinkedList;
import java.util.Scanner;
public class loopdetection{
    static Node head=null;
    static class Node{
        int data;
        Node next;
        Node(int n){
            data=n;
            next=null;
        }
    }
    static void insert(int n){
        Node newNode=new Node(n);
        if(head==null) 
        head=newNode;
        else{
            Node cur=head;
            while(cur.next!=null){
                cur=cur.next;
            }
            cur.next=newNode;
        }
    }
   static void create(int a,int b){
       int c=0;
       Node p1=head;
       Node p2=head;
       while(p1.data!=a||c!=b){
           if(p1.data!=a) {
               p1=p1.next;
           }
           if(c!=b){
               p2=p2.next;
               ++c;
           }
       }
       p2.next=p1;
       
   }
   static boolean detect(){
       Node fast=head;
       Node slow=head;
       while(fast.next!=null&&fast.next.next!=null){
           fast=fast.next.next;
           slow=slow.next;
           if(slow==fast)
           return true;
       }
       return false;
   }

    public static void main(String ar[]){
        Scanner sw = new Scanner(System.in);
        int n=sw.nextInt();
        
        for(int i=0;i<n;i++) insert(sw.nextInt());
        int a=sw.nextInt();
        int b=n-1;
        create(a,b);
        System.out.print(detect());
        
    }
}
