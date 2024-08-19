import java.util.Scanner;
public class hallowrectangle{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int m =s.nextInt();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                if(i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
// Input: 4 5
// Output:
// *****
// *   *
// *   *
// *****
