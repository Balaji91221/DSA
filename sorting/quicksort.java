import java.util.Scanner;

public class quicksort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr, 0, n - 1);

        printArray(arr, n);
    }

    static void sort(int[] arr, int low, int high) {
        if (low < high) {
           
            int partitionIndex = partition(arr, low, high);

       
            sort(arr, low, partitionIndex - 1);
            sort(arr, partitionIndex + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
           
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

       
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void printArray(int[] arr, int size) {
        System.out.print("Sorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
