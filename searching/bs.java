import java.util.Arrays;
import java.util.Scanner;

public class bs {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Element");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the target elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element to search for:");
        int target = sc.nextInt();

        int result = search(arr, 0, n - 1, target);

        if (result == -1) {
            System.out.println("Element not present in the array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }

    static int search(int arr[], int low, int high, int target) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                return search(arr, mid + 1, high, target);
            } else {
                return search(arr, low, mid - 1, target);
            }
        }
        return -1;
    }
}
