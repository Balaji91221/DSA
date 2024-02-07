import java.util.Scanner;

public class maneuvering {
    static int numberOfPaths(int m, int n){
        if (m == 1 || n == 1)
            return 1;
        return numberOfPaths(m - 1, n) + numberOfPaths(m, n - 1);
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        System.out.println("Number of paths: " + numberOfPaths(rows, cols));
    }
}
