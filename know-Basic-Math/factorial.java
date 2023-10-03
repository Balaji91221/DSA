import java.util.Scanner;

class Factorial {
    public int fact(int n) { //iterative solution
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}

public class factorial {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            Factorial f = new Factorial();
            System.out.println(f.fact(n));
        }
    }
}


//rescusive
// public int fact(int n){
//     if(n==0){
//         return 1;
//     }
//     return n*fact(n-1);
// }
