package LinkedList;
import java.util.Scanner;
public class segarationoddeven{
    static node head=null;
    static class node{
        int data;
        node next;
        node(int n){
            data=n;
            next=null;
        }
    }
    void insert(int n){
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
    void display(){
        node cur=head;
        while(cur!=null){
            System.out.print(cur.data+"-->");
            cur=cur.next;
        }
        System.out.print("null");
    }
    void seg(){
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
        if(oe!=null) oe.next=null;
    }
    static void reorder(node head){
        node slow=head;
        node fast=head;
        while(fast!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        node l2=slow.next;
        slow.next=null;
        l2=reverse(l2);
        node l1=head;
        node res = new node(0);
        node cur=res;
        while(l1!=null||l2!=null){
            if(l1!=null){
                cur.next=l1;
                cur=cur.next;
                l1=l1.next;
            }
            if(l2!=null){
                cur.next=l2;
                cur=cur.next;
                l2=l2.next;
            }
        }
        head=res.next;
    }

    static node reverse(node head){
        node prev=null;
        node cur=head;
        while(cur!=null){
            node next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }

    public static void main(String[] args){
        Scanner sw=new Scanner(System.in);
        int n=sw.nextInt();
        segarationoddeven l=new segarationoddeven();
        for(int i=0;i<n;i++){
            l.insert(sw.nextInt());
        }
        reorder(head);

        
        l.seg();
       
        l.display();
    }
}
