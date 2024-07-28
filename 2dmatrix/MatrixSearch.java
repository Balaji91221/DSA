import java.util.Scanner;

public class MatrixSearch {

    static boolean search(int arr[][], int key) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == key) {
                    System.out.println("Element found at: " + i + " " + j);
                    return true;
                }
            }
        }
        System.out.println("Element not found");
        return false;
    }

    static void max(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                max = Math.max(max, arr[i][j]);
            }
        }
        System.out.println("Max element is: " + max);
    }
    static void min(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                min = Math.min(min, arr[i][j]);
            }
        }
        System.out.println("Min element is: " + min);
    }
    //print the matrix diagoal 
    static void diagonal(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Print the matrix
        System.out.println("The matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        int key = sc.nextInt();
        
        sc.close();
        
        search(arr, key);
        max(arr);
        min(arr);
        
    }
}
