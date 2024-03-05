
import java.util.Scanner;
public class SegEvenoodd{
    static node head=null;
    static class node{
        int data;
        node next;
        node(int n){
            data=n;
            next=null;
        }
    }
    static void insert(int n){
        node newnode = new node(n);
        if(head==null) head=newnode;
        else{
            node cur=head;
            while(cur.next!=null){
                cur=cur.next;
            }
            cur.next=newnode;
        }
    }
    static void display(){
        node cur=head;
        while(cur!=null){
            System.out.print(cur.data+"-->");
            cur=cur.next;
        }
        System.out.print("null");
    }
    static void seg(){
        node es=null;
        node ee=null;
        node os=null;
        node oe=null;
        node cur=head;
        while(cur!=null){
            if(cur.data%2==0){
                if(es==null) es=ee=cur;
                else{
                    ee.next=cur;
                    ee=cur;
                }
            }
            else{
                if(os==null) os=oe=cur;
                else{
                    oe.next=cur;
                    oe=cur;
                }
            }
            cur=cur.next;
        }
        if(es==null) head=os;
        else{
            head=es;
            ee.next=os;
        }
        oe.next=null;
    }


    public static void main(String ar[]){
        Scanner sw=new Scanner(System.in);
        int n=sw.nextInt();
       
        for(int i=0;i<n;i++){
            insert(sw.nextInt());
        }
        display();
        seg();
        System.out.println();
        display();
    }
}