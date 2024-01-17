import java.util.Scanner;

public class Bubblesort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // boolean Swapped = false;

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    //Swapped = true;
                }
            }
        }

        // // If no swapping happened, then array is already sorted
        // if (Swapped == false) {
        //     break;
        // }

        // Print the size and sorted array
        printArray(arr, n);
    }

    static void printArray(int[] arr, int size) {
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}



























// import java.util.Scanner;

// public class Bubblesort {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
        
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Bubble Sort
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = 0; j < n - i - 1; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j + 1];
//                     arr[j + 1] = arr[j];
//                     arr[j] = temp;
//                 }
//             }
//         }

//         // Print the size and sorted array
//         printArray(arr, n);
//     }

//     static void printArray(int[] arr, int size) {
//         System.out.println("Size of the array: " + size);
//         System.out.print("Sorted array: ");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }