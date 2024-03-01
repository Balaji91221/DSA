package LinkedList;

public class loopdetection {
    class node{
        int data;
        node next;
        node(int n){
            data=n;
            next=null;
        }
    }
    static void createloop(node head){
        node f1= head;
        node f2= head;
        int count=1;
        while(f2.next!=null){
            f2=f2.next;
            count++;
            
        }
        while (count != 0){
            f1=f1.next;
            count++;
            
        }
        f2.next=f1;
    }
    static boolean detectloop(node head){
        node slow=head;
        node fast=head;
        while(slow!=null&&fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
}
