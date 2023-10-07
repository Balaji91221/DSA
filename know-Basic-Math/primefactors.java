import java.util.Scanner;
public class primefactors {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=1){
            System.out.print("No prime factors");
            return;
        }
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                System.out.print(i+" ");
                n/=i;
            }
        }
        if(n>1){
            System.out.print(n);
        }
    }
}
//450
//2 3 3 5 5
//Time Complexity: O(sqrt(n))
//Space Complexity: O(1)
