import java.util.Scanner;
public class practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
        sc.close();
    }
    public static void printIncreasing(int n){
        if(n==0){
            return ;
        }
        printIncreasing(n/2);
        System.out.println(n %2);
        
      
    }
    
}

