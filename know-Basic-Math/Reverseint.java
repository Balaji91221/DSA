import java.util.Scanner;
class Reverse {
    public  int reverse(int x) {
        int rev=0;
        while(x!=0){
            int rem=x%10;
            rev=rev*10+rem;
            if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
                return 0;
            }
            x=x/10;
        }
        System.out.println(rev);
        return rev;
    }

}

public class Reverseint {    
public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        Reverse obj = new Reverse();
        obj.reverse(x);
    }
}


//test case 
// 123
// 321
// -123
// -321