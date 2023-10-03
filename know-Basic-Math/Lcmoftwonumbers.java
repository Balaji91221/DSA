import java.util.Scanner;
public class Lcmoftwonumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res=Math.max(a,b);
        while(true){
            if(res%a==0 && res%b==0){
                break;
            }
            res++;
        }
        System.out.println(res);
    }
    
}

//Euclid's Algorithm
// public int gcd(int a, int b){
//     if(b==0){
//         return a;
//     }
//     return gcd(b,a%b);
// }
// public int lcm(int a, int b){
//     return (a*b)/gcd(a,b);
// }

