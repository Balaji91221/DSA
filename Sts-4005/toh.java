import java.util.Scanner;

public class toh {
    static void toh1(int n,char source,char aux,char target){
        if(n==1){
            System.out.println("Move disk 1 from rod "+source+" to rod "+target);
            return ;
        }
        toh1(n-1,source,target,aux);
        System.out.println("Move disk "+n+" from rod "+source+" to rod "+target);
        toh1(n-1,aux,source,target);


    }
    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);
        int n = sw.nextInt();
        toh1(n,'A','B','C');
        

        
    }
}

// Path: Sts-4005/iterativetowerofhonoi.java
