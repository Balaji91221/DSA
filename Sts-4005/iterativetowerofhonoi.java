import java.util.Scanner;
import java.util.Stack;


public class iterativetowerofhonoi {
    static Stack<Integer> sr = new Stack<>();
    static Stack<Integer> ax = new Stack<>();
    static Stack<Integer> ds = new Stack<>();
    static void moveDisksBetweenPoles(Stack <Integer> s1,Stack <Integer> s2,char a,char b){
        int v1,v2;
        if(s1.isEmpty()){
            v1 = Integer.MIN_VALUE;
        }
        else{
            v1 = s1.pop();
        }
        if (s2.isEmpty()) {
            v2 = Integer.MIN_VALUE;
        } else {
            v2 = s2.pop();
            
        }
        if(v1==Integer.MIN_VALUE){
            s1.push(v2);
            System.err.println("The value " +v2+" moved from "+b+" to "+a);
        }
        else if(v2==Integer.MIN_VALUE){
            s2.push(v1);
            System.err.println("The value " +v1+" moved from "+a+" to "+b);
        }
        else if(v1>v2){
            s1.push(v1);
            s1.push(v2);
            System.err.println("The value " +v2+" moved from "+b+" to "+a);
        }
        else{
            s2.push(v2);
            s2.push(v1);
            System.err.println("The value " +v1+" moved from "+a+" to "+b);
        }
    }

    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);
        int n = sw.nextInt();
        for(int i=n; i>0;i--){
            sr.push(i);
        }
        char s = 'S', a = 'A', d = 'D';
        int moves = (int)Math.pow(2, n)-1;
        if(n%2==0){
            char temp = a;
            a = d;
            d = temp;
        }
        for(int i=1; i<=moves; i++){
            if(i%3==1){
                moveDisksBetweenPoles( sr,ds,s, d);
            }
            else if(i%3==2){
                moveDisksBetweenPoles(sr,ax,s, a);
            }
            else if(i%3==0){
                moveDisksBetweenPoles(ax,ds,a, d);
            }
        }
        
    }
}