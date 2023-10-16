import java.util.Scanner;
public class iterativepower {
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
        int res = 1;
        while (n > 0) {
            if (n % 2 != 0) {
                res = res * x;
            }
            x = x * x;
            n = n / 2;
        }
        return res;
    }
}