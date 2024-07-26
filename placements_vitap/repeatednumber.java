package placements_vitap;

import java.util.Scanner;

class Main {
    static int repeat(int n) {
        int[] digits = new int[10];

        while (n != 0) {
            int r = n % 10;
            if (digits[r] == 1) {
                return 0;
            }
            digits[r] = 1;
            n = n / 10;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int count = 0;

        for (int i = m; i <= n; i++) {
            if (repeat(i) == 1) {
                count++;
            }
        }

        System.out.println(count);
    }
}
