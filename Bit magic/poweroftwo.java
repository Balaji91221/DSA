import java.util.*;
public class poweroftwo{
    static boolean isPowerofTwo(long n){
        if(n==0)
            return false;
        return ((n&(n-1))==0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        System.out.println(isPowerofTwo(n));
    }
}