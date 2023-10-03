public class checkPrime {
    public static void main(String[] args) {
        int n = 7; // Replace with the integer you want to check
        boolean ans = isPrime(n);

        if (n != 1 && ans == true) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Non-Prime Number");
        }
    }

    static boolean isPrime(int N) {
        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }
}

