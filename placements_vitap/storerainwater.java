package placements_vitap;
import java.util.Scanner;
public class storerainwater {
    public static int maxWater(int[] arr, int n) {
        
        int res = 0;
        for(int i=1; i<arr.length-2;i++){
            int lb = arr[i];
            for(int j=0;j<i-1;j++){
                if(arr[j]>lb){
                    lb = arr[j];
                }
            }
            int rb = arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>rb){
                    rb = arr[j];
                }
            }
            int wl = Math.min(lb,rb);
            int tw= wl-arr[i];
            res+=tw;
        }
       
        return res;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = maxWater(arr, n);
        System.out.println("Maximum water that can be stored: " + result);
    }
}