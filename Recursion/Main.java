import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for array a1
        int[] a1 = readArray(scanner);

        // Input for array a20.
        
        int[] a2 = readArray(scanner);

        // Apply Bubble Sort on a1 and reflect swaps on a2
        bubbleSortAndSwap(a1, a2);

        // Output the modified array a2
        for (int num : a2) {
            System.out.print(num + " ");
        }
    }

    // Function to read an integer array from the input scanner
    private static int[] readArray(Scanner scanner) {
        String[] input = scanner.nextLine().split(" ");
        int[] array = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            if (!input[i].isEmpty()) {
                array[i] = Integer.parseInt(input[i]);
            }
        }

        return array;
    }

    // Bubble Sort function with swap applied to the second array
    private static void bubbleSortAndSwap(int[] a1, int[] a2) {
        int n = a1.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a1[j] > a1[j + 1]) {
                    // Swap elements in array a2 directly
                    int temp = a2[j];
                    a2[j] = a2[j + 1];
                    a2[j + 1] = temp;
                }
            }
        }
    }
}
