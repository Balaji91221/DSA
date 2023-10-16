import java.util.Scanner;

public class computingpower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        
        if (n < 0) {
            System.out.println("Exponent should be non-negative.");
            return;
        }
        
        int result = power(x, n);
        System.out.println(result);
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int temp = power(x, n / 2);
        temp = temp * temp;

        if (n % 2 == 0) {
            return temp;
        } else {
            return temp * x;
        }
    }
}
