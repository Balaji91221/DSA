import java.util.Scanner;

public class majorityelement {

    static int findMajorityElement(int[] arr, int n) {
        int index = 0, max = 0, count;

        for (int i = 0; i < n; i++) {
            count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > max) {
                max = count;
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 3, 3, 3, 3, 3};
        int n = arr.length;

        int majorityElementIndex = findMajorityElement(arr, n);

        int majorityElement = arr[majorityElementIndex];
        int maxCount = n / 2;
        int max = 0; // Declare the "max" variable

        if (maxCount > 0 && maxCount >= max) {
            System.out.println("Majority element: " + majorityElement);
        } else {
            System.out.println("No majority element");
        }
    }
}
