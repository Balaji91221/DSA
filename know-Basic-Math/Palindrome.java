import java.util.Scanner;
 class PalindromeDigit {
    public boolean countDigit(int x){
        int res = 0;
        int temp = x;
        while(x!=0){
            int digit=x%10;
            res =res*10+digit;
            x=x/10;
            
        }
        return res==temp;
    }
}
public class Palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        PalindromeDigit pd = new PalindromeDigit();
   
        if(pd.countDigit(n)){
            System.out.println("The number is a palindrome");
        }
        else{
            System.out.println("The number is not a palindrome");
        }

    }

}
