
import java.util.Scanner;

class Main {

    static void mergeSort(int[] arr, int[] temp, int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            mergeSort(arr, temp, low, middle);
            mergeSort(arr, temp, middle + 1, high);
            merge(arr, temp, low, high, middle);
        }
    }

    static void merge(int[] arr, int[] temp, int low, int high, int mid) {
        for (int i = low; i <= high; i++) {
            temp[i] = arr[i];
        }
        int i = low;
        int j = mid + 1;
        int k = low;
        while (i <= mid && j <= high) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            arr[k] = temp[i];
            i++;
            k++;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int[] temp = new int[n];
        mergeSort(arr, temp, 0, n - 1);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


// import java.util.Scanner;

// public class mergesort {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of the array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter the elements of the array: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         sort(arr, 0, n - 1);

//         printArray(arr, n);
//     }

//     static void sort(int[] arr, int left, int right) {
//         if (left < right) {
            
//             int middle = left + (right - left) / 2;

            
//             sort(arr, left, middle);
//             sort(arr, middle + 1, right);

           
//             merge(arr, left, middle, right);
//         }
//     }

//     static void merge(int[] arr, int left, int middle, int right) {
//         int n1 = middle - left + 1;
//         int n2 = right - middle;

     
//         int[] leftArray = new int[n1];
//         int[] rightArray = new int[n2];

       
//         for (int i = 0; i < n1; ++i)
//             leftArray[i] = arr[left + i];
//         for (int j = 0; j < n2; ++j)
//             rightArray[j] = arr[middle + 1 + j];

//         int i = 0, j = 0, k = left;
//         while (i < n1 && j < n2) {
//             if (leftArray[i] <= rightArray[j]) {
//                 arr[k] = leftArray[i];
//                 i++;
//             } else {
//                 arr[k] = rightArray[j];
//                 j++;
//             }
//             k++;
//         }

        
//         while (i < n1) {
//             arr[k] = leftArray[i];
//             i++;
//             k++;
//         }

//         while (j < n2) {
//             arr[k] = rightArray[j];
//             j++;
//             k++;
//         }
//     }

//     static void printArray(int[] arr, int size) {
//         System.out.print("Sorted array: ");
//         for (int i = 0; i < size; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
// }


