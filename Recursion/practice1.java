import java.util.Scanner;
public class practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasing(n);
        sc.close();
    }
    public static void printDecreasing(int n){
        if(n==0){
            return;
        }
        printDecreasing(n-1);
        System.out.println(n);
        printDecreasing(n-1);
    }
}