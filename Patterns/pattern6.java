import java.util.Scanner;
public class pattern6 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}

//output
// 5 4 3 2 1
// 5 4 3 2
// 5 4 3
// 5 4
// 5