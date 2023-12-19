import java.util.Scanner;
public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printIncreasing(n));
        sc.close();
    }
    public static  int printIncreasing(int n){
        if(n==1){
            return 0;
        }
        else{
            return 1 + printIncreasing(n/2);
        }
      
    }
    
}


// Path: Recursion/practice3.java
// fun(1) =0
// fun(2) =1 + fun(1) =1
// fun(4) =1 + fun(2) =1 + 1 =2
// fun(8) =1 + fun(4) =1 + 2 =3
// fun(16) =1 + fun(8) =    1 + 3 =4
// fun(32) =1 + fun(16) =   1 + 4 =5