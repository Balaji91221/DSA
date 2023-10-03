import java.util.Scanner;
public class trailingzero {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=2;i<=n;i++){
            fact*=i;
        }
        int count=0;
        while(fact%10==0){
            count++;
            fact/=10;
        }
        System.out.println(count);
    }
}
