
// // Write a program to find all the divisors of a given number.
// import java.util.Scanner;
// public class Divisor {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i*i<=n;i++){
//             if(n%i==0){
//                 System.out.print(i+" ");
//                 if(i!=n/i){
//                     System.out.print(n/i+" ");
//                 }
//             }
//         }//efficient approach
       
//     }
// }   

//best approach
import java.util.Scanner;
public class Divisor {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        for( i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        for(;i>=1;i--){
            if(n%i==0){
                System.out.print(n/i+" ");
            }
        }
    }
}
//Time Complexity: O(sqrt(n))
//Space Complexity: O(1)
//Input: 450
//Output: 1 2 3 5 6 9 10 15 18 25 30 45 50 75 90 150 225 450
//Input: 100
//Output: 1 2 4 5 10 20 25 50 100