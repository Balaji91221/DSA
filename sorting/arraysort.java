import java.util.Arrays;

public class arraysort {

    public static void main(String args[]) {
        int[] a1 = {10, 2, 23, 40, 5};
        char[] a2 = {'e', 'b', 'a', 'c', 'd'};

        // Sorting a specific range in the integer array
        Arrays.sort(a1, 1, 4); // Sorting elements from index 1 to 3 (4-1)
        // Creating a subarray to represent the range
        int[] a1Subarray = Arrays.copyOfRange(a1, 1, 4);

        // Sorting a specific range in the char array
        Arrays.sort(a2, 2, 4); // Sorting elements from index 2 to 3 (4-1)
        // Creating a subarray to represent the range
        char[] a2Subarray = Arrays.copyOfRange(a2, 2, 4);

        System.out.println(Arrays.toString(a1Subarray));
        System.out.println(Arrays.toString(a2Subarray));
    }
}



//userinput
// import java.util.Arrays;
// import java.util.Scanner;

// public class arraysort {

//     public static void main(String args[]) {
//         Scanner scanner = new Scanner(System.in);

//         // Input for integer array
//         System.out.print("Enter the size of the integer array: ");
//         int n1 = scanner.nextInt();
//         int[] a1 = new int[n1];

//         System.out.println("Enter elements of the integer array:");
//         for (int i = 0; i < n1; i++) {
//             a1[i] = scanner.nextInt();
//         }

//         // Input for char array
//         System.out.print("Enter the size of the char array: ");
//         int n2 = scanner.nextInt();
//         char[] a2 = new char[n2];

//         System.out.println("Enter elements of the char array:");
//         for (int i = 0; i < n2; i++) {
//             a2[i] = scanner.next().charAt(0);
//         }

//         // Sorting and printing the arrays
//         Arrays.sort(a1);
//         Arrays.sort(a2);

//         System.out.println("Sorted integer array: " + Arrays.toString(a1));
//         System.out.println("Sorted char array: " + Arrays.toString(a2));
//     }
// }
