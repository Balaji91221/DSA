import java.util.Scanner;
class arm{
    public int armstrong(int n){
        int sum=0;
        int temp=n;
        while(temp>0){
            int rem=temp%10;
            sum+=rem*rem*rem;
            temp/=10;
        }
        return sum;
    }

}
public class ArmStrong{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        arm a = new arm();
        if(a.armstrong(n)==n){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
        
    }
}