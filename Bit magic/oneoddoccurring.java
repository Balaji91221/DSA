public class oneoddoccurring {
    static int findOdd(int arr[], int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = result ^ arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 4, 4, 4, 5, 5, 3, 3 };
        int n = arr.length;
        System.out.println(findOdd(arr, n));
    }
}