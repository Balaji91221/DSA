package LinkedList;
import java.util.*;
public class S1{
    static class Node{
       int coff;
       int expo;
       Node next;
       Node(int c, int e){
           coff = c;
           expo = e;
           next = null;
       }
    }

    static void addTerm(){
        Node newNode = new Node(0,0);
        


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        Node poly1 = null;
        for(int i=0;i<n;i++){
            int c= sc.nextInt();
            int e= sc.nextInt();
            poly1 = addTerm(poly1,c,e);
        }
        Node poly2 = null;
        for(int i=0;i<n;i++){
            int c= sc.nextInt();
            int e= sc.nextInt();
            poly2 = addTerm(poly2,c,e);
        }
        Node res= addPoly(poly1,poly2);
        display(res);
        
    }
}