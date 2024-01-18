import java.util.Scanner;
import java.util.Arrays;

public class ls {
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

        // Linear Search
        int linearResult = linearSearch(arr, target);
        if (linearResult == -1) {
            System.out.println("Linear Search: Element not present in the array");
        } else {
            System.out.println("Linear Search: Element found at index " + linearResult);
        }

    }
    static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }


}
