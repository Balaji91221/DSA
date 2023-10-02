import java.util.Scanner;
class GCD1 {

    public int gcd(int a, int b){
      int res = Math.min(a,b);
      while(res>0){
          if(a%res==0 && b%res==0){
              break;
          }
          res--;
      }
      return res;
}
}





public class GCD {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        GCD1 g = new GCD1();
        System.out.println(g.gcd(a,b));
    }
    
}

//Euclid's Algorithm
// public int gcd(int a, int b){
    //     if(b==0){
        //         return a;
        //     }
        //     return gcd(b,a%b);
        // }


