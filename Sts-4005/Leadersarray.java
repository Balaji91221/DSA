import java.io.*;

public class Leadersarray {

    static void findLeaders(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            int j;
            for (j = i + 1; j < size; j++) {
                if (arr[i] <= arr[j])
                    break;
            }
            if (j == size) // the loop didn't break
                System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{16, 17, 4, 3, 5, 2};
        int size = arr.length;
        findLeaders(arr, size);
    }
}

